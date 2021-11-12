package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> resultado = new HashMap<String, Integer>();

        try(BufferedReader br = new BufferedReader(new FileReader("C:\\udemy\\in.csv"))){
            String linha = br.readLine();
            while (linha != null){
                String[] candidatos = linha.split(","); //candidatos
                String candidato = candidatos[0]; //key
                Integer voto = Integer.parseInt(candidatos[1]); //value
                if(resultado.containsKey(candidato)){
                    voto += resultado.get(candidato);
                }
                resultado.put(candidato, voto);
                linha = br.readLine();
            }
        }
        catch (IOException exception){
            exception.printStackTrace();
        }

        for(String chave: resultado.keySet()){
            System.out.println(chave + ":" + resultado.get(chave));
        }
    }
}
