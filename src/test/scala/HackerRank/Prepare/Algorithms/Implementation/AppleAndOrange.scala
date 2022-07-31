package com.toddleo.functional.oj
package HackerRank.Prepare.Algorithms.Implementation

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class AppleAndOrange extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "just pass" in {
    solution(s = 7, t = 11, a = 5, b = 15, apples = Array(-2, 2, 1), oranges = Array(5, -6)) shouldBe (1, 1)
  }


  /**
   * Complete the 'countApplesAndOranges' function below.
   * @param s starting point of Sam's house location.
   * @param t ending location of Sam's house location.
   * @param a integer, location of the Apple tree.
   * @param b integer, location of the Orange tree.
   * @param apples distances at which each apple falls from the tree.
   * @param oranges distances at which each orange falls from the tree.
   * @return
   */
  def solution(s: Int, t: Int, a: Int, b: Int, apples: Array[Int], oranges: Array[Int]): (Int, Int) = {
    // Write your code here
    val appleCount = apples.map(_ + a).count(Range.inclusive(s, t).contains)
    val orangeCount = oranges.map(_ + b).count(Range.inclusive(s, t).contains)
    (appleCount, orangeCount)
  }

}
