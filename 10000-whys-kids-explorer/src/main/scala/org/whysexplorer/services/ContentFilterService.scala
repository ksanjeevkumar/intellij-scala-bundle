package org.whysexplorer.services

import org.whysexplorer.models.{AgeGroup, Question}

case class ContentFilter(
  userId: String,
  allowedCategories: Set[String],
  maxDifficultyAge: Int,         // restrict advanced content above this age
  dailyTimeLimitMinutes: Int
)

class ContentFilterService {

  def defaultFilter(ageGroup: AgeGroup): ContentFilter = ageGroup match {
    case AgeGroup.Toddler => ContentFilter(
      userId = "",
      allowedCategories = Set("animals", "food", "plants"),
      maxDifficultyAge = 5,
      dailyTimeLimitMinutes = 20
    )
    case AgeGroup.Early => ContentFilter(
      userId = "",
      allowedCategories = Set("animals", "space", "human-body", "earth-nature",
                              "everyday-science", "food", "plants"),
      maxDifficultyAge = 8,
      dailyTimeLimitMinutes = 40
    )
    case AgeGroup.Middle => ContentFilter(
      userId = "",
      allowedCategories = Set("animals","space","human-body","earth-nature",
                              "everyday-science","technology","plants","history","food"),
      maxDifficultyAge = 12,
      dailyTimeLimitMinutes = 60
    )
  }

  def isAllowed(question: Question, filter: ContentFilter): Boolean =
    filter.allowedCategories.contains(question.categoryId) &&
    question.ageMin <= filter.maxDifficultyAge

  def filterQuestions(questions: List[Question], filter: ContentFilter): List[Question] =
    questions.filter(isAllowed(_, filter))
}
