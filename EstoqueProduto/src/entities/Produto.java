package entities;

public class Produto {

    public String nome;
    public double preco;
    public double quantidade;

    public double precoTotalEstoque(){
        return preco * quantidade;
    }

    public void adicionarQuantidade(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerQuantidade(int quantidade){
        this.quantidade -= quantidade;
    }

}
