import kotlin.random.Random

// save user / computer count
// keep track of the winner
// create function to generate random numbers
// get users input
// if random number is (1 ? paper), (2 ? rock) : scissors
// compare choices in while loop and end loop when winner variable is 5
var computerCounter = 0;
var userCounter = 0;
var winner : Number = 0;

fun main() {


    val randomNumber =  Random.nextInt(0,2)
    println(randomNumber)

//    println("please enter a value")
//    val userValue = readLine();

    var computerChoice = generateStringValue(randomNumber)
    val enteredString = readLine()
}

// compare choices
fun compareChoices(user: String, computer: String) {
    if(user == computer) {
        println("it's a tied!")
    }else if(user == "paper" && computer == "rock") {
        userCounter++
        println("user choose $user, computer choose $computer")
    } else if(user == "rock" && computer == "scissors") {
        userCounter++
        println("user choose $user, computer choose $computer")

    } else if(user == "scissors" && computer == "paper") {
        userCounter++
        println("user choose $user, computer choose $computer")

    } else if (computer == "paper" && user == "rock") {
        computerCounter++
        println("computer choose $computer, user choose $user")

    } else if(computer == "rock" && user == "scissors") {
        computerCounter++
        println("computer choose $computer, user choose $user")

    } else if(computer == "scissors" && user == "paper") {
        computerCounter++
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