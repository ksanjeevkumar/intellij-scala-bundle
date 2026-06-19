# 10,000 Whys – Kids Explorer
## Complete Professional Feature List

---

## 🧭 1. Home & Navigation

| Feature | Component | Status |
|---|---|---|
| Home Dashboard | `HomeScreen` — grid of categories + daily question card | Phase 1 |
| Category Browser | Illustrated 3×3 grid with mascot icons | Phase 1 |
| Search Bar | Keyword + auto-suggest via `QuestionService.search()` | Phase 1 |
| Recently Viewed | Last 10 questions stored in `UserProgress.recentlyViewed` | Phase 1 |
| Favorites | Save/unsave toggle, synced to `UserProgress.favorites` | Phase 1 |

---

## 📚 2. Question & Answer Engine

| Feature | Component | Status |
|---|---|---|
| Illustrated Q&A Cards | `Question` model with `imageUrl`, `explanation` fields | Phase 1 |
| Tap-to-Reveal Answers | UI state: `hidden → revealed`, tracked per session | Phase 1 |
| Audio Narration | `AudioService.playNarration(questionId, speed)` | Phase 1 |
| Mini Animations | `animationUrl` field on `Question`; looping GIF/Lottie | Phase 1 |
| Fun Facts | `funFacts: List[String]` on each `Question` | Phase 1 |
| Difficulty Levels | `DifficultyLevel` enum: Simple / Medium / Advanced | Phase 1 |

---

## 🗂️ 3. Categories

| Category | Mascot | Target Count |
|---|---|---|
| Animals | Owl "Ollie" | 500 |
| Space & Universe | Rocket "Nova" | 300 |
| Human Body | Robot "Bodie" | 400 |
| Earth & Nature | Leaf "Terra" | 350 |
| Everyday Science | Bulb "Sparky" | 500 |
| Technology & Machines | Gear "Gizmo" | 250 |
| Plants & Environment | Sprout "Fern" | 200 |
| History & Culture | Scroll "Chrono" | 200 |
| Food & Daily Life | Chef "Yumi" | 300 |

Each category ships with:
- 100–500 questions (phased rollout)
- Category mascot SVG illustration
- Category-specific background color theme
- Intro animation clip

---

## 🎨 4. Visual & UI Features

| Feature | Details |
|---|---|
| Illustration Style | Flat, rounded, pastel — consistent design system |
| Large Buttons & Icons | Minimum tap target 48×48 dp |
| Color Themes | Light / Dark / Kids-Mode (high contrast pastels) |
| Animated Transitions | Slide + bounce, 300ms, respects reduced-motion OS flag |
| Accessibility Mode | Font size ×1.5, OpenDyslexic font option, screen-reader labels |

---

## 🔊 5. Audio & Voice Features

| Feature | Component |
|---|---|
| Narration | `AudioService` — MP3 per question, streamed or cached |
| Sound Effects | Triggered on card flip, star earn, quiz correct/wrong |
| Voice Search | Optional; uses device STT; off by default |
| Slow-Mode Narration | 0.75× playback speed toggle for younger kids |

---

## 🧩 6. Interactive Learning Features

| Feature | Component |
|---|---|
| Mini Quizzes | `QuizEngine` — 3–5 MCQ per topic, scored out of 5 |
| Progress Stars | `Achievement` model; stars awarded per topic completion |
| Daily Challenge | `DailyChallenge` — seeded by date, one new "Why?" per day |
| Streak Rewards | `StreakTracker` — consecutive daily logins rewarded |
| Avatar Customization | Unlockable hats, accessories based on `Achievement` milestones |

---

## 👨‍👩‍👧 7. Parent & Teacher Dashboard

| Feature | Component |
|---|---|
| Progress Tracking | `LearningReport` — topics completed, questions answered |
| Time Spent Reports | `SessionLog` — per-day usage in minutes |
| Content Filters | `ContentFilterService` — restrict categories by age tier |
| Bookmark Collections | Named collections, shareable as PDF export |
| Offline Downloads | `DownloadManager` — queues categories for offline use |

---

## 🌐 8. Multi-Language Support

| Language | Phase |
|---|---|
| English | Phase 1 |
| Hindi | Phase 2 |
| Spanish | Phase 2 |
| Arabic | Phase 2 |
| Chinese (Simplified) | Phase 2 |

All text + audio narration translated per language via `TranslationService`.

---

## 📡 9. Backend & Admin Features

| Feature | Component |
|---|---|
| Content Management | `AdminService` — CRUD for questions, categories, media |
| Image & Animation Library | CDN-backed asset store, referenced by URL in `Question` |
| User Analytics Dashboard | `UserAnalytics` — DAU, retention, question completion rates |
| Push Notifications | `NotificationService` — daily challenge reminders |

---

## 🔐 10. Safety & Compliance

| Rule | Enforcement |
|---|---|
| COPPA Compliance | `COPPACompliance` — no PII collected under age 13 |
| No Ads in Kids Mode | `SafeMode` flag disables all ad slots |
| No Personal Data Collection | Anonymous session IDs only |
| Safe Mode | `SafeMode` — all external links blocked |
| Parental Gate | 3-digit math challenge before accessing settings |

---

## 📦 11. Offline & Performance

| Feature | Component |
|---|---|
| Offline Categories | `DownloadManager.downloadCategory(categoryId)` |
| Lightweight Assets | Max 50KB per illustration; AVIF/WebP |
| Question Cache | `CacheManager` — LRU cache, 200-question limit |
| Low-End Device Support | Animations disabled on <2GB RAM devices |

---

## 🚀 12. Phase 3+ Expansion

| Feature | Notes |
|---|---|
| AR Mode | Camera → image recognition → context-aware "Why?" answers |
| AI Ask-Me-Why Chat | Kid-safe LLM with strict content guardrails |
| Teacher Classroom Mode | Class codes, group progress, assignment mode |
| Printable Worksheets | PDF export of topic summary + quiz results |

---

## Implementation Checklist

- [ ] Data models (`models/` package)
- [ ] Question & Category services
- [ ] Quiz engine
- [ ] Sample content (Animals + Space seed data)
- [ ] Safety layer (COPPA, SafeMode, ParentalGate)
- [ ] i18n framework
- [ ] Offline cache & download manager
- [ ] Analytics & reporting
- [ ] Admin CMS stubs
- [ ] Unit tests for quiz engine & safety layer
