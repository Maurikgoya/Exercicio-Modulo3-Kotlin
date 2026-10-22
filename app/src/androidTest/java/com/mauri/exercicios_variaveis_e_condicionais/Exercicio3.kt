package com.mauri.exercicios_variaveis_e_condicionais

class Exercicio3 {
}

fun main() {
    print("digite um numero: ")
    var numero = readln().toInt()
    if (numero % 2 == 0 ){
        println("Esse numero é par")
    }else {
        println("Esse numero é ímpar")
    }
}
