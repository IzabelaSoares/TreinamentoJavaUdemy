package application;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double calcularSalario(){
        return salarioBruto - imposto;
    }

    public double aumentarSalario(double porcentagemAumento){
        return salarioBruto += (salarioBruto * porcentagemAumento / 100.0);
    }

}
