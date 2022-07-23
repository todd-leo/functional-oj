package com.toddleo.functional.oj
package HackerRank.Interview.WarmUp

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

class Lesson1_BinaryGap extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "just pass" in {
    Result.jumpingOnClouds(Array(0, 1, 0, 0, 0, 1, 0))
  }

}


object Result {

  /*
   * Complete the 'jumpingOnClouds' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY c as parameter.
   */

  def jumpingOnClouds(c: Array[Int]): Unit = {
    // Write your code here
//    c.foldLeft(collection.immutable.Seq(0)) { case (i, j) =>
//      if (i.head == 0 && j == 0)
//        Nil
//      else i :+ j
//    }

  }

}

object Solution {
  def main(args: Array[String]) = {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = StdIn.readLine.trim.toInt

    val c = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val result = Result.jumpingOnClouds(c)

    printWriter.println(result)

    printWriter.close()
  }
}

