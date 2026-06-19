package org.whysexplorer.models

import java.time.{LocalDate, LocalDateTime}

case class SessionLog(
  userId: String,
  date: LocalDate,
  durationMinutes: Int,
  questionsAnswered: Int,
  quizzesCompleted: Int
)

case class UserProgress(
  userId: String,
  completedTopics: Set[String]          = Set.empty,
  answeredQuestions: Set[String]        = Set.empty,
  recentlyViewed: Vector[String]        = Vector.empty,  // question IDs, max 10
  favorites: Set[String]                = Set.empty,
  totalStarsEarned: Int                 = 0,
  sessionLogs: List[SessionLog]         = Nil,
  bookmarkCollections: Map[String, Set[String]] = Map.empty
) {
  def addRecentlyViewed(questionId: String): UserProgress = {
    val updated = (questionId +: recentlyViewed.filterNot(_ == questionId)).take(10)
    copy(recentlyViewed = updated)
  }

  def toggleFavorite(questionId: String): UserProgress =
    if (favorites.contains(questionId)) copy(favorites = favorites - questionId)
    else copy(favorites = favorites + questionId)

  def timeSpentToday: Int =
    sessionLogs
      .filter(_.date == LocalDate.now())
      .map(_.durationMinutes)
      .sum
}

case class DailyChallenge(
  date: LocalDate,
  questionId: String,
  completedByUserIds: Set[String] = Set.empty
) {
  def isCompletedBy(userId: String): Boolean = completedByUserIds.contains(userId)
}
