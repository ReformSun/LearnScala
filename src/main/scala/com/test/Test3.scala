package com.test

/**
  * 闭包
  */
object Test3 {
  def main(args: Array[String]): Unit = {
    testMethod1()
  }
  
  def testMethod1(): Unit = {
    val a = (i:Int) => i + 4

    println(a(1))

    var c = 1;
    val b = (i:Int) => i + c
     println(b(2))

  }
}
