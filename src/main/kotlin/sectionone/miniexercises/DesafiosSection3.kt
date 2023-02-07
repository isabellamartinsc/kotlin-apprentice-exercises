package sectionone.miniexercises


fun main() {

/* 1. Create a constant called coordinates and assign a pair containing two and three to it. */

    val coordinates = Pair(2, 3)
    println(coordinates)

/* 2. Extract the values 2 and 3 from coordinates into two variables called row and column. */
    val row = coordinates.first
    val column = coordinates.second

    println("Row: $row, Column: $column")

/* 3. Which of the following are valid statements?

     val character: Character = "Dog" -> Character type not recognized with Kotlin and wrong String value attributed.
     val character: Char = 'd' -> Valid
     val string: String = "Dog" -> Valid
     val string: String = 'd' -> Wrong value attributed, it must be string as "d". */


/*4. Is this valid code?
     val date = Triple(15, 8, 2015)
     val day = date.First -> date.First must be date.first. */


/* 5. What is wrong with the following code?
      val name = "Joe"
      name += " Howard" -> must be var name = "Joe". */


/* 6. What is the type of the constant named value?
      val triple = Triple(100, 1.5, 10)
      val value = triple.second  -> the type of constant named value is Double. */


/* 7. What is the value of the constant named month?
      val newDate = Triple(15, 8, 2015)
      val month = newDate.second -> the type of constant named month is Int. */


/* 8. What is the value of the constant named summary?
      val number = 10
      val multiplier = 5
      val summary = "$number multiplied by $multiplier equals ${number * multiplier}"  -> the type of constant named
      summary is String. */

/* 9. What is the sum of a and b, minus c? What is its type?
      val a = 4
      val b: Short = 100
      val c: Byte = 12 */

    val a = 4
    val b: Short = 100
    val c: Byte = 12

    val result = (a + b) - c
    println("result is $result and type is Int.") // result is 92 and type is Int.

/* 10. What is the numeric difference between kotlin.math.PI and kotlin.math.PI.toFloat()? -> kotlin.math.PI is double
and have more bytes and more precision.  */

    val mathPI = kotlin.math.PI
    val mathPiToFloat = kotlin.math.PI.toFloat()

    println("mathPI = $mathPI, mathPIFloat = $mathPiToFloat")

}
