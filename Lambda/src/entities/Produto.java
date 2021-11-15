package entities;

import java.util.List;
import java.util.function.Predicate;

public class Produto {
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static Boolean verificarPrecoStatic(Produto p){
        return p.getPreco() >= 100;
    }

    public Boolean verificarPrecoNaoStatic(){
        return preco >= 100;
    }

    public void atualizarPrecoNaoStatic(){
        preco *= 1.1;
    }

    public static void atualizarPrecoStatic(Produto p){
        p.setPreco(p.getPreco() * 1.1);
    }

    public String transformarProdutoEmStringNaoStatic(){
        return nome.toUpperCase();
    }

    public static String transformarProdutoEmStringStatic(Produto p){
        return p.getNome().toUpperCase();
    }

    @Override
    public String toString() {
        return String.format("Produto: %s \t$ %.2f", nome, preco);
    }

    public Double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
