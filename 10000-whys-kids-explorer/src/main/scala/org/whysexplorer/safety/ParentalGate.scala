package org.whysexplorer.safety

import scala.util.Random

case class GateChallenge(a: Int, b: Int, operator: Char) {
  val answer: Int = operator match {
    case '+' => a + b
    case '-' => a - b
    case _   => a + b
  }
  val prompt: String = s"What is $a $operator $b?"
}

object ParentalGate {

  def generateChallenge(): GateChallenge = {
    val a  = Random.nextInt(10) + 1
    val b  = Random.nextInt(10) + 1
    val op = if (Random.nextBoolean()) '+' else '-'
    val (x, y) = if (op == '-' && b > a) (b, a) else (a, b)
    GateChallenge(x, y, op)
  }

  def verify(challenge: GateChallenge, userInput: String): Boolean =
    userInput.trim.toIntOption.contains(challenge.answer)
}
