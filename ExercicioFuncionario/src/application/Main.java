package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Funcionario colaborador = new Funcionario();
        colaborador.nome = "Maria Clara";
        colaborador.salarioBruto = 2500.0;
        colaborador.imposto = 500.0;
        imprimirValores(colaborador);

        colaborador.aumentarSalario(informarAumento());
        imprimirValores(colaborador);
    }

    public static double informarAumento(){
        System.out.println("Informe quantos por cento deseja dar ao funcionário: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public static void imprimirValores(Funcionario colaborador){
        System.out.printf("Nome: %s \nSalario Bruto: %.2f \nSalario Liquido: %.2f \nImposto: %.2f \n",
                colaborador.nome, colaborador.salarioBruto, colaborador.calcularSalario(), colaborador.imposto);
    }

}
