package entities;

public abstract class Pessoa {
    private String nome;
    private Double rendaAnual;

    public Pessoa(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    protected Double calcularImposto(Double taxa){
        return rendaAnual * (taxa / 100);
    }

    @Override
    public String toString() {
        return String.format("Nome: %s%nRenda Anual: %.2f%n", nome, rendaAnual);
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }
}
