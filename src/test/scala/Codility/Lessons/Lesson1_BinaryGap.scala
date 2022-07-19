package com.toddleo.functional.oj
package Codility.Lessons


import Codility.Lessons.Lesson1_BinaryGap.solution

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Lesson1_BinaryGap extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "just pass" in {
    solution(5) shouldBe 1
    solution(15) shouldBe 0
    solution(32) shouldBe 0
  }

}

object Lesson1_BinaryGap {
  def solution(n: Int): Int = {
    // write your code in Scala 2.12
    var zeros = Integer.toBinaryString(n).split("1", -1).toList // limit 小于0，不移除尾部的分隔
    zeros = if (zeros.nonEmpty && (zeros.head.contains("0") || zeros.head.isEmpty)) zeros.drop(1) else zeros
    zeros = if (zeros.nonEmpty && zeros.last.contains("0")) zeros.dropRight(1) else zeros
    zeros = zeros.dropWhile(_ == "")
    if (zeros.isEmpty)
      0
    else zeros.map(_.length).max
  }
}
