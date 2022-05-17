package sistemalanchonete

import  sistemalanchonete.produtos.*
import  sistemalanchonete.lanchonete.*
import kotlin.system.exitProcess

fun main() {
    println("Bem vindo ao SimCity FastFood  ")
    println("Digite 1 para X Burger, 2 para X Salada")
    var opcao = readln().toInt()

    val lanche: Produto = Lanche()
    val bebida: Produto = Bebida()

    when (opcao) {
        1 -> {
            lanche.nome = "X Burger"
            lanche.valor = 10.0
            lanche.quantidade = 1
        }
        2 -> {
            lanche.nome = "X Salada"
            lanche.valor = 12.0
            lanche.quantidade = 1
        }
    }
    val pedido: Pedido = Pedido()
    pedido.adicionarProduto(lanche)
    pedido.exibirProdutos()

    println("Que tal uma bebida?")
    println("Digite 1 para refrigerante, 2 para suco.")
    opcao = readln().toInt()

    when (opcao) {
        1 -> {
            bebida.nome = "refrigerante"
            bebida.valor = 08.0
            bebida.quantidade = 1

        }
        2 -> {
            bebida.nome = "suco"
            bebida.valor = 06.0
            bebida.quantidade = 1
        }
    }

    pedido.adicionarProduto(bebida)
    println("Seu pedido ficou:")
    pedido.exibirProdutos()

    println("Digite 1 para remover lanche, 2 para remover bebida ou 3 para finalizar.")
    opcao = readln().toInt()
    when (opcao) {
        1 -> pedido.removerProduto(lanche.codigo)
        2 -> pedido.removerProduto(bebida.codigo)
        3 -> {
            println("Obrigada pela preferência, quando bater a fome, já sabe onde procurar!")
            exitProcess(0)
        }
    }

    pedido.exibirProdutos()
}

