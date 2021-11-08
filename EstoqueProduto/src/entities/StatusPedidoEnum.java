package entities;

public enum StatusPedidoEnum {

    AGUARDANDO_PAGAMENTO("Aguardando Pagamento"),
    PAGAMENTO_APROVADO("Pagamento Aprovado"),
    EM_PREPARO("Em Preparo"),
    A_CAMINHO("À Caminho"),
    ENTREGUE("Entregue");

    public String descricao;

    StatusPedidoEnum(String descricao) {
        this.descricao = descricao;
    }
}
