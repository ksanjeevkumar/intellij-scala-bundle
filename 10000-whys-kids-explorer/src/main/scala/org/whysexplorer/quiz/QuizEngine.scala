package org.whysexplorer.quiz

import org.whysexplorer.models.{DifficultyLevel, Question}

case class QuizOption(text: String, isCorrect: Boolean)

case class QuizQuestion(
  questionId: String,
  prompt: String,
  options: List[QuizOption],
  explanation: String
)

case class QuizResult(
  userId: String,
  categoryId: String,
  totalQuestions: Int,
  correctAnswers: Int,
  starsEarned: Int,
  passed: Boolean
) {
  def scorePercent: Int = if (totalQuestions == 0) 0 else (correctAnswers * 100) / totalQuestions
}

object QuizEngine {

  private val PassThreshold = 60 // percent

  def buildQuiz(
    sourceQuestions: List[Question],
    count: Int = 5,
    difficulty: Option[DifficultyLevel] = None,
    seed: Long = System.currentTimeMillis()
  ): List[QuizQuestion] = {
    val pool = difficulty.fold(sourceQuestions)(d => sourceQuestions.filter(_.difficulty == d))
    val rng  = new scala.util.Random(seed)
    rng.shuffle(pool).take(count).map(toQuizQuestion(_, pool, rng))
  }

  def evaluate(
    userId: String,
    categoryId: String,
    quiz: List[QuizQuestion],
    answers: Map[String, String]  // questionId -> chosen option text
  ): QuizResult = {
    val correct = quiz.count { q =>
      answers.get(q.questionId).exists { chosen =>
        q.options.find(_.text == chosen).exists(_.isCorrect)
      }
    }
    val pct   = if (quiz.isEmpty) 0 else (correct * 100) / quiz.size
    val stars = starsForScore(pct)
    QuizResult(userId, categoryId, quiz.size, correct, stars, passed = pct >= PassThreshold)
  }

  private def starsForScore(pct: Int): Int = pct match {
    case p if p >= 90 => 3
    case p if p >= 70 => 2
    case p if p >= 60 => 1
    case _            => 0
  }

  private def toQuizQuestion(q: Question, pool: List[Question], rng: scala.util.Random): QuizQuestion = {
    val correct = QuizOption(q.answer, isCorrect = true)
    val distractors = rng.shuffle(pool.filterNot(_.id == q.id)).take(3)
      .map(d => QuizOption(d.answer, isCorrect = false))
    val options = rng.shuffle(correct :: distractors)
    QuizQuestion(q.id, q.text, options, q.answer)
  }
}
