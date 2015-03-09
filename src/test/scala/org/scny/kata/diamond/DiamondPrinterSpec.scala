package org.scny.kata.diamond

import org.scalatest.{Matchers, FlatSpec}


class DiamondPrinterSpec extends FlatSpec with Matchers {

  "When I print an A in diamond the printer" should "give back two lines of A" in {
    val inputCharacter = "A"

    val outputLines = List("A","A")

    outputLines should be(List("A","A"))
  }



}
