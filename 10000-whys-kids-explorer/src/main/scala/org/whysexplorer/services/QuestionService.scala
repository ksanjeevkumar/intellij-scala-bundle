package org.whysexplorer.services

import org.whysexplorer.models.{Category, DifficultyLevel, Question}

trait QuestionRepository {
  def findById(id: String): Option[Question]
  def findByCategory(categoryId: String): List[Question]
  def findByDifficulty(level: DifficultyLevel): List[Question]
  def save(question: Question): Question
  def delete(id: String): Boolean
}

class QuestionService(repo: QuestionRepository) {

  def getQuestion(id: String): Option[Question] = repo.findById(id)

  def getByCategory(categoryId: String): List[Question] =
    repo.findByCategory(categoryId)

  def search(keyword: String, categoryId: Option[String] = None): List[Question] = {
    val kw = keyword.toLowerCase.trim
    val base = categoryId.fold(Category.all.flatMap(c => repo.findByCategory(c.id)))(
      id => repo.findByCategory(id)
    )
    base.filter { q =>
      q.text.toLowerCase.contains(kw) ||
      q.tags.exists(_.toLowerCase.contains(kw))
    }
  }

  def autoSuggest(prefix: String, limit: Int = 5): List[String] =
    search(prefix).map(_.text).take(limit)

  def getDailyQuestion(seed: Long): Option[Question] = {
    val all = Category.all.flatMap(c => repo.findByCategory(c.id))
    if (all.isEmpty) None
    else Some(all((seed % all.size).toInt.abs))
  }

  def getByDifficulty(level: DifficultyLevel): List[Question] =
    repo.findByDifficulty(level)
}
