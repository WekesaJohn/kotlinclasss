class man(var name:String,var age:Int,var job_status:String,var gender:String){

}


fun main(){
    var person1=man("Rita",18,"unemployed","Female")
    println(person1.name+" "+person1.age+" "+person1.job_status+" "+person1.gender)

    var person2=man("David",43,"unemployed","male")
    println(person2.name+" "+person2.age+" "+person2.job_status+" "+person2.gender)

}