//1
fun main(args: Array<String>) {
    val language = if "EN" else args[0]
    println(when (language) {
        "EN" -> "Hello!"
        "FR" -> "Salut!"
        "IT" -> "Ciao!"
        else -> "Sorry, I can't greet you in $language yet"
    })
} // если значение будет пусто

//2
fun main(args: Array<String>) {
val a = 3
val b = 3L
val c = 3f
val d = 3.0
val e = "Unknown"
val f = "3"
val g = "Long"
val l = '3'    // char
var check=a as Any is Int
println(check)
var check=b as Any is Double
println(check)
var check=c as Any is Int
println(check)
var check=d as Any is Char
println(check)
var check=e as Any is Int
println(check)
var check=f as Any is String
println(check)
var check=g as Any is Int
println(check)
var check=l as Any is String
println(check)

}
//3
fun main(args: Array<String>) {
    val a1 = 3
    val a2 = 3L
    val a3 = 3f
    val a4 = 3.0
    val a5 = "Unknown"
    val a6 = "3"
    val a7 = "Long"
    val a8 = '3'
    println(describe(a1))                     
    println(describe(a2))
    println(describe(a3))
    println(describe(a4))
    println(describe(a5))
    println(describe(a6))
    println(describe(a7))
    println(describe(a8))

}
fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
}

//4
fun main(args: Array<String>) {
    println(describe(-2))
    println(describe(10L))
    println(describe(3.0))
    println(describe("unknw"))
    println(describe(7))
    println(describe("Hello"))
    println(describe(1))

}

fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
}

//5
fun main(args: Array<String>) {
	println(declaration(1))
}
fun declaration(obj: Any):String{
    var a = when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }
    return a
}

//6
fun main(args:Array<String>){
val x = 9
when{
isOdd(x)->println("x is odd")
isEven(x)->println("x is even")
else->println("x is funny")
}
}

fun isOdd(x: Any){
if(x !is Int) return false
return x%2==0
}
fun isEven(x: Any){
if (x !is Int) return false
return x%2==1
}

//7
fun main(args: Array<String>) {
    val x = 10 
    val y = 9 
   
    if (x in 1..y) {
        println("fits in range") 
    } else {
        println("out of range")
    }
}
//8
fun main(args: Array<String>) {

    test(3)
    test(111)
    test(22)
    test(15)

}
fun test(x: Any)
{
    val validNumbers = arrayOf(1,11,111,1111)
    when (x) {
        in 1..10 -> println("x is in the range")
        in validNumbers -> println("x is valid")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }
}

//9
fun main(args: Array<String>) {
var items1= arrayOf("apple")
 when {

        "apple" in items1 -> println("apple is fine too")
    }
    var items = arrayOf("orange")
    when {
        "orange" in items -> println("juicy")

    }
}
//10
fun main(args: Array<String>) {

    println(hasPrefix("prefixhhjhjhgjggjhjghjjkl"))
}

fun hasPrefix(x: Any) = when(x) {  // 1 задание и функция startwith
    is String -> x.startsWith("prefix")
    else -> false
}