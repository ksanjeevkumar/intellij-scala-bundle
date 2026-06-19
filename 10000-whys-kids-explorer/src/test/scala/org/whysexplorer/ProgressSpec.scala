package org.whysexplorer

import java.time.LocalDate
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import org.whysexplorer.models.{StreakRecord, UserProgress}

class ProgressSpec extends AnyWordSpec with Matchers {

  "UserProgress.addRecentlyViewed" should {

    "keep only the last 10 questions" in {
      val p = (1 to 12).foldLeft(UserProgress("u1")) { (prog, i) =>
        prog.addRecentlyViewed(s"q-$i")
      }
      p.recentlyViewed should have size 10
      p.recentlyViewed.head shouldBe "q-12"
    }

    "deduplicate — re-viewing moves question to front" in {
      val p = UserProgress("u1")
        .addRecentlyViewed("q-1")
        .addRecentlyViewed("q-2")
        .addRecentlyViewed("q-1")
      p.recentlyViewed.head shouldBe "q-1"
      p.recentlyViewed.count(_ == "q-1") shouldBe 1
    }
  }

  "UserProgress.toggleFavorite" should {

    "add a question to favorites" in {
      val p = UserProgress("u1").toggleFavorite("q-1")
      p.favorites should contain("q-1")
    }

    "remove a question already in favorites" in {
      val p = UserProgress("u1").toggleFavorite("q-1").toggleFavorite("q-1")
      p.favorites should not contain "q-1"
    }
  }

  "StreakRecord.advanceStreak" should {

    "increment streak on consecutive days" in {
      val streak = StreakRecord("u1", 3, 3, LocalDate.now().minusDays(1))
      val next   = streak.advanceStreak()
      next.currentStreak  shouldBe 4
      next.longestStreak  shouldBe 4
      next.lastActiveDate shouldBe LocalDate.now()
    }

    "reset streak after a missed day" in {
      val streak = StreakRecord("u1", 5, 10, LocalDate.now().minusDays(2))
      val next   = streak.advanceStreak()
      next.currentStreak shouldBe 1
      next.longestStreak shouldBe 10  // longest preserved
    }

    "not double-advance on same day" in {
      val streak = StreakRecord("u1", 3, 3, LocalDate.now())
      streak.advanceStreak().currentStreak shouldBe 3
    }
  }
}
