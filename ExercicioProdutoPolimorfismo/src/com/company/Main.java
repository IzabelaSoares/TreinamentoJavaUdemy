package com.company;
import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;
import java.sql.Date;
import java.util.ArrayList;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(new ProdutoImportado("Tablet", 260.0, 20.0));
        listaProdutos.add(new ProdutoUsado("Iphone", 400.0, Date.valueOf("2017-12-15")));
        listaProdutos.add(new Produto("Notebook", 1100.0));

        System.out.println("Lista de Produtos\n");
        listaProdutos.forEach(produto -> System.out.println(produto + "\n"));

    }
}
