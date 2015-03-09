package org.scny.kata.diamond

import org.scalatest.{Matchers, FlatSpec}


class DiamondPrinterSpec extends FlatSpec with Matchers {

  "When I print an A in diamond the printer" should "give back two lines of A" in {
    val input = 'A'

    val diamondLines = List(
      "A",
      "A")


    diamondLines should be(List(
      "A",
      "A"))
  }

  "When I print a B in diamond the printer" should "give back two lines of A, and a B in the middle" in {
    val input = 'B'

    val diamondLines = List(
      " A",
      "B B",
      " A")

    diamondLines should be(List(
      " A",
      "B B",
      " A"))
  }

  "When I print a C in diamond the printer" should "give back the 4 diamond lines up until C" in {
    val input = 'C'

    val diamondLines = List(
      "  A",
      " B B",
      "C   C",
      " B B",
      "  A"
    )

    diamondLines should be(List(
      "  A",
      " B B",
      "C   C",
      " B B",
      "  A"
    ))
  }




}
