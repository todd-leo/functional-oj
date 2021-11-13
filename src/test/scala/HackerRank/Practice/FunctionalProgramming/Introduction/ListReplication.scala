package com.toddleo.functional.oj
package HackerRank.Practice.FunctionalProgramming.Introduction

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import scala.io.StdIn.{readInt, readLine}


/**
 * Problem: List Replication
 * Difficulty: Easy
 * Link: https://www.hackerrank.com/challenges/fp-list-replication/
 */
class ListReplication extends AnyFlatSpec with Matchers {

  behavior of "Hacker Rank: [Easy] List Replication "

  it should "Output each element of the `arr` `num` times" in {
    ListReplication(3, List(1, 2, 3, 4)) shouldBe List(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4)
    ListReplication(2, List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) shouldBe
      List(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10)
  }

}


object ListReplication {

  def f(num:Int,arr:List[Int]):List[Int] =
    arr.flatMap(List.fill(num)(_))

  def apply(num:Int,arr:List[Int]):List[Int] = f(num, arr)

}
