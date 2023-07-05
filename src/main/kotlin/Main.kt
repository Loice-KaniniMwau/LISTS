import kotlin.reflect.typeOf

fun main() {
    //immutable lists rep by listOf
    //a mutable list rep by mutableListOf

    val names= listOf("Grace","Hopper","Cate","Diana")
    val phoneNumbers= mutableListOf("25470756960","254710572569","254708377442","254703581265")
    phoneNumbers.add(4,"0712446738")
    println(phoneNumbers)
    println(names)
    phoneNumbers.add(5,"0789234567")
    println(phoneNumbers)
   phoneNumbers.addAll(arrayListOf("mary","kimani","kibe"))
    println(phoneNumbers)
//lists methods include .min,.max,.average,.count,.first,.last,.filter
   val nums= listOf(13,45,67,85,25,97,2,36,2)
    //even nums
    val evenNums=nums.filter { num->num%2==0 }
    val friends= listOf("mary","ann","juliet","margaret","kibett")
    //names longer than 5chars
    val longnames=friends.filter { friend->friend.length>5 }
    println(longnames)
    println(evenNums)
var myave= nums.average()
   var mymaximum= (nums.max())
    var mymini=(nums.min())
    println("$myave,$mymaximum,$mymini")
    println(nums.count())
    println(nums.first())
    println(nums.lastIndexOf(2))
    for (items in nums)

        println(items%5)
    println(nums[7])
    println(nums.get(2))
    println(nums.indexOf(2))
    println(nums.lastIndexOf(2))
    println(nums.lastIndex)
    println(nums.size)
    println(nums.count())
   val mazda=Car("mazda","demio")
    println(mazda is Car)
    var item=0
   for (y in nums){
       item+=y
       println(item)
   }
    nums.forEach { item-> println(item%5) }
    val num= mutableListOf(1,24,76,98,42)

    println(num)
    val sortedNums=num.sorted()
    println(sortedNums)
    println(sortedNums.sortedDescending())
    println( num.reverse())
    createStudentList(mutableListOf(Student("faith",20),Student("maryanne",21),
        Student("loice",19),Student("linet",25)))
    println( even(mutableListOf(1,7,5,9,11,13,15,17,19,21,23)))
   println( duplicates(mutableListOf(1,2,3,1,2,5,6,7,8,1,2)))

    //linked lists
        //multi-dimensional arrays
}
class Car(var make:String,var model:String){
    fun getCarMake():String{
        return make
    }
}
data class Person(var name: String, var age: Int){

}

data class Student(var name:String,var age:Int)
fun createStudentList(students:MutableList< Student>){
    println(students)

    println(students[0].age)
    println(students[1].age)
    val sortdlist=students.sortedBy { student->student.name.length > 5 }
    println(sortdlist)
    val adults=students.filter { student->student.age>=18 }
    println(adults)



}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun even(allnumbers:MutableList<Int>):List<Int>{
  var evenindices=allnumbers.filter { item -> allnumbers.indexOf(item) % 2==0 }
    return  evenindices

}
//remove duplicates
fun duplicates(duplicatedlist:MutableList<Int>):List<Int>{
    var no_duplicates=duplicatedlist.filter { item-> duplicatedlist.indexOf(item)==duplicatedlist.lastIndexOf(item) }
    return no_duplicates
}
