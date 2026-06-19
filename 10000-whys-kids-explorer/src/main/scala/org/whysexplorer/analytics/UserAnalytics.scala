package org.whysexplorer.analytics

import java.time.LocalDate
import org.whysexplorer.models.{SessionLog, UserProgress}

case class CategoryEngagement(
  categoryId: String,
  questionsViewed: Int,
  completionRate: Double
)

case class AppMetrics(
  date: LocalDate,
  dailyActiveUsers: Int,
  questionsAnsweredTotal: Int,
  quizzesCompletedTotal: Int,
  averageSessionMinutes: Double,
  topCategory: String
)

class UserAnalytics {

  def learningReport(progress: UserProgress, totalQuestionsInApp: Int): Map[String, Any] = {
    val completionPct =
      if (totalQuestionsInApp == 0) 0.0
      else progress.answeredQuestions.size.toDouble / totalQuestionsInApp * 100

    Map(
      "totalQuestionsAnswered" -> progress.answeredQuestions.size,
      "completionPercent"      -> f"$completionPct%.1f",
      "totalStars"             -> progress.totalStarsEarned,
      "topicsCompleted"        -> progress.completedTopics.size,
      "favoriteCount"          -> progress.favorites.size
    )
  }

  def timeSpentThisWeek(logs: List[SessionLog]): Map[LocalDate, Int] = {
    val lastWeek = (0 until 7).map(LocalDate.now().minusDays(_)).toSet
    logs
      .filter(l => lastWeek.contains(l.date))
      .groupBy(_.date)
      .map { case (d, ls) => d -> ls.map(_.durationMinutes).sum }
  }

  def categoryEngagement(
    answeredIds: Set[String],
    questionsByCategory: Map[String, List[String]]
  ): List[CategoryEngagement] =
    questionsByCategory.map { case (catId, qIds) =>
      val viewed = qIds.count(answeredIds.contains)
      val rate   = if (qIds.isEmpty) 0.0 else viewed.toDouble / qIds.size
      CategoryEngagement(catId, viewed, rate)
    }.toList.sortBy(-_.questionsViewed)
}
