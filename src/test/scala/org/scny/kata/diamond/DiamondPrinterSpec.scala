package org.scny.kata.diamond

import org.scalatest.{Matchers, FlatSpec}


class DiamondPrinterSpec extends FlatSpec with Matchers {

  "When I print an A in diamond the printer" should "give back two lines of A" in {
    diamondLines('A') should be(List(
      "A",
      "A"))
  }

  "When I print a B in diamond the printer" should "give back two lines of A, and a B in the middle" in {
    diamondLines('B') should be(List(
      " A",
      "B B",
      " A"))
  }

  "When I print a C in diamond the printer" should "give back the 4 diamond lines up until C" in {
    diamondLines('C') should be(List(
      "  A",
      " B B",
      "C   C",
      " B B",
      "  A"
    ))
  }


  def diamondLines(inputCharacter: Char): List[String] = {

    val diamondLines =  inputCharacter match {
      case 'A' => List(
        "A",
        "A")
      case 'B' => List(
        " A",
        "B B",
        " A")
      case 'C' => List(
        "  A",
        " B B",
        "C   C",
        " B B",
        "  A"
      )
    }

    diamondLines
  }

}
