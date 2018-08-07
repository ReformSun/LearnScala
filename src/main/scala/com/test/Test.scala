package com.test

object Test {

  def main(args: Array[String]) {

//    println("Hello\tworld!\n\n\n\n") // 输出 Hello World

// 声明变量
    var myVar : String = "ddd";

// 声明常量
    val foo =
      """
        a
        d
        f
      """
    println(foo)


    val testClass = new TestClass("dd");


//    var s : String;

//    声明一个元组
    val l = (1,2);
    val c = ("a",1);

  }

}


class TestClass(s:String){
    var y:String = s;
}
