package entities;

public class ItemPedido {
    private Integer quantidade;
    private Double preco;
    private Produto produto;

    @Override
    public String toString() {
        return produto.getNome().toUpperCase() + ", R$" + String.format("%.2f",produto.getPreco()) +
                ", Quantidade " + quantidade + ", SubTotal " + String.format("%.2f",subTotal()) ;
    }

    public ItemPedido(Integer quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.preco = produto.getPreco();
        this.produto = produto;
    }

    public Double subTotal(){
        return quantidade * preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
