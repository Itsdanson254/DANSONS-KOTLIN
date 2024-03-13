fun main() {
    //Predifined functions or inbuilt function
    println("Hello Kotlin")

    var x = Math.min(45,89)
    println(x)

    var y = Math.max(90,243)
    println("The maximum value is: $y")

    var z = Math.round(45.98)
    println(z)


    name()     // Calling the function
    product(33,55)   //  Calling the function
    details("Lanoi",23) //  Calling the function
    details("Sharlene",25) //  Calling the function
}

//This  is a user defined function
fun name(){
    println("DANSON")
}

fun product (num1:Int, num2:Int){
    println(num1 * num2)
}

fun details(name:String,age:Int){
    println("$name is $age years old")
}