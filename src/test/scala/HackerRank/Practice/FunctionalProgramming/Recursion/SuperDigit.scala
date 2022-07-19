package com.toddleo.functional.oj
package HackerRank.Practice.FunctionalProgramming.Recursion

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


/**
 * Problem: Super Digit
 * Difficulty: Medium
 * Link: https://www.hackerrank.com/challenges/super-digit
 */
class SuperDigit extends AnyFlatSpec with Matchers {

  behavior of "Naive Lesson1_BinaryGap to SuperDigit"

  it should "work on simple test cases" in {
    SuperDigit("148 3", optimize = NoOptimize) shouldBe 3
  }

  behavior of "Optimized Lesson1_BinaryGap to SuperDigit"

  it should "work on really test cases of really large numbers" in {
    SuperDigit("7404954009694227446246375747227852213692570890717884174001587537145838723390362624487926131161112710" +
      "5891274230989593270205440033957924826251917216033283077749981243896410698846340868491385150792207504623173574" +
      "8776278048057664068917534695613566845183548049008996240677326756965066392777886776431521128062503338827151826" +
      "4961090111547480467065229843613873499846390257375933040086863430523668050046930387013897062106309406874425001" +
      "1278905749866100180938596934555184132689143618590006149044619024428225775529976800983891830826546250988174113" +
      "0698501065875676215216090427816949163480746435613087752639272543208643993400672891441106186123530097953619010" +
      "0734360684054557448454640750198466877185875290011114667186730452681943043971812380628117527172389889545776779" +
      "5556648264885203252347926484486252253645350536055153867309250700728960046454167136820046006365743890406628271" +
      "8269633718761090469402922188080137286404034556723094111098602856837271097046011649198370031224309067953749713" +
      "9499778923997433720159174153 100000") shouldBe 3
  }

}

sealed trait Optimize

case object NoOptimize extends Optimize
case object RecursiveOptimize extends Optimize

object SuperDigit {

  def main(args: Array[String]) = {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Lesson1_BinaryGap */
    println(SuperDigit(scala.io.StdIn.readLine))
  }

  def apply(parameterLine: String, optimize: Optimize = RecursiveOptimize): Int = {
    val parameterList = parameterLine.split(" ")
    val k: String = parameterList.head
    val n: Int = parameterList.last.toInt

    optimize match {
      case RecursiveOptimize => optimizedSuperDigit(k, n)
      case NoOptimize        => naiveSuperDigit(List.fill(n)(k).mkString(""))
    }

  }

  @scala.annotation.tailrec
  def naiveSuperDigit(x: String): Int = {
    x.length match {
      // If x has only  digit, then its super digit is P.
      case 1 => x.toInt
      // Otherwise, the super digit of x is equal to the super digit of the digit-sum of x.
      // Here, digit-sum of a number is defined as the sum of its digits.
      case _ => naiveSuperDigit(x.map(_.asDigit).sum.toString)
    }
  }

  def optimizedSuperDigit(k: String, n: Int): Int = {
    val sDigitOfK = (naiveSuperDigit(k) * n).toString
    naiveSuperDigit(sDigitOfK)
  }

}
