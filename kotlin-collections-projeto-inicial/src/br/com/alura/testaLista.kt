package br.com.alura

fun testaLista() {
    val nomes: Collection<String> = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )
    for (nome in nomes.iterator()) {
        println(nome)
    }
    println(nomes)
}
