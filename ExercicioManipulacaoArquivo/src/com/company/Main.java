package com.company;
import entities.Item;
import entities.Produto;
import utils.ArquivoTratamento;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new Item(new Produto("TV LED", 1219.99), 1));
        items.add(new Item(new Produto("Video Game Chair", 350.50), 3));
        items.add(new Item(new Produto("Iphone X", 900.0), 2));
        items.add(new Item(new Produto("Samsung Galaxy 9", 850.00), 2));

        ArquivoTratamento arquivoTratamento = new ArquivoTratamento();
        arquivoTratamento.passarParaArray(items);

    }

}
