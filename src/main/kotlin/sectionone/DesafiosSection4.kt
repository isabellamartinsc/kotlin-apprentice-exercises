package sectionone

fun main() {

/* 1. What’s wrong with the following code?
val firstName = "Joe"

if (firstName == "Howard") {
  val lastName = "Lucas"
} else if (firstName == "Ray") {
  val lastName = "Wenderlich"
}

val fullName = firstName + " " + lastName */


/* 2. In each of the following statements, what is the value of the Boolean answer constant?
val answer1 = true && true
val answer2 = false || false
val answer3 = (true && 1 != 2) || (4 > 3 && 100 < 1)
val answer4 = ((10 / 2) > 3) && ((10 % 2) == 0) */

/* 3. Suppose the squares on a chessboard are numbered left to right, top to bottom, with 0 being the top-left square
and 63 being the bottom-right square. Rows are numbered top to bottom, 0 to 7. Columns are numbered left to right,
0 to 7. Given a current position on the chessboard, expressed as a row and column number, calculate the next position
on the chessboard, again expressed as a row and column number. The ordering is determined by the numbering from 0 to 63.
The position after 63 is again 0. */

/* 4. Given the coefficients a, b and c, calculate the solutions to a quadratic equation with these coefficients.
Take into account the different number of solutions (0, 1 or 2). If you need a math refresher, this Wikipedia
article on the quadratic equation will help: https://en.wikipedia.org/wiki/Quadratic_formula. */

/* 5. Given a month (represented with a string in all lowercase) and the current year (represented with an Int),
calculate the number of days in the month. Remember that because of leap years, “february” has 29 days when the year
is a multiple of 4 but not a multiple of 100. February also has 29 days when the year is a multiple of 400. */

/* 6.Given a number as a Double value, determine if this number is a power of 2.

Hint: You can use log2(number) to find the base 2 logarithm of number. log2(number) will return a whole number
if number is a power of two. Add import kotlin.math.log2 to the top of your file to use log2.
ou can also solve the problem using a loop and no logarithm. */

/* 7. Print a table of the first 10 powers of 2. */

/* 8. Given a number n, calculate the n-th Fibonacci number. (Recall Fibonacci is 1, 1, 2, 3, 5, 8, 13, … Start
with 1 and 1 and add these values together to get the next value. The next value is the sum of the previous
two. So the next value in this case is 8+13 = 21.) */

/* 9. Given a number n, calculate the factorial of n. (Example: 4 factorial is equal to 1 * 2 * 3 * 4.) */

/* 10. Given a number between 2 and 12, calculate the odds of rolling this number using two six-sided dice.
Compute it by exhaustively looping through all of the combinations and counting the fraction of outcomes that
give you that value. Don’t use a formula. */

}