package com.toddleo.functional.oj
package HackerRank.PreperationKits.OneWeek.Day3

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class CaesarCipher extends AnyFlatSpec with Matchers {

  behavior of "Testing to one possible solution to" + this.getClass.getCanonicalName

  import CaesarCipher.caesarCipher

  it should "just pass" in {
    caesarCipher("middle-Outz", 2) shouldBe "okffng-Qwvb"
    caesarCipher("www.abc.xy", 87) shouldBe "fff.jkl.gh"
  }

}

object CaesarCipher {

  /*
   * Complete the 'caesarCipher' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts following parameters:
   *  1. STRING s
   *  2. INTEGER k
   */

  def caesarCipher(s: String, k: Int): String = {
    // Write your code here
    val alphabet: String = "abcdefghijklmnopqrstuvwxyz"
    val ALPHABET: String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val (heads, tails) = alphabet.splitAt(k%26)
    val (capitalH, capitalT): (String, String) = ALPHABET.splitAt(k%26)
    val rotated: String = tails ++ heads
    val ROTATED: String = capitalT ++ capitalH
    val cipherMap: Map[Char, Char] = alphabet.zip(rotated).toMap ++ ALPHABET.zip(ROTATED).toMap
    s.map { i =>
      cipherMap.get(i) match {
        case Some(t) => t
        case None => i
      }
    }
  }
}
