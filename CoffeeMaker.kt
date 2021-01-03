package chap07.coffeMaker

class CoffeeMaker(val coffeeModule: CoffeeModule){
    fun brew(){
        val theSiphon: Thermosiphon = coffeeModule.getThermosiphon()
        theSiphon.on()
        theSiphon.pump()
        println("Coffee, here! Enjoy!~")
        theSiphon.off()
    }
}

fun main(){
    val coffeemaker = CoffeeMaker(MyDripCoffeeModule())
    coffeemaker.brew()
}