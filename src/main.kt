/*
Pseudocode
Variables:
printSpanish, rangeFlag, number

Process:
Initialize the variables
Ask the user to enter a number from 1 to 10, then assign the value to the number variable.
Using a when statement, set the printSpanish variable to the value associated with each user input.
If the number variable doesn't match any statement, set the rangeFlag variable to 1.
If the rangeFlag variable is 0, print the printSpanish variable as the translation.
If the rangeFlag variable is not 0, print the phrase "Out of Range".

*/

fun main(args: Array<String>)
{

    var printSpanish = "x"
    var rangeFlag = 0

    println("Please enter a number from 1 to 10:")

    val number = readLine()!!.toInt()

    when(number)
    {
        1 -> printSpanish = "Uno"
        2 -> printSpanish = "Dos"
        3 -> printSpanish = "Tres"
        4 -> printSpanish = "Quatro"
        5 -> printSpanish = "Cinco"
        6 -> printSpanish = "Seis"
        7 -> printSpanish = "Siete"
        8 -> printSpanish = "Ocho"
        9 -> printSpanish = "Nueve"
        10 -> printSpanish = "Diez"
        else -> rangeFlag = 1
    }

    if (rangeFlag == 0)
    {
    println("The number $number is $printSpanish in Spanish")
    }
    else
    println("Fuera de Rango!")
}