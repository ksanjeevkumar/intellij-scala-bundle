package org.whysexplorer.services

import java.time.LocalDate

sealed trait NotificationType
object NotificationType {
  case object DailyChallenge extends NotificationType
  case object StreakReminder  extends NotificationType
  case object NewContent      extends NotificationType
}

case class Notification(
  userId: String,
  notificationType: NotificationType,
  title: String,
  body: String,
  scheduledFor: java.time.LocalTime,
  date: LocalDate = LocalDate.now()
)

trait PushGateway {
  def send(notification: Notification): Boolean
}

class NotificationService(gateway: PushGateway) {

  def scheduleDailyChallenge(userId: String, questionPreview: String): Notification = {
    val n = Notification(
      userId           = userId,
      notificationType = NotificationType.DailyChallenge,
      title            = "Today's Why is here! 🌟",
      body             = s"Why $questionPreview",
      scheduledFor     = java.time.LocalTime.of(9, 0)
    )
    gateway.send(n)
    n
  }

  def scheduleStreakReminder(userId: String, currentStreak: Int): Notification = {
    val n = Notification(
      userId           = userId,
      notificationType = NotificationType.StreakReminder,
      title            = s"Keep your $currentStreak-day streak alive! 🔥",
      body             = "Open the app and explore a Why today!",
      scheduledFor     = java.time.LocalTime.of(18, 0)
    )
    gateway.send(n)
    n
  }
}
