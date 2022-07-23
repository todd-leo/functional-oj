package com.toddleo.functional.oj
package HackerRank.PreperationKits.OneWeek.Day2

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class LonelyInteger extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  import LonelyInteger.lonelyinteger

  it should "just pass" in {
    lonelyinteger(Array(1, 2, 3, 4, 3, 2, 1)) shouldBe 4
  }

}

object LonelyInteger {
  def lonelyinteger(a: Array[Int]): Int = {
    // Write your code here
    a.reduce(_^_)
  }
}
