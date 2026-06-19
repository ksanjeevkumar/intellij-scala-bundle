package org.whysexplorer.api

/**
 * REST API route definitions for the 10,000 Whys Kids Explorer.
 * Wire these against Akka HTTP, Play, or http4s as needed.
 *
 * Base path: /api/v1
 */
object Routes {

  // ── QUESTIONS ─────────────────────────────────────────────
  // GET  /questions/:id                  → Question
  // GET  /questions?categoryId=&diff=    → List[Question]
  // GET  /questions/search?q=&limit=     → List[Question]  (auto-suggest when limit=5)
  // GET  /questions/daily?date=YYYY-MM-DD → Question
  //
  // POST /questions          (admin auth)  → Question
  // PUT  /questions/:id      (admin auth)  → Question
  // DELETE /questions/:id    (admin auth)  → 204

  // ── CATEGORIES ────────────────────────────────────────────
  // GET  /categories                     → List[Category]
  // GET  /categories/:id                 → Category
  // GET  /categories/:id/questions       → List[Question]

  // ── QUIZ ──────────────────────────────────────────────────
  // POST /quiz/build  body:{categoryId,count,difficulty?,seed?}  → List[QuizQuestion]
  // POST /quiz/evaluate  body:{userId,categoryId,quiz:[],answers:{}}  → QuizResult

  // ── PROGRESS ──────────────────────────────────────────────
  // GET  /users/:userId/progress         → UserProgress
  // POST /users/:userId/progress/view    body:{questionId}        → UserProgress
  // POST /users/:userId/progress/favorite body:{questionId}       → UserProgress
  // POST /users/:userId/progress/session  body:{durationMinutes,questionsAnswered,quizzesCompleted}
  // GET  /users/:userId/progress/weekly  → Map[date,minutes]
  // GET  /users/:userId/streak           → StreakRecord

  // ── BOOKMARKS ─────────────────────────────────────────────
  // GET  /users/:userId/bookmarks                        → Map[collectionName, List[Question]]
  // POST /users/:userId/bookmarks/:collection body:{questionId}
  // DELETE /users/:userId/bookmarks/:collection/:questionId

  // ── DAILY CHALLENGE ───────────────────────────────────────
  // GET  /daily?date=YYYY-MM-DD          → DailyChallenge
  // POST /daily/complete body:{userId,date}              → DailyChallenge

  // ── ACHIEVEMENTS ──────────────────────────────────────────
  // GET  /users/:userId/achievements     → List[Achievement]

  // ── OFFLINE ───────────────────────────────────────────────
  // POST /offline/download/:categoryId   → DownloadJob
  // GET  /offline/status/:categoryId     → DownloadStatus

  // ── NOTIFICATIONS ─────────────────────────────────────────
  // POST /notifications/daily-challenge  body:{userId}   → Notification
  // POST /notifications/streak-reminder  body:{userId}   → Notification

  // ── ADMIN ─────────────────────────────────────────────────
  // GET  /admin/stats                    → Map[categoryId, Int]
  // POST /admin/questions/bulk           body:[QuestionDraft]   → List[Question]
  // GET  /admin/analytics                → AppMetrics

  // ── AUTH & SAFETY ─────────────────────────────────────────
  // POST /parental-gate/challenge        → GateChallenge
  // POST /parental-gate/verify  body:{challengeId, answer}   → Boolean
  // GET  /safe-mode              → {enabled: Boolean}
  // PUT  /safe-mode  body:{enabled}  (requires parental gate pass)

  // ── TRANSLATIONS ──────────────────────────────────────────
  // GET  /translations/:questionId?lang=en → {text, answer, audioUrl}
  // GET  /languages                        → List[Language]
}
