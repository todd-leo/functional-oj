package com.toddleo.functional.oj
package HackerRank.PreperationKits.OneMonth.Week1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class SparseArrays extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  it should "just pass" in {
    solution(Array("ab", "ab", "abc"), Array("ab", "abc", "bc")) should contain theSameElementsInOrderAs Seq(2, 1, 0)
  }

  def solution(strings: Array[String], queries: Array[String]): Array[Int] = {
    // Write your code here
    import scala.collection.MapView
    val appearance: MapView[String, Int] = strings.groupBy(identity).view.mapValues(_.length)
    queries.map { case q: String =>
      appearance.get(q) match {
        case Some(c) => c
        case None => 0
      }
    }
  }

}


