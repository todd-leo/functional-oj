package com.toddleo.functional.oj
package HackerRank.Practice.FunctionalProgramming.AdHoc

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import scala.io.StdIn.{readInt, readLine}


/**
 * Problem: Rotate String
 * Difficulty: Easy
 * Link: https://www.hackerrank.com/challenges/rotate-string
 */
class RotateString extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "return all rotations of a string" in {
    RotateString("abc") should contain theSameElementsInOrderAs Seq("bca", "cab", "abc")
    RotateString("abcde") should contain theSameElementsInOrderAs Seq("bcdea", "cdeab", "deabc", "eabcd", "abcde")
    RotateString("abab") should contain theSameElementsInOrderAs Seq("baba", "abab", "baba", "abab")
    RotateString("aaa") should contain theSameElementsInOrderAs Seq("aaa", "aaa", "aaa")
    RotateString("z") should contain theSameElementsInOrderAs Seq("z")
  }

}

object RotateString {
  def main(args: Array[String]): Unit =
    (1 to readInt).map { _ => apply(readLine).mkString(" ") }
      .foreach(println)

  def apply(str: String): Seq[String] = {
    str.foldLeft(Seq.empty[String]) { case (acc, _) =>
      val rotated: String = acc match {
        case empty if empty.isEmpty => rotateOnce(str)
        case _ => rotateOnce(acc.last)
      }
      acc :+ rotated
    }
  }

  def rotateOnce(seq: String): String =
    seq.tail :+ seq.head
}
