package org.scny.kata.diamond

import org.scalatest.{Matchers, FlatSpec}


class DiamondPrinterSpec extends FlatSpec with Matchers {

  "For A, the diamond printer" should "give back two lines of A" in {
    printDiamond('A') should be(List(
      "A"))
  }

  "For B, the diamond printer" should "indent A by one space" in {
    printDiamond('B') should contain(" A")
  }

  "For B, the diamond printer" should "have another indented A at the end" in {
    printDiamond('B').count(_ == " A" ) should be(2)
  }

  "For B, the diamond printer" should "have B in the second lines too" in {
    printDiamond('B').indexWhere(_.contains("B")) should be(1)
  }

  "For B, the diamond printer" should "have two B-s printed with one space separated in the second line" in {
    printDiamond('B').indexWhere(_.contains("B B")) should be(1)
  }

  "For C, the diamond printer" should "have two B-s printed with one space separated in the second line + one indentation" in {
    printDiamond('C').indexWhere(_.contains(" B B")) should be(1)
  }

  "For C, the diamond printer" should "have two double indented A-s" in {
    printDiamond('C').count(_ == "  A" ) should be(2)
  }

  def indentLines(previousCharacter: Char): List[String] = {
    printDiamond(previousCharacter).map(" " + _)
  }

  def printDiamond(char:Char): List[String] = {
    char match {
      case 'A' =>   List(char.toString)
      case 'B' =>
            val lines = indentLines('A')
            lines ++ List(char + " " + char) ++ lines
      case 'C' => indentLines('B')
    }


  }



}
