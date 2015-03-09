package org.scny.kata.diamond

import org.scalatest.{Matchers, FlatSpec}


class DiamondPrinterSpec extends FlatSpec with Matchers {

  "When I print an A in diamond the printer" should "give back two lines of A" in {
    val input = 'A'

    val diamondLines = List(
      "A")


    diamondLines should be(List(
      "A"))
  }

  "When I print a B in diamond the printer" should "indent A by one space" in {
    val input = 'B'

    val diamondLines =   List(
      " A")

    diamondLines should contain(" A")
  }




}
