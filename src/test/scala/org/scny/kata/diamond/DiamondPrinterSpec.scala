package org.scny.kata.diamond

import org.scalatest.{Matchers, FlatSpec}


class DiamondPrinterSpec extends FlatSpec with Matchers {

  "When I print an A in diamond the printer" should "give back two lines of A" in {
    diamondLines('A') should be(List("A","A"))
  }

  "When I print a B in diamond the printer" should "give back two lines of A, and a B in the middle" in {
    diamondLines('B') should be(List(" A ","B"," A "))
  }


  def diamondLines(inputCharacter: Char): List[String] = {

    val diamondLines =  inputCharacter match {
      case 'A' => List("A", "A")
      case 'B' => List(" A ","B"," A ")
    }

    diamondLines
  }

}
