package org.whysexplorer

import org.whysexplorer.content.SampleQuestions
import org.whysexplorer.models.{Category, DifficultyLevel, User, AgeGroup, Avatar}
import org.whysexplorer.quiz.QuizEngine
import org.whysexplorer.safety.{COPPACompliance, ParentalGate, SafeMode}
import org.whysexplorer.i18n.Language

object Main extends App {

  println("=" * 60)
  println("  10,000 Whys – Kids Explorer  |  Demo Run")
  println("=" * 60)

  // --- 1. Categories ---
  println(s"\n📚 ${Category.all.size} categories loaded:")
  Category.all.foreach(c => println(s"  • ${c.name} (${c.questionCount} questions) — mascot: ${c.mascotName}"))

  // --- 2. Sample Q&A ---
  println(s"\n🔍 Sample questions loaded: ${SampleQuestions.all.size}")
  SampleQuestions.all.take(3).foreach { q =>
    println(s"\n  Q [${q.categoryId}]: ${q.text}")
    println(s"  A: ${q.answer.take(80)}...")
    println(s"  Fun fact: ${q.funFacts.headOption.getOrElse("—")}")
  }

  // --- 3. Quiz Engine ---
  println("\n🧩 Running quiz on Animals questions...")
  val quiz    = QuizEngine.buildQuiz(SampleQuestions.animals, count = 3, seed = 42L)
  val answers = quiz.map(q => q.questionId -> q.options.find(_.isCorrect).map(_.text).getOrElse("")).toMap
  val result  = QuizEngine.evaluate("demo-user", "animals", quiz, answers)
  println(s"  Score: ${result.correctAnswers}/${result.totalQuestions} — Stars earned: ${result.starsEarned} ⭐")
  println(s"  Passed: ${result.passed}")

  // --- 4. Safety Layer ---
  println("\n🔐 Safety checks:")
  val challenge = ParentalGate.generateChallenge()
  println(s"  Parental gate challenge: ${challenge.prompt}")
  println(s"  Answer ${challenge.answer} valid? ${ParentalGate.verify(challenge, challenge.answer.toString)}")
  println(s"  Safe mode enabled: ${SafeMode.isEnabled}")
  println(s"  External URL blocked: ${SafeMode.sanitizeUrl("https://external.com").isEmpty}")
  println(s"  Internal URL allowed: ${SafeMode.sanitizeUrl("/assets/img.png").isDefined}")

  // --- 5. Languages ---
  println("\n🌐 Supported languages:")
  Language.all.foreach(l => println(s"  • ${l.displayName} (${l.code}) — Phase ${l.phase}${if (l.isRTL) " RTL" else ""}"))

  // --- 6. COPPA ---
  val user = User("u1", "Timmy", AgeGroup.Early)
  val decision = COPPACompliance.checkDataCollection(user, userAge = 7)
  println(s"\n🛡️  COPPA decision for age 7 without parent email: $decision")
  val anonId = COPPACompliance.anonymiseUserId("u1")
  println(s"  Anonymised user ID: $anonId")

  println("\n✅ Demo complete. Build the UI on top of these components!")
}
