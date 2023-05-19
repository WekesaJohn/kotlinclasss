import java.util.Scanner
fun main(){
    var me=Scanner(System.`in`)

    println("Entr number:")
    var num=me.nextInt()
    if (num > 0) {
        println("positive num")
    }
    else if (num<0) {
        println("num negative")
    }
    else {
        println("num is neutral")
    }



}