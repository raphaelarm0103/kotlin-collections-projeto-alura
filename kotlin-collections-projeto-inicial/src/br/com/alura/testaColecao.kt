package br.com.alura

fun testaColecao() {
    val bancoDeNomes = BancoDeNomes()
    val nomesSalvos = bancoDeNomes.nomes
//        bancoDeNomes.nomes.add("Raphael")
    bancoDeNomes.salva("Raphael")
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes(){
    val nomes: Collection<String> get() = Companion.dados.toList() // imutavel

    fun salva(nomes: String){
        Companion.dados.add(nomes)
    } // método para salvar nomes

    companion object {
        private val dados = mutableListOf<String>() // mutavel
    }       // Companion object na coleção mutável para manter os dados

}
