package application;

import entities.Quarto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Quarto> quartosAlugueis = new ArrayList<Quarto>();

        quartosAlugueis.add(new Quarto("1", "Izabela", "iza@gmail.com", 700.0));
        quartosAlugueis.add(new Quarto("2", "Ana", "ana@gmail.com", 750.0));
        quartosAlugueis.add(new Quarto("3", "Clara", "clara@gmail.com", 800.0));
        quartosAlugueis.add(new Quarto("4", "Maria", "maria@gmail.com", 900.0));

        //ordenar pelo morador e imprimir
        Collections.sort(quartosAlugueis, (a, b) -> a.getMorador().compareTo(b.getMorador()));
        quartosAlugueis.forEach(n -> System.out.println(n));
    }
}
