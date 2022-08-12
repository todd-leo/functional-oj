package com.toddleo.functional.oj
package HackerRank.Prepare.Algorithms.Implementation

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class ElectronicsShop extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "just pass" in {
    getMoneySpent(Array(40, 50, 60), Array(5, 8, 12), 60) shouldBe 58
    getMoneySpent(Array(3, 1), Array(5, 2, 8), 10) shouldBe 9
  }


  /**
   * @param keyboards the keyboard prices
   * @param drives the drive prices
   * @param b the budget
   * @return the maximum that can be spent, or  if it is not possible to buy both items
   */
  def getMoneySpent(keyboards: Array[Int], drives: Array[Int], b: Int): Int = {
    /*
     * Write your code here.
     */
    val kbDesc = keyboards.sortWith(_ > _)
    val drvDesc = drives.sortWith(_ > _)

    val kd: Array[Int] = for {
      k <- kbDesc
      d <- drvDesc
    } yield k + d

    kd.sortWith(_ > _).find( _ <= b) match {
      case Some(m) => m
      case None => -1
    }

  }
}
