import java.util.Scanner

fun main(){
    var edit=Scanner(System.`in`)
    println("Enter charecters")
    var chara=edit.next().single()

    if (chara=='a'|| chara=='e'||chara=='i'||chara=='u'){
        println("$chara vowel")
    }
    else{
        println("$chara constant")
    }
}