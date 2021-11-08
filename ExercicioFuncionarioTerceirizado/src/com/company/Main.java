package com.company;
import entities.Empregado;
import entities.EmpregadoTerceiro;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Empregado> listaEmpregados = new ArrayList<>();
        listaEmpregados.add(new Empregado("Izabela", 15, 15.70));
        listaEmpregados.add(new Empregado("Maria Clara", 20, 25.0));
        EmpregadoTerceiro empregadoTerceiro = new EmpregadoTerceiro("Mainha", 100, 15.0);
        empregadoTerceiro.setDespesaAdicional(200.0);
        listaEmpregados.add(empregadoTerceiro);
        listaEmpregados.add(new Empregado("Thaize", 13, 10.20));

        System.out.println("Lista de Empregados e Salários\n");
        listaEmpregados.forEach(empregado -> System.out.println(empregado));

    }
}
