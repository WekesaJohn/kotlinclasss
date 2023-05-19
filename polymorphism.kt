open class shape{
    open fun draw(){
        println("drawing")
    }
}

class rectangle:shape(){
    override fun draw(){
        println("Drawing a rectangle")
    }
}

class Squar:shape(){
    override fun draw(){
        println("Drawing a square")
    }
}

fun main(){
    var r=rectangle()
    r.draw()
    var s=Squar()
    s.draw()
}