package com.toddleo.functional.oj
package HackerRank.Prepare.Algorithms.Implementation

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import scala.annotation.unused


class BetweenTwoSets extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "just pass" in {
    solution(Array(2, 4), Array(16, 32, 96)) shouldBe 3
  }

  behavior of "GCD function"

  it should "return GCD of an array of Integers" in {
    GCD(Array(2, 4, 6, 8)) shouldBe 2
  }

  behavior of "LCM function"

  it should "return LCM of an array of Integers" in {
    LCM(Array(16, 32, 96)) shouldBe 96
  }

  def solution(a: Array[Int], b: Array[Int]): Int = {
    // Write your code here
    val lcmA: Int = LCM(a)
    val gcdB: Int = GCD(b)

    LazyList.from(lcmA).takeWhile(_ <= gcdB).count { i =>
      gcdB % i == 0 && i % lcmA == 0
    }

  }

  def GCD(xs: Array[Int]): Int =
    xs.reduce(gcd)

  @scala.annotation.tailrec
  private def gcd(a: Int, b: Int): Int =
    b match {
      case 0 => a
      case _ => gcd(b, (a % b))
    }

  def LCM(xs: Array[Int]): Int =
    xs.reduce(lcm)

  def lcm(a: Int, b: Int): Int =
    Math.abs(a * b) / gcd(a, b)
}
