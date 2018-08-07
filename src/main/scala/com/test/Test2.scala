package com.test

object Test2 {
//  运算符
  def main(args: Array[String]): Unit = {
    testMethod()
  }


  def testMethod(): Unit ={
    val a = 12;
    val b = 13;
    val c = 12.333;


    println( b / a)
    println(c / a)
    println(a / c)
    println(a % c)
  }

  def testMethod1(): Unit = {
    val a = 10
    val b = 20
    val c = 25
    val d = 25
    println("a + b = " + (a + b))
    println("a - b = " + (a - b))
    println("a * b = " + (a * b))
    println("b / a = " + (b / a))
    println("b % a = " + (b % a))
    println("c % a = " + (c % a))
  }
}
