package application;
import entities.ECargos;
import entities.EDepartamentos;
import entities.Trabalhador;

public class Main {
    public static void main(String[] args) {

        Trabalhador trabalhador = new Trabalhador("Izabela", 3500.0, EDepartamentos.DESENVOLVIMENTO, ECargos.TREINEE);

        System.out.println(trabalhador);
        trabalhador.adicionarContrato(20.5, 25);
    }
}
