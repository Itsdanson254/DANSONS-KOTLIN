
//Break statement - stops right there
fun main() {
    for (x in 50 .. 55){
        if (x == 54){
            break
        }
        println(x)
    }
//Continue statement - skips and continue
    for (character in 'd' .. 'h'){
        if (character == 'e'){
            continue
        }
        println("Character is $character")
    }


}