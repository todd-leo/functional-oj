package com.toddleo.functional.oj
package Codility.Lessons

import Codility.Lessons.Lesson2_CyclicRotation.solution

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Lesson2_CyclicRotation extends AnyFlatSpec with Matchers {

  it should "just pass" in {
    solution(Array(3, 8, 9, 7, 6), 1) should contain theSameElementsInOrderAs Array(6, 3, 8, 9, 7)
    solution(Array(3, 8, 9, 7, 6), 3) should contain theSameElementsInOrderAs Array(9, 7, 6, 3, 8)
    solution(Array(3, 8, 9, 7, 6), 6) should contain theSameElementsInOrderAs Array(6, 3, 8, 9, 7)
    solution(Array(), 1) should contain theSameElementsInOrderAs Array.empty[Int]
  }

}

object Lesson2_CyclicRotation {
  def solution(a: Array[Int], k: Int): Array[Int] = {
    // write your code in Scala 2.12
    if (k == 0 || a.isEmpty) a
    else {
      val rotateTimes = k % a.length
      val (h, t) = a.splitAt(a.length - rotateTimes)
      t ++ h
    }
  }
}
