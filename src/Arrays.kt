fun main() {
    //An array is a variable that holds many values
    var languages = arrayOf("Kotlin", "Javascript", "C++")
    println(languages[1])


    //Reassigning a value
    languages[1] = "PHP"
    println(languages[1])

    //Displaying all values
    //looping through an array
    for (lang in languages) {
        println(lang)
    }


    //Determining if an element exist or not
    if ("PHP" in languages){
        println("It exist")
    }
    else{
        println("It does not exist")
    }





}