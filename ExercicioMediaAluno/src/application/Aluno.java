package application;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    public String nome;
    public double media;
    public List<Double> notas = new ArrayList<Double>();
    public boolean status;
    
    public double calcularMedia(){
        int i = 0;
        while (i < notas.size()){
            media += notas.get(i);
            i++;
        }
        return media/i;
    }
    
    public boolean verificarAprovacao(){
        return media > 6;
    }
    
    public String toString(){
        return  String.format("Aluno: %s \nMedia: %.2f \nAprovado: %b", nome, media, status);
    }
}