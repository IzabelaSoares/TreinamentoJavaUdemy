package com.company;
import entities.Conta;
import exceptions.Excecao;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Conta conta = new Conta(1311, "Iza", 500.00);

        System.out.println(conta);

        try{
            conta.depositar(700.00);
            conta.sacar(550.00);
        }
        catch (Excecao e){
            System.out.println(e.getMessage());
        }

        System.out.println(conta);

    }
}
