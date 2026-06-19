package org.whysexplorer.models

import java.time.LocalDate

sealed trait AgeGroup
object AgeGroup {
  case object Toddler  extends AgeGroup  // 3–5
  case object Early    extends AgeGroup  // 6–8
  case object Middle   extends AgeGroup  // 9–12
}

case class Avatar(
  baseId: String,
  unlockedHats: List[String] = Nil,
  unlockedAccessories: List[String] = Nil,
  equippedHat: Option[String] = None,
  equippedAccessory: Option[String] = None
)

case class User(
  id: String,
  displayName: String,
  ageGroup: AgeGroup,
  preferredLanguage: String = "en",
  avatar: Avatar = Avatar("default"),
  parentEmail: Option[String] = None,
  createdAt: LocalDate = LocalDate.now()
)
