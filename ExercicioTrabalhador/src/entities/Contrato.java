package entities;
import java.sql.Date;

public class Contrato {
    private Date dataAtual;
    private Double valorHora;
    private Integer horas;

    protected Double calcularContrato(Double valorHora, Integer horas){
        this.valorHora = valorHora;
        this.horas = horas;
        return this.valorHora * this.horas;
    }

    public String toString(){
        return String.format("Valor por Hora: %.2f%nQuantidade de Horas: %d%nValor Total do Contrato: %.2f%n", valorHora, horas, (valorHora * horas));
    }

}
