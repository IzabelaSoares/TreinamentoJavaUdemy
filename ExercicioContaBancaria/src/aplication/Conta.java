package aplication;

public class Conta {
    //propriedades
    private String usuario;
    private double saldo;
    private int numero;

    //constante taxa de saque
    private static final double taxaSaque = 5.0;

    //construtor
    public Conta(String usuario, int numero) {
        this.usuario = usuario;
        this.numero = numero;
    }

    public  Conta(String usuario, int numero, double depositoInicial){
        this.usuario = usuario;
        this.numero = numero;
        depositarValores(depositoInicial);
    }

    //metodos (sacar, depositar, informar dados da conta)
    public void sacarValores(double valor) {
        if (valor <= 0 || valor > (saldo - taxaSaque)) {
            System.out.println("Impossivel Sacar!");
        } else {
            saldo -= valor + taxaSaque;
            System.out.printf("Saldo atualizado....: %.2f%n", saldo);
        }
    }

    public void depositarValores(double valor) {
        if (valor <= 0) {
            System.out.println("Impossivel Depositar!");
        } else {
            saldo += valor;
            System.out.printf("Saldo atualizado....: %.2f%n", saldo);
        }
    }

    public String toString(){
        return String.format("\nUsuário: %s\nNúmero da Conta: %d\nSaldo: %.2f%n", usuario, numero, saldo);
    }

    //getters e setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

}
