 //Area of trapizium
import java.util.Scanner
fun main(){
    var me=Scanner(System.`in`)

    print("Enter value a:")
    var a=me.nextInt()

    print("Enter value b:")
    var b=me.nextInt()

    print(message = "Enter value height:")
    var h=me.nextInt()

    var area=(0.5*h*(a+b))
    println(area)
}