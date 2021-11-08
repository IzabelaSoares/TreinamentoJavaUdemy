package entities;

public final class ProdutoImportado extends Produto{

    private Double custoImportacao;

    public ProdutoImportado(String nome, Double preco, Double custoImportacao) {
        super(nome, preco);
        this.custoImportacao = custoImportacao;
    }

    private Double calcularProduto(){
        return custoImportacao + preco;
    }

    @Override
    public String informarTag() {
        return super.informarTag() + String.format("Preço Total: %.2f%n** Importado **", calcularProduto());
    }
}
