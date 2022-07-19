package com.toddleo.functional.oj
package Codility.Lessons

import Codility.Lessons.Lesson2_OddOccurrencesInArray.solution

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Lesson2_OddOccurrencesInArray extends AnyFlatSpec with Matchers {
  it should "just pass" in {
    solution(Array(9, 3, 9, 3, 9, 7, 9)) shouldBe 7
  }
}

object Lesson2_OddOccurrencesInArray {
  // https://stackoverflow.com/a/66858734/9254747
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    val b: Map[Int, Array[Int]] = a.groupBy(identity)
    b.collectFirst{ case (_, j: Array[Int]) if j.length==1 => j.head}.get
  }
}
