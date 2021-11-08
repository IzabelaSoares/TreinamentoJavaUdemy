package entities;

public class Carro {
    private String marca;
    private String modelo;
    private Integer ano;
    private String cambio;
    private String cor;
    private String tipo;
    private String placa;

    public Carro(String marca, String modelo, Integer ano, String cambio, String cor, String tipo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cambio = cambio;
        this.cor = cor;
        this.tipo = tipo;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return String.format("Marca: %s%nModelo: %s%nAno: %d%nCâmbio: %s%nCor: %s%nTipo: %s%nPlaca: %s%n", marca, modelo, ano, cambio, cor, tipo, placa);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}