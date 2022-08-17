fun main () {

    /*
    2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
     */
    var contadorPar = 0
    var contadorImpar = 0

    for (i in 1..10) {
        println("digite os numeros: ")
        val num = readln().toInt()

        if (num % 2 == 0) {
            contadorPar++
        } else {
            contadorImpar++
        }
    }
    println("total numeros par $contadorPar")
    println("total numeros impar $contadorImpar")
}
