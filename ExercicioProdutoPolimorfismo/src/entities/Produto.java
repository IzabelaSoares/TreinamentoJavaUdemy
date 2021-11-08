package entities;

public class Produto {
    protected String nome;
    protected Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return informarTag();
    }

    public String informarTag(){
        return String.format("Produto: %s%nPreço: %.2f%n", nome, preco);
    }
}
