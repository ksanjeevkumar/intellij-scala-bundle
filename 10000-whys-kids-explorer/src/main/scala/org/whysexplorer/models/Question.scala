package org.whysexplorer.models

sealed trait DifficultyLevel
object DifficultyLevel {
  case object Simple   extends DifficultyLevel
  case object Medium   extends DifficultyLevel
  case object Advanced extends DifficultyLevel
}

case class Question(
  id: String,
  categoryId: String,
  text: String,
  answer: String,
  difficulty: DifficultyLevel,
  imageUrl: Option[String],
  animationUrl: Option[String],
  audioNarrationUrl: Option[String],
  funFacts: List[String],
  tags: List[String],
  ageMin: Int = 4,
  ageMax: Int = 12,
  phase: Int = 1
)
