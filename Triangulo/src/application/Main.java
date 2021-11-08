package application;
import entities.Triangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle x, y = new Triangle();
        //triangulo x
        x = solicitarValores();
        double valorX = x.calcularArea();

        //triangulo y
        y = solicitarValores();
        double valorY = y.calcularArea();

        //comparar
        compararTriangulos(valorX, valorY);
    }

    public static Triangle solicitarValores() {
        Triangle z = new Triangle();
        Scanner sc = new Scanner(System.in);
        z.a = sc.nextDouble();
        z.b = sc.nextDouble();
        z.c = sc.nextDouble();
        return z;
    }

    public static void compararTriangulos(double valorX, double valorY){
        if(valorX > valorY){
            System.out.printf("A maior área é do triangulo X: ... %.2f", valorX);
        }
        else{
            System.out.printf("A maior área é do triangulo Y: ... %.2f", valorY);
        }
    }

}
