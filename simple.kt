import java.util.Scanner
fun main(){
    var me=Scanner(System.`in`)
    println("Enter the first number first:")
    var first = me.nextFloat()


    println("Enter second number sec:")
    var sec=me.nextFloat()

    
    println("Operation op:")
    var op=me.next()

    var result=when(op){
        "*"-> {
            first*sec
        }
        "-"-> {
            first-sec
        }
        "/"-> {
            first/sec
        }
        "+"-> {
            first+sec
        }
        else-> {
            "Operation invalid"
        }


    }
    println("correct $result")
}