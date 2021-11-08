package aplication;

public class Main {

    public static void main(String[] args) {
        Conta contaBancaria1 = new Conta("Izabela", 13111998);
        System.out.println(contaBancaria1);
        contaBancaria1.depositarValores(153.58);
        contaBancaria1.sacarValores(58.50);
        System.out.println(contaBancaria1);

        Conta contaBancaria2 = new Conta("Izabela", 13111997, 55.50);
        System.out.println(contaBancaria2);
        contaBancaria2.depositarValores(1123.58);
        contaBancaria2.sacarValores(558.50);
        System.out.println(contaBancaria2);


    }
}
