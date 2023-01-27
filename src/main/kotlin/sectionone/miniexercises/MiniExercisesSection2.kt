package sectionone.miniexercises

fun main() {
    //Expressions, variables and constants

/*1. Declare a constant of type Int called myAge and set it to your age.*/
    val myAge: Int = 25
    println("myAge = $myAge")

/*2. Declare a variable of type Double called averageAge. Initially, set it to your own age.
Then, set it to the average of your age and the age of 30.*/
    var averageAge: Double = 25.0
    averageAge = (averageAge + 30) / 2
    println("averageAge = $averageAge")

/*3. Create a constant called testNumber and initialize it with whatever integer you’d like.
Next, create another constant called evenOdd and set it equal to testNumber modulo 2.
Now change testNumber to various numbers. What do you notice about evenOdd?*/
    val testNumber: Int = 10
    val evenOdd = testNumber % 2
    println("par é 0, impar é 1 -> testNumber = $evenOdd")

/*4. Create a variable called answer and initialize it with the value 0.
Increment it by 1. Add 10 to it. Multiply it by 10. Then, shift it to the right by 3.
After all of these operations, what’s the answer?*/
    var answer: Int = 0
    answer += 1
    answer += 10
    answer *= 10
    answer = answer shr 3
    println("answer is: $answer")

    //Types and Operations

/*1. Create a constant called age1 and set it equal to 42. Create a constant called age2 and set it equal to 21.
Check using Control+Shift+P that the type for both has been inferred correctly as Int.*/
    val age1 = 42
    val age2 = 21
    //answer: type inferred correctly.

/*2. Create a constant called avg1 and set it equal to the average of age1 and age2 using the naive operation
(age1 + age2) / 2. Use Control+Shift+P to check the type and check the result of avg1. Why is it wrong?*/
    val avg1 = (age1 + age2) / 2
    println("avg1: $avg1")

/*3. Correct the mistake in the above exercise by converting age1 and age2 to type Double in the formula.
Use Control+Shift+P to check the type and check the result of avg1. Why is it now correct?*/
    val avg11: Double = (age1.toDouble() + age2.toDouble()) / 2
    println("avg1: $avg11")
}
