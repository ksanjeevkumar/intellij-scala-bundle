package org.whysexplorer.services

import java.time.LocalDate
import org.whysexplorer.models._

trait ProgressRepository {
  def findByUser(userId: String): Option[UserProgress]
  def save(progress: UserProgress): UserProgress
  def findStreak(userId: String): Option[StreakRecord]
  def saveStreak(streak: StreakRecord): StreakRecord
}

class ProgressService(repo: ProgressRepository) {

  def getOrCreate(userId: String): UserProgress =
    repo.findByUser(userId).getOrElse(UserProgress(userId))

  def recordQuestionViewed(userId: String, questionId: String): UserProgress = {
    val p = getOrCreate(userId).addRecentlyViewed(questionId)
    repo.save(p.copy(answeredQuestions = p.answeredQuestions + questionId))
  }

  def toggleFavorite(userId: String, questionId: String): UserProgress = {
    val p = getOrCreate(userId)
    repo.save(p.toggleFavorite(questionId))
  }

  def markTopicComplete(userId: String, topicId: String, starsEarned: Int): UserProgress = {
    val p = getOrCreate(userId)
    repo.save(p.copy(
      completedTopics = p.completedTopics + topicId,
      totalStarsEarned = p.totalStarsEarned + starsEarned
    ))
  }

  def addBookmark(userId: String, collectionName: String, questionId: String): UserProgress = {
    val p = getOrCreate(userId)
    val updated = p.bookmarkCollections + (collectionName ->
      (p.bookmarkCollections.getOrElse(collectionName, Set.empty) + questionId))
    repo.save(p.copy(bookmarkCollections = updated))
  }

  def logSession(userId: String, durationMinutes: Int, questionsAnswered: Int, quizzesCompleted: Int): UserProgress = {
    val p = getOrCreate(userId)
    val log = SessionLog(userId, LocalDate.now(), durationMinutes, questionsAnswered, quizzesCompleted)
    repo.save(p.copy(sessionLogs = log :: p.sessionLogs))
  }

  def advanceStreak(userId: String): StreakRecord = {
    val streak = repo.findStreak(userId).getOrElse(
      StreakRecord(userId, currentStreak = 0, longestStreak = 0, lastActiveDate = LocalDate.now().minusDays(1))
    )
    repo.saveStreak(streak.advanceStreak())
  }

  def weeklyReport(userId: String): Map[LocalDate, Int] = {
    val p = getOrCreate(userId)
    val lastWeek = (0 until 7).map(LocalDate.now().minusDays(_)).toSet
    p.sessionLogs
      .filter(s => lastWeek.contains(s.date))
      .groupBy(_.date)
      .map { case (date, logs) => date -> logs.map(_.durationMinutes).sum }
  }
}
