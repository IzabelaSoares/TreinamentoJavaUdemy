package com.company;
import entities.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("TV", 900.00));
        produtos.add(new Produto("Mouse", 50.00));
        produtos.add(new Produto("Tablet", 350.50));
        produtos.add(new Produto("HD Case", 80.90));

        //predicated
        /*
        produtos.removeIf(Produto::verificarPrecoStatic);
        produtos.removeIf(Produto::verificarPrecoNaoStatic);
        produtos.removeIf(produto -> produto.getPreco() >= 100.0);
        produtos.forEach(produto -> System.out.println(produto));
        */

        //consumer
        /*
        produtos.forEach(Produto::atualizarPrecoNaoStatic);
        produtos.forEach(Produto::atualizarPrecoStatic);
        produtos.forEach(produto -> produto.setPreco(produto.getPreco() * 1.1));
        produtos.forEach(System.out::println);
         */

        //function - map
        /*
        List<String> staticNomes = produtos.stream().map(Produto::transformarProdutoEmStringStatic).collect(Collectors.toList());
        List<String> naoStaticNomes = produtos.stream().map(Produto::transformarProdutoEmStringNaoStatic).collect(Collectors.toList());
        List<String> nomes = produtos.stream().map(produto -> produto.getNome().toUpperCase()).collect(Collectors.toList());
        nomes.forEach(System.out::println);
        */

        //usar a function como parametro
        Double soma = produtos.stream().filter(p -> p.getNome().charAt(0) == 'T').mapToDouble(p -> p.getPreco()).sum();
        System.out.println(soma);
    }
}
