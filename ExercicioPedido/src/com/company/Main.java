package com.company;

import Enumerations.EProcessamentoPedido;
import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;

import java.sql.Date;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Izabela Maria", Date.valueOf("1998-11-13"), "64190740020", "iza@gmail.com");
        Pedido pedido = new Pedido(cliente, EProcessamentoPedido.EM_PROCESSO);
        Produto produto1 = new Produto("TV", 1000.00);
        Produto produto2 = new Produto("Mouse", 40.00);

        ItemPedido item1 = new ItemPedido(1, produto1);
        ItemPedido item2 = new ItemPedido(2, produto2);

        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        System.out.println(pedido);
    }
}
