package entities;

public class Quarto {
    //propriedades
    private String numero;
    private String morador;
    private String emailMorador;
    private double aluguel;

    //construtor
    public Quarto(String numero, String morador, String emailMorador, double aluguel) {
        this.numero = numero;
        this.morador = morador;
        this.emailMorador = emailMorador;
        this.aluguel = aluguel;
    }

    //metodos
    public void AtualizarPreço(double porcentagem){
        aluguel += aluguel * porcentagem / 100;
    }

    public String toString(){
        return String.format("\nNumero do Quarto: %s%nLocador: %s%nE-mail: %s%nAluguel: %.2f%n", numero, morador, emailMorador, aluguel);
    }

    //getters e setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMorador() {
        return morador;
    }

    public void setMorador(String morador) {
        this.morador = morador;
    }

    public String getEmailMorador() {
        return emailMorador;
    }

    public void setEmailMorador(String emailMorador) {
        this.emailMorador = emailMorador;
    }

    public double getAluguel() {
        return aluguel;
    }

    public void setAluguel(double aluguel) {
        this.aluguel = aluguel;
    }
}
