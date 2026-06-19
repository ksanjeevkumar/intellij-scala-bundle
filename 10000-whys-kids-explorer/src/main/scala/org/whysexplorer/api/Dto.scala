package org.whysexplorer.api

import org.whysexplorer.models._
import org.whysexplorer.quiz.{QuizQuestion, QuizResult}

/** Request / Response DTOs for the REST API. */
object Dto {

  // ── REQUEST BODIES ─────────────────────────────────────────

  case class BuildQuizRequest(
    categoryId: String,
    count: Int = 5,
    difficulty: Option[String] = None,
    seed: Option[Long] = None
  )

  case class EvaluateQuizRequest(
    userId: String,
    categoryId: String,
    quiz: List[QuizQuestion],
    answers: Map[String, String]  // questionId → chosen option text
  )

  case class ViewQuestionRequest(questionId: String)

  case class FavoriteRequest(questionId: String)

  case class SessionRequest(
    durationMinutes: Int,
    questionsAnswered: Int,
    quizzesCompleted: Int
  )

  case class AddBookmarkRequest(questionId: String)

  case class CompleteDailyChallengeRequest(userId: String, date: String)

  case class BulkImportRequest(questions: List[QuestionDraftDto])

  case class QuestionDraftDto(
    categoryId: String,
    text: String,
    answer: String,
    difficulty: String,
    imageUrl: Option[String] = None,
    animationUrl: Option[String] = None,
    audioNarrationUrl: Option[String] = None,
    funFacts: List[String] = Nil,
    tags: List[String] = Nil,
    ageMin: Int = 4,
    ageMax: Int = 12
  )

  case class ParentalGateVerifyRequest(answer: String)

  case class SafeModeRequest(enabled: Boolean)

  case class DownloadRequest(categoryId: String)

  case class NotificationRequest(userId: String)

  // ── RESPONSE BODIES ────────────────────────────────────────

  case class QuestionResponse(
    id: String,
    categoryId: String,
    text: String,
    answer: String,
    difficulty: String,
    imageUrl: Option[String],
    animationUrl: Option[String],
    audioNarrationUrl: Option[String],
    funFacts: List[String],
    tags: List[String],
    ageMin: Int,
    ageMax: Int
  )

  case class CategoryResponse(
    id: String,
    name: String,
    description: String,
    mascotName: String,
    mascotImageUrl: String,
    backgroundColorHex: String,
    questionCount: Int,
    phase: Int
  )

  case class ProgressResponse(
    userId: String,
    completedTopicsCount: Int,
    answeredQuestionsCount: Int,
    recentlyViewed: List[String],
    favorites: List[String],
    totalStarsEarned: Int,
    timeSpentTodayMinutes: Int,
    bookmarkCollections: Map[String, List[String]]
  )

  case class StreakResponse(
    userId: String,
    currentStreak: Int,
    longestStreak: Int,
    isActiveToday: Boolean
  )

  case class QuizResultResponse(
    userId: String,
    categoryId: String,
    totalQuestions: Int,
    correctAnswers: Int,
    starsEarned: Int,
    passed: Boolean,
    scorePercent: Int
  )

  case class ContentStatsResponse(questionsByCategory: Map[String, Int], total: Int)

  case class ErrorResponse(code: String, message: String)

  // ── MAPPERS ────────────────────────────────────────────────

  def toResponse(q: Question): QuestionResponse = QuestionResponse(
    q.id, q.categoryId, q.text, q.answer,
    q.difficulty.getClass.getSimpleName.replace("$",""),
    q.imageUrl, q.animationUrl, q.audioNarrationUrl,
    q.funFacts, q.tags, q.ageMin, q.ageMax
  )

  def toResponse(c: Category): CategoryResponse = CategoryResponse(
    c.id, c.name, c.description, c.mascotName,
    c.mascotImageUrl, c.backgroundColorHex, c.questionCount, c.phase
  )

  def toResponse(p: UserProgress): ProgressResponse = ProgressResponse(
    p.userId, p.completedTopics.size, p.answeredQuestions.size,
    p.recentlyViewed.toList, p.favorites.toList, p.totalStarsEarned,
    p.timeSpentToday,
    p.bookmarkCollections.map { case (k, v) => k -> v.toList }
  )

  def toResponse(s: StreakRecord): StreakResponse = StreakResponse(
    s.userId, s.currentStreak, s.longestStreak, s.isActiveToday
  )

  def toResponse(r: QuizResult): QuizResultResponse = QuizResultResponse(
    r.userId, r.categoryId, r.totalQuestions, r.correctAnswers,
    r.starsEarned, r.passed, r.scorePercent
  )
}
