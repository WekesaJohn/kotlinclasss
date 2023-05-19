import java.util.Scanner
fun main(){
    var me=Scanner(System.`in`)
    print("Enter temp:")
    var temp=me.nextInt()

    if (temp<37){
        println("it is too cold")
    }

    else if (temp>37){
        println("It is too hot")
    }
    else if (temp==37){
        println("It is too hot")
    }
    else{
        println("Normal temp")
    }
}