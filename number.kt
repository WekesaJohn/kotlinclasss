import java.util.Scanner
fun main(){
    var me=Scanner(System.`in`)
    print("Enter value a :")
    var a=me.nextInt()

    print("Enter value b:")
    var b=me.nextInt()

    print(message = "Enter value c:")
    var c=me.nextInt()

    if (a>b && a>c){
        println("$a is greater")
    }
    else if(b>a && b>c){
        println("$b is greater"
        )
    }
    else{
        println("$c is greater")
    }
}