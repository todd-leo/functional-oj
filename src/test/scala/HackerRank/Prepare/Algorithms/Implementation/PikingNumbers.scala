package com.toddleo.functional.oj
package HackerRank.Prepare.Algorithms.Implementation

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class PikingNumbers extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "just pass" in {
    pickingNumbers(Array(4, 6, 5, 3, 3, 1)) shouldBe 3
    pickingNumbers(Array(1, 2, 2, 3, 1, 2)) shouldBe 5
    pickingNumbers(Array(4, 2, 3, 4, 4, 9, 98, 98, 3, 3, 3, 4, 2, 98, 1, 98, 98, 1, 1, 4, 98, 2, 98, 3, 9, 9, 3, 1, 4, 1, 98, 9, 9, 2, 9, 4, 2, 2, 9, 98, 4, 98, 1, 3, 4, 9, 1, 98, 98, 4, 2, 3, 98, 98, 1, 99, 9, 98, 98, 3, 98, 98, 4, 98, 2, 98, 4, 2, 1, 1, 9, 2, 4)
      ) shouldBe 22
    pickingNumbers(Array(4, 97, 5, 97, 97, 4, 97, 4, 97, 97, 97, 97, 4, 4, 5, 5, 97, 5, 97, 99, 4, 97, 5, 97, 97, 97, 5, 5, 97, 4, 5, 97, 97, 5, 97, 4, 97, 5, 4, 4, 97, 5, 5, 5, 4, 97, 97, 4, 97, 5, 4, 4, 97, 97, 97, 5, 5, 97, 4, 97, 97, 5, 4, 97, 97, 4, 97, 97, 97, 5, 4, 4, 97, 4, 4, 97, 5, 97, 97, 97, 97, 4, 97, 5, 97, 5, 4, 97, 4, 5, 97, 97, 5, 97, 5, 97, 5, 97, 97, 97)
      ) shouldBe 50
    pickingNumbers(Array.fill(100)(66)) shouldBe 100
  }

  /**
   * @param a an array of integers
   * @return the length of the longest subarray that meets the criterion
   */
  def pickingNumbers(a: Array[Int]): Int = {
    // Write your code here
    import scala.collection.MapView
    val countMap: MapView[Int, Int] = a.groupBy(identity).view.mapValues(_.map(_ => 1).sum)
    val consecutiveMax: Int = countMap.size match {
      case 1 => 0
      case _ =>
        val consecutives: Seq[Seq[Int]] =
          countMap.keys.toSeq.combinations(2).toSeq.filter { s => Math.abs(s.head - s.last) <= 1 }
        consecutives.map { c => countMap(c.head) + countMap(c.last) }.max
    }
    val (_, singularMax: Int) = countMap.maxBy(_._2)
    Math.max(consecutiveMax, singularMax)
  }
}
