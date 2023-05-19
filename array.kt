
fun main(){
    var languages= arrayOf("Python","Kotlin","Java")
    println(languages[0])//accessing an element

    languages[0]="Javascript"//changing an element
    println(languages[0])
    for (a in languages){
        println(a)
    }
    println(languages.size)
}