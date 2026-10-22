package com.mauri.exercicios_variaveis_e_condicionais

class Exercicio6 {


fun main() {
val lista = mutableListOf<Int>()
    var a = 1

    for (a in 1..99){
        lista.add(a)
    }
    //println(lista)

    var soma = 0
    a = 0
    while(a < lista.size){
        soma = soma + lista[a]
        a++
    }
    println("O valor total da soma é $soma")

}
}