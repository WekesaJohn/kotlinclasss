
fun main(){
    //predefined fun
    println("kotlin")


    var squareroot=Math.sqrt(81.0)
    println(squareroot)

    var round=Math.ceil(3.55)
    println(round)

    myfun()

    mydatails("John",19)
}
//user defined fun
fun myfun(){
    println("Today is the day")
    add()
}

fun add(){
    var num1=66
    var num2=23
    println(num1+num2)

    
}
fun mydatails(name:String, age:Int){
    println(message = "my name is $name $age years old ")
    

}