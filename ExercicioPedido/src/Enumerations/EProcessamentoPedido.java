package Enumerations;

public enum EProcessamentoPedido {
    EM_PROCESSO ("Em Processo"),
    CANCELADO ("Cancelado"),
    APROVADO ("Aprovado");

    @Override
    public String toString() {
        return descricao + "\n";
    }

    private String descricao;

    EProcessamentoPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
