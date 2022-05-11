fun main(args: Array<String>) {
    for ( i in 1..3) {
        val titular: kotlin.String = "Karina $i"
        val numeroConta: kotlin.Int = 1234 + i
        var saldo: kotlin.Double = i + 10.0


        kotlin.io.println(
            "Titular: $titular " +
                    "\n Numero da Conta: $numeroConta " +
                    "\n Saldo: $saldo"
        )
        println()

    }

    //testaCondicoes(saldo)
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")
}

fun testaCondicoes( saldo: Double){
    when {
        saldo > 0.0 -> println("Seu saldo esta positivo")
        saldo == 0.0 -> println("Sua conta esta zerada")
        else -> println("Seu saldo esta negativo")
    }
}