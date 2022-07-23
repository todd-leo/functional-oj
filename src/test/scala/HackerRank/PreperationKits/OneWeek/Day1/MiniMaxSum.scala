package com.toddleo.functional.oj
package HackerRank.PreperationKits.OneWeek.Day1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
//import scala.collection.immutable.*
//import scala.collection.mutable.*
import scala.collection.concurrent.*
import scala.concurrent.*
import scala.io.*
import scala.math.*
import scala.sys.*
import scala.util.matching.*
import scala.reflect.*

import MiniMaxSum.miniMaxSum

class MiniMaxSum extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "just pass" in {
    miniMaxSum(Array(1, 3, 5, 7, 9)) should contain theSameElementsInOrderAs Seq(16, 24)
    miniMaxSum(Array(1, 2, 3, 4, 5)) should contain theSameElementsInOrderAs Seq(10, 14)
    miniMaxSum(Array(254961783L, 604179258L, 462517083L, 967304281L, 860273491L)) should
      contain theSameElementsInOrderAs Seq(2181931615L, 2894274113L)

  }

}

object MiniMaxSum {

  /*
   * Complete the 'miniMaxSum' function below.
   *
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  def miniMaxSum(arr: Array[Long]): Seq[Long] = {
    // Write your code here
    val sum: Long = arr.sum
    val maxSum: Long = sum - arr.min
    val minSum: Long = sum - arr.max
    Seq(minSum, maxSum)
  }

  def main(args: Array[String]): Unit = {

    val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toLong)

    println(MiniMaxSum.miniMaxSum(arr).mkString(" "))

  }

}
