package sistemalanchonete.lanchonete

import sistemalanchonete.produtos.*

class Pedido {

    val itens: MutableList<Produto> = mutableListOf<Produto>()

    fun exibirProdutos() {

        this.itens.forEach {

            it.exibirItem()

        }
        println("Valor total até aqui: " + this.valorTotal())
    }

    fun adicionarProduto(produto: Produto) {
        produto.codigo = this.itens.size
        this.itens.add(produto.codigo, produto)
    }

    fun removerProduto(codigo: Int) {
        this.itens.removeAt(codigo)
    }

    fun valorTotal(): Double {
        var resultado: Double = 0.0
        this.itens.forEach {
            resultado += it.valor
        }
        return resultado
    }
}

