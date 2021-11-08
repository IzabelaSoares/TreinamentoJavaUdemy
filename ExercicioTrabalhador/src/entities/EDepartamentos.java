package entities;

public enum EDepartamentos {
    ADMINISTRATIVO ("Adminsitrativo"),
    DESENVOLVIMENTO ("Desenvolvimento"),
    FINANCEIRO ("Financeiro"),
    COMERCIAL ("Comercial"),
    MARKETING ("Marketing");

    private String Descrição;

    EDepartamentos(String descrição) {
        Descrição = descrição;
    }

    public String getDescrição() {
        return Descrição;
    }
}
