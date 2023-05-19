open class Figure{
    var start:String=""
    fun Area(){
        println("print area")
    }
    fun Perimeter(){
        println("print perimeter")
    }
    fun Draw(){
        println("Draw")
    }


}

class Circle{
    var Radius:Int=2
    fun Area(){
        println("Area")

    }
    fun Perimeter(){
        println("Perimeter")
    }
    fun Draw(){
        println("Draw")
    }
}

 class Rectangle{
    var width:Int=22
    var Height:Int=12

    fun Area(){
        println("area")
    }
    fun Perimeter(){
        println("Perimeter")
    }
    fun Draw(){
        println("Draw")
    }
}

class Square{

}

fun main(){
    var c=Circle()
    println(c.Radius)
    var r=Rectangle()
    println(r.width)
    var s=Square()
    

}