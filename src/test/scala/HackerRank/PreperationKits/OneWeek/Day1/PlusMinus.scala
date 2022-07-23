package com.toddleo.functional.oj
package HackerRank.PreperationKits.OneWeek.Day1

import HackerRank.PreperationKits.OneWeek.Day1.PlusMinus.*

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
import scala.collection.concurrent.*
import scala.collection.immutable.*
import scala.collection.mutable.*
import scala.concurrent.*
import scala.io.*
import scala.math.*
import scala.reflect.*
import scala.sys.*
import scala.util.matching.*

class PlusMinus extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "just pass" in {

    plusMinus(Array(-4, 3, -9, 0, 4, 1))
  }

}

object PlusMinus {

  /*
   * Complete the 'plusMinus' function below.
   *
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  def plusMinus(arr: Array[Int]): Unit = {
    // Write your code here
    val stats: (Int, Int, Int) =
      arr.foldLeft((0, 0, 0)) { case ((m: Int, z: Int, p: Int), x: Int) => x match {
        case x if x >  0 => (m, z, p + 1)
        case x if x == 0 => (m, z + 1, p)
        case x if x <  0 => (m + 1, z, p)
      }}
    val total: Double = (stats._1 + stats._2 + stats._3).toDouble
    val negatives = stats._1 / total
    val zeros = stats._2 / total
    val positives = stats._3 / total

    println(f"$positives%1.6f")
    println(f"$negatives%1.6f")
    println(f"$zeros%1.6f")
  }

  def main(args: Array[String]): Unit = {
    val n = StdIn.readLine.trim.toInt

    val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    plusMinus(arr)
  }

}
