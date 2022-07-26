package com.toddleo.functional.oj
package Interviews

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ToolList extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  import ToolList.toolList

  it should "just pass" in {
    toolList(Array("ball", "key", "slot", "face"), 1, "ball") shouldBe 1
  }

}
object ToolList {

  /*
   * Complete the "gridChallenge" function below.
   *
   * The function is expected to return a STRING.
   * The function accepts STRING_ARRAY grid as parameter.
   */

  def toolList(tools: Array[String], startIndex: Int, target: String): Int = {
    // Write your code here

    val _startIndex = startIndex + tools.length
    val rightTools: Array[Int] =
      Array.fill(3)(tools).flatten
        .zipWithIndex.flatMap { case (t, index) => t match {
      case _ if t == target => Some(index)
      case _ => None
    }}
    rightTools.map(_ - _startIndex).map(Math.abs).min

  }

}
