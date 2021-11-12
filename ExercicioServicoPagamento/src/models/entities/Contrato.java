package models.entities;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Contrato {

    private Integer numeroContrato;
    private Double valorContrato;
    private Date dataDoContrato;
    private List<Parcela> parcelas;

    public Contrato(Integer numeroContrato, Double valorContrato, Date dataDoContrato) {
        this.numeroContrato = numeroContrato;
        this.valorContrato = valorContrato;
        this.dataDoContrato = dataDoContrato;
        this.parcelas = new ArrayList<>();
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public Double getValorContrato() {
        return valorContrato;
    }

    public Date getDataDoContrato() {
        return dataDoContrato;
    }

    @Override
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return "Os Dados do Contrato Nº: " + numeroContrato + "\nValor Total: " + valorContrato + "\n"+
                "Data do Contrato: " + formato.format(dataDoContrato) + "\n" +
                "Numero de Parcelas: " + parcelas.size() + "\n";
    }
}
