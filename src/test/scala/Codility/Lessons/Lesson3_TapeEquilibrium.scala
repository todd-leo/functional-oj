package com.toddleo.functional.oj
package Codility.Lessons

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import scala.collection.mutable.ListBuffer

class Lesson3_TapeEquilibrium extends AnyFlatSpec with Matchers {
  import Lesson3_TapeEquilibrium._
  it should "just pass" in {
    solution(Array(3, 1, 2, 4, 3)) shouldBe 1
    solution2(Array(3, 1, 2, 4, 3)) shouldBe 1
  }
}

object Lesson3_TapeEquilibrium {
  /**
   * https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
   * @param a 纸带, 长度 [2-100,000], 取值 [-1000, 1000]
   * @return 分割位置的左右最小差
   */
  def solution(a: Array[Int]): Int = {
    // 性能不好
    // write your code in Scala 2.12
    Range.inclusive(1, a.length - 1).map{ p =>
      val (left, right) = a.splitAt(p)
      Math.abs(left.sum - right.sum)
    }.min
  }

  /**
   * still slow
   * Overall 53%, Correctness 100%, Performance 0%
   */
  def solution2(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    var min = Int.MaxValue
    var left: ListBuffer[Int] = ListBuffer(a(0))
    var right: ListBuffer[Int] = ListBuffer(a.tail: _*)
    Range.inclusive(1, a.length - 1).foreach{ _ =>
      val diff = Math.abs(left.sum - right.sum)
      if (diff < min)
        min = diff
      left += right.head
      right.remove(0)
    }
    min
  }
}

