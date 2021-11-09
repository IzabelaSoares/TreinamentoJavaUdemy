package com.company;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>();
        lista.add(new PessoaFisica("Izabela Maria", 50000.0, 2000.0));
        lista.add(new PessoaJuridica("PayTrack Despesas e Reembolsos", 400000.0, 135));

        System.out.println("Lista de Pessoas\n");
        lista.forEach(pessoa -> System.out.println(pessoa));

    }
}
