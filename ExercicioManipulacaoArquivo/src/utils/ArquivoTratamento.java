package utils;

import entities.Item;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArquivoTratamento {

    private List<String> lista = new ArrayList<>();

    public void passarParaArray(List<Item> items){
        for(Item i: items){
           // lista.add(i.toString());
            lista.add(i.toStringSegundaOpcao());
        }
        //gerarArquivoEntrada();
        gerarArquivoSaida();
    }

    private void gerarArquivoEntrada(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\udemy\\entrada.csv"))){
            for (var i : lista){
                bw.write(i + "\n");
            }
            System.out.println("Processo Finalizado!");
        }
        catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }

    private void gerarArquivoSaida(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\udemy\\saida.csv"))){
            for (var i : lista){
                bw.write(i + "\n");
            }
            System.out.println("Processo Finalizado!");
        }
        catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }

}
