fun main() {
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber)
    println (evenNumbers)
}


fun isEvenNumber(number: Int) = number % 2 == 0