 open class Shape{
    fun area(){
        println("area")
    }
    
}
class Circl:shape(){
    fun circle(){
        println("circle")

    }
    
}
class Triangle:Shape(){
    fun triangle(){
        println("triangle")
    }
}
class Rectangl:Shape(){
    fun rectangle(){
        println("rectangle")
    }
}

fun main(){
    var c=Circle()
    var t=Triangle()
    var r=Rectangl()
}
