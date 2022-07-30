package com.toddleo.functional.oj
package HackerRank.Interview.WarmUp

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class AVeryBigSum extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "just pass" in {
    solution(Array(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L)) shouldBe 5000000015L
  }

  def solution(ar: Array[Long]): Long = {
    // Write your code here
    ar.sum
  }
}
