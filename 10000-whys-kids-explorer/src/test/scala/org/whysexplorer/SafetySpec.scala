package org.whysexplorer

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import org.whysexplorer.models.{AgeGroup, Avatar, User}
import org.whysexplorer.safety.{COPPACompliance, ParentalGate, SafeMode}

class SafetySpec extends AnyWordSpec with Matchers {

  "ParentalGate" should {

    "generate a challenge with a correct answer" in {
      val challenge = ParentalGate.generateChallenge()
      ParentalGate.verify(challenge, challenge.answer.toString) shouldBe true
    }

    "reject a wrong answer" in {
      val challenge = ParentalGate.generateChallenge()
      val wrong     = (challenge.answer + 7).toString
      ParentalGate.verify(challenge, wrong) shouldBe false
    }

    "reject non-numeric input gracefully" in {
      val challenge = ParentalGate.generateChallenge()
      ParentalGate.verify(challenge, "abc") shouldBe false
    }
  }

  "SafeMode" should {

    "block external URLs when enabled" in {
      SafeMode.enable()
      SafeMode.sanitizeUrl("https://external.com/ad") shouldBe None
    }

    "allow internal asset URLs when enabled" in {
      SafeMode.enable()
      SafeMode.sanitizeUrl("/assets/img.png") shouldBe Some("/assets/img.png")
    }

    "allow external URLs when disabled" in {
      SafeMode.disable()
      SafeMode.sanitizeUrl("https://external.com") shouldBe Some("https://external.com")
      SafeMode.enable()  // restore default
    }
  }

  "COPPACompliance" should {

    "block data collection for under-13 without parent email" in {
      val user = User("u1", "Kid", AgeGroup.Early)
      COPPACompliance.checkDataCollection(user, userAge = 7) shouldBe COPPACompliance.Blocked
    }

    "require parental consent for under-13 with parent email" in {
      val user = User("u2", "Kid2", AgeGroup.Middle, parentEmail = Some("parent@example.com"))
      COPPACompliance.checkDataCollection(user, userAge = 10) shouldBe COPPACompliance.RequiresParentalConsent
    }

    "allow data collection for 13 and above" in {
      val user = User("u3", "Teen", AgeGroup.Middle)
      COPPACompliance.checkDataCollection(user, userAge = 13) shouldBe COPPACompliance.Allowed
    }

    "produce consistent anonymised IDs" in {
      val id1 = COPPACompliance.anonymiseUserId("user-abc")
      val id2 = COPPACompliance.anonymiseUserId("user-abc")
      id1 shouldBe id2
    }

    "produce different anonymised IDs for different inputs" in {
      val id1 = COPPACompliance.anonymiseUserId("user-abc")
      val id2 = COPPACompliance.anonymiseUserId("user-xyz")
      id1 should not be id2
    }
  }
}
