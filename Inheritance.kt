
//parent class
open class Animal{
    var age:Int=12
    var gender:String="Male"

    fun ismammal(){
        println("Animal is mammal")

    }
}
//child class
class Duck:Animal(){
    var color:String="Brown"

    fun swim(){
        println("swimming")

    }
}

class Fish:Animal(){
    var canEat: Boolean=true

    fun swim(){
        println("swimming")

    }
}

class Horse:Animal(){
    var iswild:Boolean=false

    fun run(){
        println("running")
    }
}

fun main(){
    var d=Duck()
    println(d.color)
    var f=Fish()
    println(f.age)
    var h=Horse()
    println(h.iswild)
}