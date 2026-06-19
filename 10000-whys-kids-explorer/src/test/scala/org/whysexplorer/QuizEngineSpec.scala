package org.whysexplorer

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import org.whysexplorer.content.SampleQuestions
import org.whysexplorer.quiz.QuizEngine

class QuizEngineSpec extends AnyWordSpec with Matchers {

  "QuizEngine.buildQuiz" should {

    "return at most the requested number of questions" in {
      val quiz = QuizEngine.buildQuiz(SampleQuestions.animals, count = 3, seed = 1L)
      quiz.size should be <= 3
    }

    "give every question exactly 4 options" in {
      val quiz = QuizEngine.buildQuiz(SampleQuestions.animals, count = 5, seed = 2L)
      quiz.foreach(_.options should have size 4)
    }

    "mark exactly one option as correct per question" in {
      val quiz = QuizEngine.buildQuiz(SampleQuestions.animals, count = 5, seed = 3L)
      quiz.foreach { q =>
        q.options.count(_.isCorrect) shouldBe 1
      }
    }

    "return an empty quiz when the source list is empty" in {
      val quiz = QuizEngine.buildQuiz(Nil, count = 5)
      quiz shouldBe empty
    }
  }

  "QuizEngine.evaluate" should {

    "award full marks when all answers are correct" in {
      val quiz    = QuizEngine.buildQuiz(SampleQuestions.animals, count = 5, seed = 10L)
      val answers = quiz.map(q => q.questionId -> q.options.find(_.isCorrect).map(_.text).getOrElse("")).toMap
      val result  = QuizEngine.evaluate("u1", "animals", quiz, answers)
      result.correctAnswers shouldBe quiz.size
      result.passed         shouldBe true
      result.starsEarned    shouldBe 3
    }

    "score zero when all answers are wrong" in {
      val quiz    = QuizEngine.buildQuiz(SampleQuestions.animals, count = 5, seed = 11L)
      val answers = quiz.map(q => q.questionId -> "definitely-wrong-answer").toMap
      val result  = QuizEngine.evaluate("u1", "animals", quiz, answers)
      result.correctAnswers shouldBe 0
      result.passed         shouldBe false
      result.starsEarned    shouldBe 0
    }

    "handle an empty answer map gracefully" in {
      val quiz   = QuizEngine.buildQuiz(SampleQuestions.animals, count = 3, seed = 12L)
      val result = QuizEngine.evaluate("u1", "animals", quiz, Map.empty)
      result.correctAnswers shouldBe 0
    }
  }
}
