import java.util.Scanner

fun main() {
    var reader = Scanner(System.`in`)

    println("Enter room temperature :")
    var temperature = reader.nextInt()

    if (temperature < 25) {
        println("It is COLD")
    }
    else {
        println("It is HOT")
    }





}