fun main() {
    //Arithmetic operators //operant is a value
    var num1 = 45
    var num2 = 34
    println (num1 + num2)
    println (num1 - num2)
    println (num1 * num2)
    println (num1 / num2) // would not see the reminder
    println ((num1.toDouble() / num2.toDouble())) // want to see the other reminders
    println (num1 % num2)

    //Comparison operators
    println(num1 < num2)
    println(num1 > num2)
    println(num1 <= num2)
    println(num1 >= num2)
    println(num1 == num2) //Equal to
    println(num1 != num2) //Not equal to

    //Logical OPERATORS -and, or , and not
    //&& - amber set meaning and  || meaning not
    println( num1 < num2 && num1 != num2) //and
    println( num1 < num2  || num1 != num2) // or
    println(! (num1 < num2 || num1 != num2)) //not

    //Assignment operators  operator precedence
    var x = 23
    x += 2
    println(x)

    var y = 45
    y %= 2
    println(y)














}