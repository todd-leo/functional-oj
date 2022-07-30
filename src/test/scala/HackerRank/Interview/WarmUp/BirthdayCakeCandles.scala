package com.toddleo.functional.oj
package HackerRank.Interview.WarmUp

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class BirthdayCakeCandles extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "just pass" in {
    solution(Array(4, 4, 1, 3)) shouldBe 2
  }


  def solution(candles: Array[Int]): Int = {
    // Write your code here
    val max = candles.max
    candles.count(_ == max)
  }

}
