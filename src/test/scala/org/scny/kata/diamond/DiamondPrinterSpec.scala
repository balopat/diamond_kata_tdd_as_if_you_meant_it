package org.scny.kata.diamond

import org.scalatest.{Matchers, FlatSpec}


class DiamondPrinterSpec extends FlatSpec with Matchers {

  "For A, the diamond printer" should "give back two lines of A" in {
    printDiamond('A') should be(List(
      "A"))
  }


  "For B, the diamond printer" should "indent A by one space" in {
    val input = 'B'

    val diamondLines =  indentLines('A')

    diamondLines should contain(" A")
  }

  "For B, the diamond the printer" should "have another indented A at the end" in {
    val input = 'B'

    val lines = indentLines('A')
    val diamondLines = lines ++ List("B") ++ lines

    diamondLines.count(_ == " A" ) should be(2)
  }



  "For B, the diamond the printer" should "have B in the second lines too" in {
    val input = 'B'

    val lines = indentLines('A')
    val diamondLines = lines ++ List("B") ++ lines

    diamondLines.indexWhere(_.contains("B")) should be(1)
  }


  def indentLines(previousCharacter: Char): List[String] = {
    printDiamond(previousCharacter).map(" " + _)
  }

  def printDiamond(char:Char): List[String] = {
    List(char.toString)
  }


}
