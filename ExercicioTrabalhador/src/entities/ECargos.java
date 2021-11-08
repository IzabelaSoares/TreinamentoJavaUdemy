package entities;

public enum ECargos {
    TREINEE("Treinee"),
    DESENVOLVEDOR_JUNIOR("Desenvolvedor Junior"),
    DESENVOLVEDOR_PLENO ("Desenvolvedor Pleno"),
    DESENVOLVEDOR_SENIOR ("Desenvolvedor Senior"),
    ANALISTA ("Analista"),
    PRODUCT_MANAGER("Product Manager"),
    ARQUITETO_SOFTWARE("Arquiteto de Software"),
    COORDENADOR("Coordenador");

    private String descricao;

    ECargos(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
