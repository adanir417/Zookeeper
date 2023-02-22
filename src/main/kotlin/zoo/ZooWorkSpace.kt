package zoo


var exit = 0
var animalNumber = 0
var value = ""
var checkDigitNumber: Boolean = false
val animalList = mutableListOf(
    Animals.CAMEL.animal,
    Animals.LION.animal,
    Animals.DEER.animal,
    Animals.GOOSE.animal,
    Animals.BAT.animal,
    Animals.RABBIT.animal
)


fun writeSomeText() {
    println(AnimalText.I_LOVE_ANIMALS.text)
    println(AnimalText.CHECK_ON_THE_ANIMALS.text)
    println(AnimalText.DEER_LOOKS_FINE.text)
    println(AnimalText.BAT_LOOKS_HAPPY.text)
    println(AnimalText.LION_LOOKS_HEALTHY.text)
}

fun showAnimal() {
    print("Please enter the number of the habitat you would like to view: ")
    val numberOfAnimal = readln().toInt()
    val animalList = mutableListOf(
        Animals.CAMEL.animal,
        Animals.LION.animal,
        Animals.DEER.animal,
        Animals.GOOSE.animal,
        Animals.BAT.animal,
        Animals.RABBIT.animal
    )
    //val animalList = mutableListOf(camel,lion,deer,goose,bat,rabbit)

    println(animalList[numberOfAnimal])
    println(
        """---
You've reached the end of the program. To check another habitat, please restart the watcher."""
    )
}



fun showAnimalUltra() {
    try {
        while (exit == 0) {
            println("Please enter the number of the habitat you would like to view: ")
            value = readln().toString()
            for (v in value) {
                //println("value : ${value}")
                checkDigitNumber = v.isDigit()

            }
            if (checkDigitNumber)
            {
                //println("value : ${value}")
               animalNumber = value.toInt()
            }

            //println("digitNumber : ${checkDigitNumber}")
            //println("animalNumber : ${animalNumber}")
            when {
                value == "exit" -> {
                    println("See you later!")
                    exit = 1
                }

               checkDigitNumber && animalNumber in 0 until animalList.size -> {
                  println(animalList[animalNumber])
                   animalNumber = 0
                   checkDigitNumber = false
                }
            }

        }

    } catch (e: Exception) {
        e.printStackTrace()
    }



}
