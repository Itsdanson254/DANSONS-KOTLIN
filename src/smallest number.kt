import java.util.*

fun main() {
    var input = Scanner(System.`in`)

    print("Enter your first number :")
    var first = input.nextInt()

    print("Enter your Second number :")
    var second = input.nextInt()

    print("Enter your third number :")
    var  third  = input.nextInt()

    if (first < second && first < third ){
        println("$first is the smallest number")
    }
    else if (second < first && second < third){
        println("$second is the smallest number")
    }
    else{
        println("$third is the smallest number")
    }


}