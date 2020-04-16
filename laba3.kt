//1
/*fun main(args: Array<String>) {
    val numbers = arrayOf<Int>(1, 2, 3, 4, 5)
    println(numbers.indices) // выписываем промежуток т.к. это массив, то от 0 до 4
    for((index, value) in numbers.withIndex()){ // исп библиотечную функцию
    	println("Значение индекса $index равно $value")
    }
}*/

//2
/*fun main(args: Array<String>){
    var arr = emptyArray<String>()
    var i = 10
    while(i>0){
        arr += i.toString()
        i--  // снижаем количество значений, чтобы их было всгео 10
    }
    println(arr.size) // Узнать длину массива можно при помощи свойства size. 10
*/

//3 
/*fun main(args: Array<String>){
    var array = arrayOfNulls<String>(5)
    array.set(0, "a")
	array.set(1, "b")
    array.set(2, "c")
	array.set(3, "d")
    array.set(4, "e")
    println(array.get(0)) 
    println(array.get(4))
}*/

//4 Лямбда-выражения представляют небольшие кусочки кода, которые выполняют некоторые действия. Фактически лямбды преставляют сокращенную запись функций.
/*fun main(args: Array<String>){
   val myArray = Array(5, { i -> i * 2 })
    println(myArray[3]) 

}*/

//5 forEach - Пройтись по всем элементам коллекции.
/*fun main(args: Array<String>){
    val arr = arrayOf<Int>(2, 3, 4, 5, 6)
	arr.forEach {i -> println(i)} 
}*/

//6
/*fun main(args: Array<String>){
    val arr = arrayOf<Int>(2, 3, 4, 5, 6)
	arr.forEach {i -> println(i*(-1))}
}*/

//7  (1)
fun main(args: Array<String>){
    val num = setOf(1, 2, 3, 4, 5)
    val part = num.partition {
    	it % 2 == 0
	}
    println(part)  // ([2, 4], [1, 3, 5])
}

//8  (2) Kotlin HashSet - это класс коллекции, который расширяет класс AbstractMutableSet и реализует интерфейс Set.
fun main(args: Array<String>){
    val IntsHashSet = hashSetOf(1, 2, 3, 4, 5)
    
    IntsHashSet.add(6) // добавляем 6 в конец списка (список или массив?)
    println(IntsHashSet)
    
    println(IntsHashSet.contains(2))  // (bool)contains() позволит убедиться, что нужный элемент присутствует в списке. 
    
    IntsHashSet.remove(2)  // удаление второго значения 
    println(IntsHashSet)
    
    println(IntsHashSet.indices) // промежуток индексов
    
    println(IntsHashSet.count()) // счёт, сколько общее колво
    
    IntsHashSet.clear()  // обнуление
    println(IntsHashSet)
    
    println(IntsHashSet.isEmpty()) // проверяет пусто или нет
}

//9 (3)
 fun main(args: Array<String>){
val citiesofcrimea= listOf("SIMF","SEVAST","YEVP")
println(citiesofcrimea.contains("SIMF"))
}

fun main(args: Array<String>){
val ci= listOf(1,2,3,4,5)
println(ci.sumBy { it + 5 }) // 6 + 7+8+9+10 = 40
}



//10 (4)
fun main(args: Array<String>){
    val mp1 = mapOf("beverage" to 2.7, "meal" to 12.4) // ключ, значение, как словари в питоне, 
    val mp2 = mp1.mapValues{it.value.toString() + "$"}
    println(mp2)
}

//11 (5)
fun main(args: Array<String>){  // изменяемый cписок
    val currenciesMutableMap:MutableMap<String, String> = mutableMapOf("Гривна" to "Украина", "Доллар" to "США", "Лира" to "Турция")
    println("Страны: ${currenciesMutableMap.values}") // выводим значения, ниже ключи
    println("Валюты: ${currenciesMutableMap.keys}")
    
    println(currenciesMutableMap.containsKey("Гривна")) // проверяем наличие
    
    println(currenciesMutableMap.containsValue("Россия"))
    
    println(currenciesMutableMap.count())
}