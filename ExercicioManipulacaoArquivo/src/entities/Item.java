package entities;

public class Item {
    private Produto produto;
    private Integer quantidade;

    public Item(Produto produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    private Double subTotal(){
        return quantidade * produto.getPreco();
    }

    @Override
    public String toString() {
        return produto.getNome().toUpperCase() + ", " + String.format("%.2f", produto.getPreco()) + ", " + quantidade;
    }

    public String toStringSegundaOpcao(){
        return produto.getNome().toUpperCase() + ", " + String.format("%.2f",subTotal());
    }
}
