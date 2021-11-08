package utils;

public class ConversorMoeda {
    public static final double IOF = 0.06;

    public static double converterDolar(double quantidadeDolar, double valorDolar){
        double valorReais = quantidadeDolar * valorDolar;
        return valorReais += valorReais * IOF;
    }


}
