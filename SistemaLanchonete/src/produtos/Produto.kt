package sistemalanchonete.produtos

open class Produto {
    var codigo: Int = 0
    var nome: String = ""
    var quantidade: Int = 0
    var valor: Double = 0.0

    fun exibirItem() {
        println("${this.codigo} - ${this.quantidade} ${this.nome} - " + this.valorTotal())
    }

    fun valorTotal(): Double {
        return (this.valor * this.quantidade)

    }

}

