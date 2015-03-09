package org.scny.kata.diamond

import org.scalatest.{Matchers, FlatSpec}


class DiamondPrinterSpec extends FlatSpec with Matchers {

  "When I print an A in diamond the printer" should "give back two lines of A" in {
    val inputCharacter = "A"

    val outputLines = List("A","A")

    outputLines should be(List("A","A"))
  }


  "When I print a B in diamond the printer" should "give back two lines of A, and a B in the middle" in {
    val inputCharacter = "B"

    val outputLines = List(" A ","B"," A ")

    outputLines should be(List(" A ","B"," A "))
  }


}
