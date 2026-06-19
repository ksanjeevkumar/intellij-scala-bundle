package org.whysexplorer.i18n

sealed trait Language {
  def code: String
  def displayName: String
  def nativeName: String
  def phase: Int
  def isRTL: Boolean
}

object Language {
  case object English  extends Language { val code = "en"; val displayName = "English";            val nativeName = "English";  val phase = 1; val isRTL = false }
  case object Hindi    extends Language { val code = "hi"; val displayName = "Hindi";              val nativeName = "हिन्दी";   val phase = 2; val isRTL = false }
  case object Spanish  extends Language { val code = "es"; val displayName = "Spanish";            val nativeName = "Español";  val phase = 2; val isRTL = false }
  case object Arabic   extends Language { val code = "ar"; val displayName = "Arabic";             val nativeName = "العربية";  val phase = 2; val isRTL = true  }
  case object Chinese  extends Language { val code = "zh"; val displayName = "Chinese (Simp.)";    val nativeName = "中文";     val phase = 2; val isRTL = false }

  val all: List[Language] = List(English, Hindi, Spanish, Arabic, Chinese)

  val phase1: List[Language] = all.filter(_.phase == 1)

  def fromCode(code: String): Option[Language] = all.find(_.code == code)
}
