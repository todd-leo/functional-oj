package com.toddleo.functional.oj
package HackerRank.PreperationKits.OneWeek.Day4

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class GridChallenge extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  import GridChallenge.gridChallenge

  it should "just pass" in {
    gridChallenge(Array("ebacd", "fghij", "olmkn", "trpqs", "xywuv")) shouldBe "YES"
    gridChallenge(Array("abcdz", "fghie")) shouldBe "NO"
    gridChallenge(Array("mpxz", "abcd", "wlmf")) shouldBe "NO"
    gridChallenge(Array("kc", "iu")) shouldBe "YES"
    gridChallenge(Array("uxf", "vof", "hmp")) shouldBe "NO"
  }
}


object GridChallenge {

  /*
   * Complete the "gridChallenge" function below.
   *
   * The function is expected to return a STRING.
   * The function accepts STRING_ARRAY grid as parameter.
   */

  def gridChallenge(grid: Array[String]): String = {
    // Write your code here
    val sortedGrid = grid.map(_.sorted).toSeq
    val columns = sortedGrid.head.length
    val isColumnAscending: Boolean = Range(0, columns).map { case column: Int =>
      sortedGrid.map(_(column).toInt).reduce[Int] { case (acc: Int, i: Int) =>
        acc * (i - acc) match {
          case pos if pos >= 0 => 1
          case neg if neg < 0 => -1
        }
      }
    }.forall(_ > 0)
    if (isColumnAscending)
      "YES"
    else "NO"
  }

}

