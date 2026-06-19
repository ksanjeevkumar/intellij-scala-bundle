package org.whysexplorer.i18n

trait TranslationStore {
  def get(key: String, languageCode: String): Option[String]
  def put(key: String, languageCode: String, value: String): Unit
}

class TranslationService(store: TranslationStore) {

  def translate(key: String, languageCode: String, fallback: String = ""): String =
    store.get(key, languageCode)
      .orElse(store.get(key, Language.English.code))
      .getOrElse(fallback)

  def translateQuestion(questionId: String, field: String, languageCode: String): Option[String] =
    store.get(s"question.$questionId.$field", languageCode)

  def audioUrlFor(questionId: String, languageCode: String): Option[String] =
    store.get(s"audio.$questionId", languageCode)

  def availableLanguagesFor(questionId: String): List[Language] =
    Language.all.filter(lang =>
      store.get(s"question.$questionId.text", lang.code).isDefined
    )

  def isTranslated(questionId: String, languageCode: String): Boolean =
    store.get(s"question.$questionId.text", languageCode).isDefined
}
