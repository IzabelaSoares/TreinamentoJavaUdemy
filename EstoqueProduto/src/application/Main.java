package application;

import entities.Produto;
import entities.StatusPedidoEnum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*
        Produto produto = new Produto();
        produto.nome = "Balinha";
        produto.quantidade = 5;
        produto.preco = 7.70;
        double totalEmEstoque = produto.precoTotalEstoque();
        System.out.printf("Preço total: %.2f%n", totalEmEstoque);

        produto.adicionarQuantidade(adicionar());
        produto.removerQuantidade(remover());
        totalEmEstoque = produto.precoTotalEstoque();
        System.out.printf("Preço total: %.2f%n", totalEmEstoque);
*/

        //teste enum
        System.out.println("\nTeste Enum");
        StatusPedidoEnum teste = StatusPedidoEnum.A_CAMINHO;
        System.out.println(teste.descricao.toString());

    }

    public static int adicionar(){
        System.out.println("Digite a quantidade para adicionar");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int remover(){
        System.out.println("Digite a quantidade para remover");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

}
