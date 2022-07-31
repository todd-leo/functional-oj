package com.toddleo.functional.oj
package HackerRank.Prepare.Algorithms.Implementation

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import scala.collection.MapView


class MigratoryBirds extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "just pass" in {
    solution(Array(1, 1, 2, 2, 3)) shouldBe 1
    solution(Array(1, 4, 4, 4, 5, 3)) shouldBe 4
    solution(Array(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)) shouldBe 3
  }


  def solution(arr: Array[Int]): Int = {
    // Write your code here
    arr.groupBy(identity).view.mapValues(_.length)
      .toSeq.minBy { case (k, v) => (-v, k) }._1
  }
}
