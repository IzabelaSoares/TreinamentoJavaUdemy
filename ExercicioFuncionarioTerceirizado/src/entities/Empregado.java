package entities;

public class Empregado {
    private String nome;
    private Integer horas;
    private Double valorHora;

    public Empregado(String nome, Integer horas, Double valorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public Double calcularSalario(){
        return horas * valorHora;
    }

    @Override
    public String toString() {
        return String.format("Funcionário: %s%nSalário do Mês: %.2f%n", nome, calcularSalario());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
}
