import utils.ConversorMoeda;

public class Main {
    public static void main(String[] args) {
        double quantidade = 200.0;
        double dolarAtual = 3.10;

        System.out.printf("Total a pagar: %.2f", ConversorMoeda.converterDolar(quantidade, dolarAtual));
    }
}
