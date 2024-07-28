abstract class Drink(name: String, price: Double): Food(name, price) {
    abstract fun pour(): String
}

class Juice(name: String, price: Double): Drink(name, price) {
    override fun pour(): String {
        return "Verter el jugo en un vaso."
    }

    override fun cook(): String {
        return "Exprimir las frutas, agregar un poco de agua y azucar"
    }
}