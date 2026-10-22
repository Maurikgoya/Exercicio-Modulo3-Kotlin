package com.mauri.exercicios_variaveis_e_condicionais

class Exercicio4 {
}

fun main() {
    print("digite um numero: ")
    var numero = readln().toInt()
    when {
        numero % 2 == 0 -> println("Esse numero é par")
        else -> println("Esse numero é ímpar")
    }
}