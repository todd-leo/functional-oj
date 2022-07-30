package com.toddleo.functional.oj
package HackerRank.Prepare.Algorithms.Implementation

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class GradingStudents extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "just pass" in {
    solution(Array(73, 67, 38, 33)) should contain theSameElementsInOrderAs Seq(75, 67, 40, 33)
  }

  def solution(grades: Array[Int]): Array[Int] = {
    // Write your code here
    grades.map {
      case m if m < 38 => m
      case _ @ o => o % 5 match {
        case r if r >= 3 => o + 5 - r
        case _           => o
      }
    }
  }

}
