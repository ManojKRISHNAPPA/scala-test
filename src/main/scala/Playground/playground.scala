package Playground

object playground {
  def main(args: Array[String]): Unit = {
    println("iam ready to learn scala")

    //values variables and types

    val aString: String = "Hello"
    val x:Int = 42
    println(x)
    // vals are immutable
    //types of values are optional and computer can infer the type

    val anotherSting : String = " Hello "
    val abstractSting : String = "Good bye"
    val aBoolean : Boolean = false
    val aChar : Char = 'a'
    val aShort : Short = 4632
    val aLong : Long = 123345678
    val aFloat : Float = 2.0f
    val aDouble : Double = 3.14

    //variables

    var aVariable : Int = 4
    aVariable = 5 //side effects

    //addition
    //def sum(a: Int, b: Int): Int = a + b

    //def sum(a: Int, b: Int): Int

    //sum(4, 4)

    println(s"2 + 2 = ${2 + 2}")

    






  }
}
