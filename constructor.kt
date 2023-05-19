class Dog(var color:String,var breed:String,var sex:String, var age:Int){
    //properties





}
fun main(){
    var d=Dog("white","German shepherd","female",5)
    println(d.color+" "+d.breed+" "+d.sex+" "+d.age)
    var puppy=Dog("Brown","Kenyan","Male",2)
    println(puppy.color +" "+puppy.breed +" "+puppy.sex +" "+puppy.age)

}