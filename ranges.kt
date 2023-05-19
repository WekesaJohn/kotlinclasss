fun main(){
    for (number in 10..15){
        println(number)
    }
    for (leter in 'c'..'f'){
        println("leter $leter")}

    for ( number in 1..10){
        if (number==6)
            break
        println(number)
    }
    for (leter in 'a'..'d'){
        if (leter=='c')
            continue
        println(leter)
    }



}