package com.toddleo.functional.oj
package HackerRank.PreperationKits.OneWeek.Day5

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import scala.collection.immutable.Queue


class BalancedBrackets extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  import BalancedBrackets.isBalanced

  it should "just pass" in {
    isBalanced("{[()]}") shouldBe "YES"
  }

}

object BalancedBrackets {

  /*
   * Complete the 'isBalanced' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts STRING s as parameter.
   */

  def isBalanced(s: String): String = {
    // Write your code here
    val stack: Seq[Char] = s.foldLeft(Seq.empty[Char]) { case (acc: Seq[Char], i: Char) =>
      acc match {
        case Nil => Nil :+ i
        case singular :: Nil => isPair(singular, i) match {
          case true  => Nil
          case false => Nil :+ singular :+ i
        }
        case heads :+ tail => isPair(tail, i) match {
          case true  => heads
          case false => heads :+ tail :+ i
        }
      }
    }
    stack.length match {
      case 0 => "YES"
      case _ => "NO"
    }

  }

  def isPair(x: Char, y: Char): Boolean = (x, y) match {
    case _ if x == '(' && y == ')' => true
    case _ if x == '[' && y == ']' => true
    case _ if x == '{' && y == '}' => true
    case _ => false
  }


}

