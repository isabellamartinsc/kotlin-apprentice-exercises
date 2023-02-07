package sectionone.miniexercises

fun main() {
//Types & Operations

/* 1. Create a string constant called firstName and initialize it to your first name. Also create a string constant
called lastName and initialize it to your last name.
*/
    val firstName = "Isabella"
    val lastName = "Martins"
    println("$firstName $lastName")

/* 2. Create a string constant called fullName by adding the firstName and lastName constants together,
separated by a space. */
    val fullName = "$firstName $lastName"
    println(fullName)

/*3. Using string templates, create a string constant called myDetails that uses the fullName constant to create a
string introducing yourself. For example, it could read: "Hello, my name is Joe Howard.". */
    val myDetails = "Hello, my name is $fullName."
    println(myDetails)


//Pairs and Triples

/*1. Declare a constant Triple that contains three Int values. Use this to represent a date (month, day, year).*/

    val date: Triple<Int, Int, Int> = Triple(first = 2, second = 10, third = 2023)
    println(date)

/*2. Extract the values in the triple into three constants named month, day and year.*/

    val month = date.second
    val day = date.first
    val year = date.third

    println("Format date in Brazil is: $day/$month/$year.")

/*3. In one line, read the month and year values into two constants. You’ll need to employ the underscore to
ignore the day.*/

    var (_, monthConst, yearConst) = date

/*4.Since the values inside Pairs and Triples cannot be modified, you will need to extract the values from them,
make any modifications you want, and then create a new Pair or Triple. Using the values you extracted in step three,
modify the month value and create a new Pair containing the modified month along with the unmodified year.*/

    monthConst = 8
    val updateDate = Pair(monthConst, year)
    println(updateDate)
}
