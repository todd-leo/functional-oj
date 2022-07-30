package com.toddleo.functional.oj
package HackerRank.Interview.WarmUp

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class CompareTheTriplets extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "just pass" in {
    solution(Array(1, 2, 3), Array(3, 2, 1)) should contain theSameElementsInOrderAs Seq(1, 1)
    solution(Array(5, 6, 7), Array(3, 6, 10)) should contain theSameElementsInOrderAs Seq(1, 1)
    solution(Array(17, 28, 30), Array(99, 16, 8)) should contain theSameElementsInOrderAs Seq(2, 1)
  }

  def solution(a: Array[Int], b: Array[Int]): Array[Int] = {
    // Write your code here
    val scores: (Int, Int) = Range(0, a.length)
      .foldLeft((0, 0)) { case ((accA: Int, accB: Int), round: Int) => round match {
        case _ if a(round) > b(round) => (accA + 1, accB)
        case _ if a(round) < b(round) => (accA, accB + 1)
        case _ => (accA, accB)
      }}
    Array(scores._1, scores._2)
  }
}
