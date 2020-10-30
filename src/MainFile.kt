import kotlin.random.Random

// save user / computer count
// keep track of the winner
// create function to generate random numbers
// get users input
// if random number is (1 ? paper), (2 ? rock) : scissors
// compare choices in while loop and end loop when winner variable is 5
var computerCounter = 0;
var userCounter = 0;
var winner = 0;

fun main() {


    val randomNumber =  Random.nextInt(0,2)
    println(randomNumber)


    var computerChoice = generateStringValue(randomNumber)
    println("Please enter a value")
    var enteredString = readLine()



    while(winner <= 5) {
        compareChoices(enteredString, generateStringValue(randomNumber))
        println("Please enter a value")
        enteredString = readLine()

    }

}


// compare choices
fun compareChoices(user: String?, computer: String) {
    if(user == computer) {
        println("it's a tied!")
    }else if(user == "paper" && computer == "rock") {
        userCounter++
        winner++
        println("user choose $user, computer choose $computer")
    } else if(user == "rock" && computer == "scissors") {
        userCounter++
        winner++
        println("user choose $user, computer choose $computer")

    } else if(user == "scissors" && computer == "paper") {
        userCounter++
        winner++
        println("user choose $user, computer choose $computer")

    } else if (computer == "paper" && user == "rock") {
        computerCounter++
        winner++
        println("computer choose $computer, user choose $user")

    } else if(computer == "rock" && user == "scissors") {
        computerCounter++
        winner++
        println("computer choose $computer, user choose $user")

    } else if(computer == "scissors" && user == "paper") {
        computerCounter++
        winner++
        println("computer choose $computer, user choose $user")

    }
}

// return string value
fun generateStringValue(randomNumber: Number): String {
    return when (randomNumber) {
        0 -> {
            "rock"
        }
        1 -> {
            "paper"
        }
        else -> {
            "scissors"
        }
    }
}