import java.util.Scanner
fun main(){
    var me=Scanner(System.`in`)

    println("Enter redius R:")
    var R=me.nextFloat()

    println("Enter angle A:")
    var A=me.nextFloat()

    var result=((A/360)*R*R*3.1428)
    println(result)
}