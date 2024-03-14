//Class is a blue print of an object
// An Object is an instance of a class
class Person{
    //Attributes/properties
    var name  = "John"
    var age  = "19"
    var gender  = "Male"

    //Methods/Functions
    fun walk (){
        println("Person is walking")
    }
}
fun main(){
    var accountant = Person()
    accountant.walk()

    println(accountant.gender)
    println(accountant.age)


}