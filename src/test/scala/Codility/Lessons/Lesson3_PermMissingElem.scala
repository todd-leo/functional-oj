package com.toddleo.functional.oj
package Codility.Lessons


import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Lesson3_PermMissingElem extends AnyFlatSpec with Matchers {
  import Lesson3_PermMissingElem.solution
  it should "just pass" in {
    solution(Array(2,3,1,5)) shouldBe 4
    solution(Array.empty[Int]) shouldBe 1
    solution(Array(2)) shouldBe 1
  }
}

object Lesson3_PermMissingElem {
  /**
   * https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
   * @param a 乱序数组
   * @return 缺失的数
   */
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    Range.inclusive(1, a.length + 1).sum - a.sum
  }
}
