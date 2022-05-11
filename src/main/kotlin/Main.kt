fun main(args: Array<String>) {
    //println("Program arguments: ${args.joinToString()}")
    val contaMaria = Conta()
    contaMaria.titular = "Maria"
    contaMaria.numero = 1000
    contaMaria.saldo = 100.0

    println(contaMaria.titular)
    println(contaMaria.numero)
    println(contaMaria.saldo)

    val contaJose = Conta()
    contaJose.titular = "Jose"
    contaJose.numero = 1001
    contaJose.saldo = 200.0

    println(contaJose.titular)
    println(contaJose.numero)
    println(contaJose.saldo)

    deposita (contaMaria, 50.0)
    deposita (contaJose, 10.0)
    println(contaMaria.saldo)
    println(contaJose.saldo)
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun deposita ( conta: Conta, valor: Double){
    conta.saldo += valor
}

fun testaReferencias(){
    val novaConta = Conta()
    novaConta.titular = "Carlos"
    println(novaConta.titular)
}

fun testaCondicoes( saldo: Double){
    when {
        saldo > 0.0 -> println("Seu saldo esta positivo")
        saldo == 0.0 -> println("Sua conta esta zerada")
        else -> println("Seu saldo esta negativo")
    }
}

fun testaLacos(){
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
    for ( j in 8 downTo 1 step 2){
        if ( j == 2){
            break
        }
        if ( j == 4){
            continue
        }
        println(j)
    }
    var k = 0

    while ( k < 3){
        println(k)
        k++
    }
}