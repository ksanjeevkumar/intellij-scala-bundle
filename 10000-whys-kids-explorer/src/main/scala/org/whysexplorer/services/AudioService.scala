package org.whysexplorer.services

import org.whysexplorer.models.Question

sealed trait PlaybackSpeed { def multiplier: Double }
object PlaybackSpeed {
  case object Slow   extends PlaybackSpeed { val multiplier = 0.75 }
  case object Normal extends PlaybackSpeed { val multiplier = 1.0  }
  case object Fast   extends PlaybackSpeed { val multiplier = 1.25 }
}

sealed trait SoundEffect
object SoundEffect {
  case object CardFlip    extends SoundEffect
  case object StarEarned  extends SoundEffect
  case object QuizCorrect extends SoundEffect
  case object QuizWrong   extends SoundEffect
  case object StreakBonus extends SoundEffect
}

trait AudioPlayer {
  def play(url: String, speed: Double): Unit
  def stop(): Unit
}

class AudioService(player: AudioPlayer) {

  def playNarration(question: Question, speed: PlaybackSpeed = PlaybackSpeed.Normal): Unit =
    question.audioNarrationUrl.foreach(url => player.play(url, speed.multiplier))

  def playNarrationById(questionId: String, audioUrl: String, speed: PlaybackSpeed): Unit =
    player.play(audioUrl, speed.multiplier)

  def playSoundEffect(effect: SoundEffect): Unit = {
    val url = s"/assets/sfx/${effectFileName(effect)}"
    player.play(url, 1.0)
  }

  def stop(): Unit = player.stop()

  private def effectFileName(effect: SoundEffect): String = effect match {
    case SoundEffect.CardFlip    => "card-flip.mp3"
    case SoundEffect.StarEarned  => "star-earned.mp3"
    case SoundEffect.QuizCorrect => "quiz-correct.mp3"
    case SoundEffect.QuizWrong   => "quiz-wrong.mp3"
    case SoundEffect.StreakBonus => "streak-bonus.mp3"
  }
}
