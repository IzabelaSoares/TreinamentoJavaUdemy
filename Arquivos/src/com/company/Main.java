package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        imprimirOpcao1();
        imprimirOpcao2();
        criarArquivoComConteudo();
        escreverEmArquivoComConteudo();
        criarPastasNoDiretorio();
        listarDiretorios();
    }

    public static void criarPastasNoDiretorio(){
        System.out.println("\nCriar Pasta Inicio");
        File caminho = new File("C:\\udemy\\TreinamentoJavaUdemy");
        Boolean sucesso = new File(caminho + "\\NovaPastaCriadaComSucesso").mkdir();
        System.out.println("Pasta Criada? " + sucesso);
        System.out.println("\nCriar Pasta Fim");
    }

    public static void listarDiretorios(){
        System.out.println("\nListar Pastas Inicio");
        File caminho = new File("C:\\udemy\\TreinamentoJavaUdemy");
        File[] arquivos = caminho.listFiles(File::isDirectory);

        for (File arquivo : arquivos) {
            System.out.println(arquivo);
        }
        System.out.println("\nListar Pastas Fim");
    }

    public static void escreverEmArquivoComConteudo(){
        String escrever[] = new String[]{"Agora", "Estou", "Escrevendo", "Mais", "Uma", "Linha"};
        System.out.println("\n**** Adicionar coisas ao final de um arquivo já existente ***");

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\udemy\\teste2.txt", true))){
            bw.newLine();
            bw.write("Adicionando Novas Palavras Ao Txt");
            bw.newLine();
            for(String i : escrever){
                bw.write(i);
                bw.newLine();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("\n**** Adicionado coisas ao final de um arquivo já existente ****");
    }

    public static void criarArquivoComConteudo(){
        String escrever[] = new String[]{"Cada", "Item", "No", "Array", "É", "Uma", "Linha"};
        System.out.println("\n**** Criar Arquivo com itens escritos ***");

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\udemy\\teste2.txt"))){
            for(String i : escrever){
                bw.write(i);
                bw.newLine();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("\n**** Arquivo com itens escritos criado    ***");
    }

    public static void imprimirOpcao2(){
        System.out.println("\n**** Inicio Opção 02 ****");
        String file = "C:\\udemy\\teste.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String linha = br.readLine();
            while (linha != null){
                System.out.println(linha);
                linha = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("**** Fim Opção 02 ****\n");
    }

    public static void imprimirOpcao1(){
        System.out.println("**** Inicio Opção 01 ****");
        File file = new File("C:\\udemy\\teste.txt");
        Scanner sc = null;

        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            if(sc != null)
                sc.close();
        }
        System.out.println("**** Fim Opção 01 ****");
    }
}
