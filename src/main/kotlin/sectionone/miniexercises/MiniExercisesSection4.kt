package sectionone.miniexercises

import java.util.*

fun main() {
// Comparison operators
/* 1. Create a constant called myAge and set it to your age. Then, create a constant named isTeenager that uses
Boolean logic to determine if the age denotes someone in the age range of 13 to 19.
 */

    val myAge = 25
    val isTeenager = myAge in 13..19
    println("isTeenager? $isTeenager")


/* 2. Create another constant named theirAge and set it to the age 30. Then, create a constant named bothTeenagers
that uses Boolean logic to determine if both you and them are teenagers.
 */
    val theirAge = 30
    val bothTeenagers = theirAge >= 13 && theirAge <= 19 && isTeenager
    println("bothTeenagers? $bothTeenagers")

/* 3. Create a constant named reader and set it to your name as a string. Create a constant named author and set it
to the name Richard Lucas. Create a constant named authorIsReader that uses string equality to determine if reader
and author are equal. */

    val reader = "Isabella"
    val author = "Richard Lucas"

    val authorIsReader = reader == author
    println("authorIsReader? $authorIsReader")

/* 4. Create a constant named readerBeforeAuthor which uses string comparison to determine if reader comes before
author */

    val readerBeforeAuthor = reader < author
    println("readerBeforeAuthor? $readerBeforeAuthor")

// Loops
/* 1. Create a variable named counter and set it equal to 0. Create a while loop with the condition counter < 10
which prints out counter is X (where X is replaced with counter value) and then increments counter by 1. */

    var counter = 0

    while (counter < 10) {
        println("counter is $counter")
        counter += 1
    }

/* 2. Create a variable named counter and set it equal to 0. Create another variable named roll and set it equal to 0.
Create a do-while loop. Inside the loop, set roll equal to Random().nextInt(6) which means to pick a random number
between 0 and 5. Then increment counter by 1.
Finally, print After X rolls, roll is Y where X is the value of counter and Y is the value of roll. Set the loop
condition such that the loop finishes when the first 0 is rolled. */

    var roll = 0

    do {
        roll = Random().nextInt(6)
        counter += 1
        println("After $counter rolls, roll is $roll where $counter is the value of counter and $roll is the value of roll")
    } while (roll > 0)

}