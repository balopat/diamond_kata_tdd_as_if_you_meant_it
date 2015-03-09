package org.scny.kata.diamond

import org.scalatest.{Matchers, FlatSpec}


class DiamondPrinterSpec extends FlatSpec with Matchers {

  "For A, the diamond printer" should "give back two lines of A" in {
    val input = 'A'

    val diamondLines = List(
      "A")


    diamondLines should be(List(
      "A"))
  }

  "For B, the diamond printer" should "indent A by one space" in {
    val input = 'B'

    val diamondLines =   List(
      " A")

    diamondLines should contain(" A")
  }

  "For B, the diamond the printer" should "have another indented A at the end" in {
    val input = 'B'

    val diamondLines =   List(
      " A",
      " A")

    diamondLines.count(_ == " A" ) should be(2)
  }


}
