package org.whysexplorer.safety

import org.whysexplorer.models.User

object COPPACompliance {

  private val MinAgeForDataCollection = 13

  sealed trait ComplianceDecision
  case object Allowed             extends ComplianceDecision
  case object RequiresParentalConsent extends ComplianceDecision
  case object Blocked             extends ComplianceDecision

  def checkDataCollection(user: User, userAge: Int): ComplianceDecision =
    if (userAge >= MinAgeForDataCollection) Allowed
    else if (user.parentEmail.isDefined) RequiresParentalConsent
    else Blocked

  def anonymiseUserId(rawId: String): String = {
    import java.security.MessageDigest
    val digest = MessageDigest.getInstance("SHA-256")
    digest.digest(rawId.getBytes("UTF-8")).take(8).map("%02x".format(_)).mkString
  }

  def isPersonalDataAllowed(userAge: Int): Boolean = userAge >= MinAgeForDataCollection

  def safeSessionId(): String = java.util.UUID.randomUUID().toString
}
