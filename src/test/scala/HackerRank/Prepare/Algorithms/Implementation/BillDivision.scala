package com.toddleo.functional.oj
package HackerRank.Prepare.Algorithms.Implementation

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class BillDivision extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "just pass" in {
    bonAppetit(Array(3, 10, 2, 9), 1, 12) shouldBe "5"
    bonAppetit(Array(3, 10, 2, 9), 1, 7) shouldBe "Bon Appetit"
  }


  /**
   * @param bill an array of integers representing the cost of each item ordered
   * @param k    an integer representing the zero-based index of the item Anna doesn't eat
   * @param b    the amount of money that Brian charged Anna for her share of the bill
   */
  def bonAppetit(bill: Array[Int], k: Int, b: Int): String = {
    // Write your code here
    val correctBill: Int = (bill.sum - bill(k)) / 2
    correctBill == b match {
      case true => "Bon Appetit"
      case false => (b - correctBill).toString
    }
  }
}
