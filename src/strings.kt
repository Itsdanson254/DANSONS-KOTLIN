fun main() {
    var greeting = "Hello world"
    var firstname = "Danson"
    var lastname = "eMOBILIS"

    //string concatenation - joining of strings
    println(firstname + " " + lastname)
    println(firstname.plus(lastname))


    //Accessing an element in a string
    println(greeting[6])

    //Determining the Index position of an element
    println(greeting.indexOf("world"))
    println(greeting.indexOf('H'))

    //Modifying a string
    println(greeting.uppercase())

    //string interpolation - combining variables with messages
    println("Hello there,my name is $firstname $lastname")

    //size  of a string
    println(greeting.length)
}