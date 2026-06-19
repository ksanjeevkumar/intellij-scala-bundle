package org.whysexplorer.admin

import org.whysexplorer.models.{Category, DifficultyLevel, Question}

case class QuestionDraft(
  categoryId: String,
  text: String,
  answer: String,
  difficulty: DifficultyLevel,
  imageUrl: Option[String],
  animationUrl: Option[String],
  audioNarrationUrl: Option[String],
  funFacts: List[String],
  tags: List[String],
  ageMin: Int = 4,
  ageMax: Int = 12
)

trait QuestionStore {
  def findById(id: String): Option[Question]
  def findByCategory(categoryId: String): List[Question]
  def save(q: Question): Question
  def delete(id: String): Boolean
}

class AdminService(store: QuestionStore) {

  def createQuestion(draft: QuestionDraft): Question = {
    val id = s"${draft.categoryId}-${java.util.UUID.randomUUID().toString.take(8)}"
    val q  = Question(
      id                = id,
      categoryId        = draft.categoryId,
      text              = draft.text,
      answer            = draft.answer,
      difficulty        = draft.difficulty,
      imageUrl          = draft.imageUrl,
      animationUrl      = draft.animationUrl,
      audioNarrationUrl = draft.audioNarrationUrl,
      funFacts          = draft.funFacts,
      tags              = draft.tags,
      ageMin            = draft.ageMin,
      ageMax            = draft.ageMax
    )
    store.save(q)
  }

  def updateQuestion(id: String, draft: QuestionDraft): Option[Question] =
    store.findById(id).map { existing =>
      store.save(existing.copy(
        text              = draft.text,
        answer            = draft.answer,
        difficulty        = draft.difficulty,
        imageUrl          = draft.imageUrl,
        animationUrl      = draft.animationUrl,
        audioNarrationUrl = draft.audioNarrationUrl,
        funFacts          = draft.funFacts,
        tags              = draft.tags
      ))
    }

  def deleteQuestion(id: String): Boolean = store.delete(id)

  def listByCategory(categoryId: String): List[Question] = store.findByCategory(categoryId)

  def bulkImport(drafts: List[QuestionDraft]): List[Question] = drafts.map(createQuestion)

  def contentStats(): Map[String, Int] =
    Category.all.map(c => c.id -> store.findByCategory(c.id).size).toMap
}
