fun main() {
    //While loop - print if condition is true
    var number = 200
    while (number <= 205){
        println("Number is $number")
        number++
    }

    //Decrement
    var numb = 100
    while (numb >= 95){
        println("Counter is $numb")
        numb--
    }

    //Do .... while loop - prints even if condition is false
    var num = 20
    do {
    println(num)
        num++
    }while (num <= 25)

    //For loop - doesnot set conditions but print range
    var furniture = arrayOf("Table","Chair","Desk")
    for (z in furniture){
        println(z)
    }

    var marks = arrayOf(90,88,98,78)
    for (m in marks){
        println("Mark is these $m")
    }


    //Range
    for (numbers in 30  .. 35){
        println(numbers)
    }

    for (characters in 'a'  ..  'd'){
        println(characters)
    }








}