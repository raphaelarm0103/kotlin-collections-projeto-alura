package br.com.alura

fun testaMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 64.0),
        3 to 54.0,
        4 to 80.0,
        5 to 100.0,
        6 to 150.0
    )
    val valorPedido = pedidos.get(5)
    println(pedidos.getOrElse(6) {
        "Não tem o pedido"
    })
    println(pedidos.getOrDefault(1, -1.0))

    for(numero in pedidos.keys){
        println("Pedido $numero")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50
    }
    println(pedidosFiltrados)



    println(valorPedido)
    println(pedidos)
    val pedido = pedidos[2]
    pedido?.let { println("pedido $it") }
    for (p in pedidos) {
        println("número do pedido ${p.key}")
        println("valor do pedido ${p.value}")
    }

    pedidos[4] = 70.0
    println(pedidos)
    pedidos[5] = 80.0
    println(pedidos)
    pedidos[1] = 100.0
    println(pedidos)
    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)
}