package com.toddleo.functional.oj
package HackerRank.PreperationKits.OneWeek.Day2

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class DiagnalDifference extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  import DiagnalDifference.diagonalDifference

  it should "just pass" in {
    diagonalDifference(Array(Array(1, 2, 3), Array(4, 5, 6), Array(9, 8, 9))) shouldBe 2
    diagonalDifference(Array(Array(11, 2, 4), Array(4, 5, 6), Array(10, 8, -12))) shouldBe 15
  }
}

object DiagnalDifference {
  def diagonalDifference(arr: Array[Array[Int]]): Int = {
    // Write your code here
    val rounds = arr.length
    val (lrSum, rlSum) = Range(0, rounds).map { round =>
      (arr(round)(round), arr(round)(rounds - 1 - round))
    }.foldLeft((0, 0)) { case ((lrSum, rlSum), (lr, rl)) =>
      (lrSum + lr, rlSum + rl)
    }
    Math.abs(lrSum - rlSum)
  }
}
