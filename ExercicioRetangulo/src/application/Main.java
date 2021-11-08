package application;
public class Main {
    public static void main(String[] args) {
        Retangulo rec = new Retangulo();
        rec.largura = 3.0;
        rec.altura = 4.0;

        double area = rec.calcularArea();
        double perimetro = rec.calcularPerimetro();
        double diagonal = rec.calcularDiagonal();

        System.out.printf("Altura: %.2f e Largura: %.2f", rec.altura, rec.largura);
        System.out.printf("\nArea: %.2f \nPerimetro: %.2f \nDiagonal: %.2f",area, perimetro, diagonal);
    }
}
