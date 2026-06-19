package org.whysexplorer.models

import java.time.LocalDate

sealed trait AchievementType
object AchievementType {
  case object TopicComplete  extends AchievementType
  case object QuizPerfect    extends AchievementType
  case object StreakReached  extends AchievementType
  case object DailyChallenge extends AchievementType
  case object CategoryMaster extends AchievementType
}

case class Achievement(
  id: String,
  userId: String,
  achievementType: AchievementType,
  label: String,
  description: String,
  iconUrl: String,
  starCount: Int,
  unlockedAt: LocalDate,
  avatarRewardId: Option[String] = None
)

case class StreakRecord(
  userId: String,
  currentStreak: Int,
  longestStreak: Int,
  lastActiveDate: LocalDate
) {
  def isActiveToday: Boolean = lastActiveDate == LocalDate.now()

  def advanceStreak(): StreakRecord =
    if (isActiveToday) this
    else if (lastActiveDate == LocalDate.now().minusDays(1))
      copy(
        currentStreak  = currentStreak + 1,
        longestStreak  = math.max(longestStreak, currentStreak + 1),
        lastActiveDate = LocalDate.now()
      )
    else
      copy(currentStreak = 1, lastActiveDate = LocalDate.now())
}
