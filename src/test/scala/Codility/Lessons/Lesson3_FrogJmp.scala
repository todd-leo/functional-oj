package com.toddleo.functional.oj
package Codility.Lessons

import Codility.Lessons.Lesson3_FrogJmp.solution

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Lesson3_FrogJmp extends AnyFlatSpec with Matchers {
  it should "just pass" in {
    solution(10, 85, 30) shouldBe 3
    solution(5, 1000000000, 2) shouldBe 499999998
  }
}

object Lesson3_FrogJmp {
  /**
   * https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
   * 当然不能用 while 循环做了，会超时
   * @param x 初始位置
   * @param y 结束位置
   * @param d 步长
   * @return 步数
   */
  def solution(x: Int, y: Int, d: Int): Int = {
    // write your code in Scala 2.12
    Math.ceil((y - x) / d.toDouble).toInt
  }
}
