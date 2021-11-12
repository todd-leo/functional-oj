package com.toddleo.functional.oj
package HackerRank.Practice.FunctionalProgramming.AdHoc

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import scala.io.StdIn.{readInt, readLine}


/**
 * Problem: String Compression
 * Difficulty: Easy
 * Link: https://www.hackerrank.com/challenges/string-compression/
 */
class StringCompression extends AnyFlatSpec with Matchers {

  behavior of "String Compression"

  it should "Print the string msg as a compressed message." in {
    StringCompression("abcaaabbb") shouldBe "abca3b3"
    StringCompression("abcd") shouldBe "abcd"
    StringCompression("aaabaaaaccaaaaba") shouldBe "a3ba4c2a4ba"
  }

}

object StringCompression {

  def main(args: Array[String]) = {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
    println(apply(scala.io.StdIn.readLine))
  }

  def apply(str: String): String = {
    str.foldRight(Seq.empty[(Char, Int)]) {
      case (char, acc) if acc.isEmpty =>
        (char, 1) +: acc
      case (char, (_char, i) :: tail) if char == _char =>
        (char, i + 1) +: tail
      case (ch, (_ch, i) :: tail) if ch != _ch =>
        val acc = (_ch, i) +: tail
        (ch, 1) +: acc
    }.map { case (c, n) =>
      n match {
        case 1 => s"$c"
        case _ => s"$c$n"
      }
    }.mkString
  }

}
