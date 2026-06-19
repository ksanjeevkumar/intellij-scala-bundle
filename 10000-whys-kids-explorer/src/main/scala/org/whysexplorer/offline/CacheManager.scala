package org.whysexplorer.offline

import org.whysexplorer.models.Question
import scala.collection.mutable

class CacheManager(maxSize: Int = 200) {

  private val cache: mutable.LinkedHashMap[String, Question] =
    new mutable.LinkedHashMap[String, Question]()

  def get(questionId: String): Option[Question] = cache.get(questionId)

  def put(question: Question): Unit = {
    if (cache.size >= maxSize) {
      cache.remove(cache.keys.head)
    }
    cache.put(question.id, question)
  }

  def putAll(questions: List[Question]): Unit = questions.foreach(put)

  def invalidate(questionId: String): Unit = cache.remove(questionId)

  def clear(): Unit = cache.clear()

  def size: Int = cache.size

  def contains(questionId: String): Boolean = cache.contains(questionId)

  def cachedIds: Set[String] = cache.keySet.toSet
}
