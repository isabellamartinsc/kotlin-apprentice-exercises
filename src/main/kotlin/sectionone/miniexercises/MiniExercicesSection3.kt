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
}
