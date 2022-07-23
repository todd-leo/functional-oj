package com.toddleo.functional.oj
package HackerRank.PreperationKits.OneWeek.Day1

import HackerRank.PreperationKits.OneWeek.Day1.Solution.timeConversion

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import java.io.PrintWriter
import scala.io.StdIn

class name extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "just pass" in {
    timeConversion("12:01:00AM") shouldBe "00:01:00"
    timeConversion("07:05:45PM") shouldBe "19:05:45"
  }
}

object Solution {

  /*
   * Complete the 'timeConversion' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts STRING s as parameter.
   */

  def timeConversion(s: String): String = {
    // Write your code here
    val hour = s.take(2).toInt
    val mmss = s.substring(2, 8)
    val postfix = s.takeRight(2)
    val hh: Int = postfix match {
      case "AM" => hour % 12
      case "PM" => hour % 12 + 12
    }
    f"$hh%02d$mmss"
  }

  def main(args: Array[String]): Unit = {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val s = StdIn.readLine

    val result = Solution.timeConversion(s)

    printWriter.println(result)

    printWriter.close()
  }

}
