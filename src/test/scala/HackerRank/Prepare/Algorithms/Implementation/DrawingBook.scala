package com.toddleo.functional.oj
package HackerRank.Prepare.Algorithms.Implementation

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class DrawingBook extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "just pass" in {
    pageCount(5, 3) shouldBe 1
    pageCount(5, 4) shouldBe 0
    pageCount(6, 5) shouldBe 1
  }

  /**
   * @param n the number of pages in the book
   * @param p the page number to turn to
   * @return the minimum number of pages to turn
   */
  def pageCount(n: Int, p: Int): Int = {
    // Write your code here
    val turnPages = Math.floor(p / 2.0).toInt
    val totalTurnPages = Math.floor(n / 2.0).toInt
    Math.min(turnPages, totalTurnPages - turnPages)
  }
}
