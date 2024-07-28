abstract class Food(val name: String, var price: Double) {
    abstract fun cook(): String
}

class Burger(name: String, price: Double): Food(name, price){
    override fun cook(): String {
        return "Preparar la carne y los ingredientes para luego ponerlo sobre el pan"
    }
}

class Pizza(name: String, price: Double): Food(name, price){
    override fun cook(): String {
        return "Amasar la masa, colocarle los ingredientes y meterlo al horno"
    }
}

class IceCream(name: String, price: Double): Dessert, Food(name, price) {
    override fun cook(): String {
        return "Prepara el sabor de tu helado, vierte en un molde y enfria a -20°C."
    }
    override fun eat(): String {
        return "Comer el helado con una cuchara."
    }
}

