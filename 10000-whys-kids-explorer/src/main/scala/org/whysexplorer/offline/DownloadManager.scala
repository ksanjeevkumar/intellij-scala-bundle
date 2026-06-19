package org.whysexplorer.offline

import org.whysexplorer.models.{Category, Question}

sealed trait DownloadStatus
object DownloadStatus {
  case object Pending    extends DownloadStatus
  case object InProgress extends DownloadStatus
  case object Complete   extends DownloadStatus
  case object Failed     extends DownloadStatus
}

case class DownloadJob(
  categoryId: String,
  status: DownloadStatus,
  totalItems: Int,
  downloadedItems: Int
) {
  def progressPercent: Int =
    if (totalItems == 0) 0 else (downloadedItems * 100) / totalItems
}

trait AssetFetcher {
  def fetchQuestions(categoryId: String): List[Question]
  def fetchAsset(url: String): Array[Byte]
}

class DownloadManager(fetcher: AssetFetcher, cache: CacheManager) {

  private val jobs = scala.collection.mutable.Map[String, DownloadJob]()

  def downloadCategory(categoryId: String): DownloadJob = {
    val questions  = fetcher.fetchQuestions(categoryId)
    val initialJob = DownloadJob(categoryId, DownloadStatus.InProgress, questions.size, 0)
    jobs(categoryId) = initialJob

    val downloaded = questions.foldLeft(0) { (count, q) =>
      cache.put(q)
      q.imageUrl.foreach(fetcher.fetchAsset)
      q.audioNarrationUrl.foreach(fetcher.fetchAsset)
      count + 1
    }

    val done = initialJob.copy(status = DownloadStatus.Complete, downloadedItems = downloaded)
    jobs(categoryId) = done
    done
  }

  def statusFor(categoryId: String): DownloadStatus =
    jobs.get(categoryId).map(_.status).getOrElse(DownloadStatus.Pending)

  def isOfflineAvailable(categoryId: String): Boolean =
    statusFor(categoryId) == DownloadStatus.Complete

  def allJobs: Map[String, DownloadJob] = jobs.toMap
}
