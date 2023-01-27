package sectionone.miniexercises

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
/* 1. Declare a constant exercises with value 9 and a variable exercisesSolved with value 0. Increment this variable every time you solve an exercise (including this one).*/
    val exercises = 9
    var exercisesSolved = 0
    exercisesSolved += 1
    println("exercisesSolved = $exercisesSolved")

/* 2.  Given the following code:

    age = 16
    print(age)
    age = 30
    print(age)

    Declare age so that it compiles. Did you use var or val? */

    var age = 16
    println(age)
    age = 30
    println(age)

    exercisesSolved += 1

/* 3. Consider the following code:
val a: Int = 46
val b: Int = 10

Work out what answer equals when you add the following lines of code:

// 1
val answer1: Int = (a * 100) + b
// 2
val answer2: Int = (a * 100) + (b * 100)
// 3
val answer3: Int = (a * 100) + (b / 10)

*/
    val a: Int = 46
    val b: Int = 10

// 1
    val answer1: Int = (a * 100) + b
    println(answer1)
// 2
    val answer2: Int = (a * 100) + (b * 100)
    println(answer2)
// 3
    val answer3: Int = (a * 100) + (b / 10)
    println(answer3)

    exercisesSolved += 1

/*
4. Add parentheses to the following calculation. The parentheses should show the order in which the operations are
performed and should not alter the result of the calculation.
5 * 3 - 4 / 2 * 2
*/

    val result = ((5 * 3) - (4 / 2) * 2)
    println(result)

    exercisesSolved += 1


/*
5. Declare two constants a and b of type Double and assign both a value. Calculate the average of a and b and store
the result in a constant named average.
*/

    val aA: Double = 5.0
    val bB: Double = 10.0
    val average = (aA + bB) / 2
    println(average)
    exercisesSolved += 1


/*
6. A temperature expressed in °C can be converted to °F by multiplying by 1.8 then incrementing by 32.
In this challenge, do the reverse: convert a temperature from °F to °C. Declare a constant named fahrenheit of type
Double and assign it a value. Calculate the corresponding temperature in °C and store the result in a constant named celcius.
*/

    val fahrenheit: Double = 66.2
    val convert: Double = 1.8

    val count = 32

    println(count)

    val celcius = (fahrenheit - count) / convert

    println("celcius = $celcius")
    exercisesSolved += 1

/*
7. Suppose the squares on a chessboard are numbered left to right, top to bottom, with 0 being the top-left square and 63
being the bottom-right square. Rows are numbered top to bottom, 0 to 7. Columns are numbered left to right, 0 to 7.
Declare a constant position and assign it a value between 0 and 63. Calculate the corresponding row and column numbers
and store the results in constants named row and column.
*/

    val position = 55
    val row = position / 8
    val column = position % 8

    println("linha: $row, coluna: $column")
    exercisesSolved += 1

/*
8. A circle is made up of 2𝜋 radians, corresponding with 360 degrees. Declare a constant degrees of type Double and assign
it an initial value. Calculate the corresponding angle in radians and store the result in a constant named radians.*/

    val degrees: Double = 20.0
    val radians = degrees * PI / 180

    println("Radians: $radians")
    exercisesSolved += 1

/*
9. Declare four constants named x1, y1, x2 and y2 of type Double. These constants represent the two-dimensional
coordinates of two points. Calculate the distance between these two points and store the result in a constant named distance.
*/

    val x1: Double = 1.0
    val y1: Double = 10.0
    val x2: Double = 15.0
    val y2: Double = 30.0

    val distance = sqrt( (x2 - x1).pow(2) + (y2 - y1).pow(2))

    println("Distance: $distance")
    exercisesSolved += 1
    println("exercisesSolved = $exercisesSolved")



}