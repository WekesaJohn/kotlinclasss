import java.util.Scanner
fun main(){
    var me=Scanner(System.`in`)
    println("enter value:")

    var temp=me.nextFloat()
    if (temp>50){
        println("Limit your temp")
    }
    else if (temp<50){
        println(" Freezing point, please be careful")
    }
    else{
        println(" you are good to go")
    }

}