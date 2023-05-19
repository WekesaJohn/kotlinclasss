class Car{
    var make="Landcruiser"
    var model="TX"
    var color="Black"
    var drivingspeed=188

    fun drive(){
        println("Driving")

    }
    fun turn(){
        println("Turning")

    }
    fun stop(){
        println("Stoping")
    }

}

fun main(){
    var driver=Car()
    print(driver.model +" " + driver.make +" "+ driver.color+" "+ driver.drivingspeed)
}