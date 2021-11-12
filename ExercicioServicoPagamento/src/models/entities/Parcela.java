package models.entities;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcela {
    private Double valorParcela;
    private Date dataVencimento;

    public Parcela(Date dataVencimento, Double valorParcela) {
        this.dataVencimento = dataVencimento;
        this.valorParcela = valorParcela;
    }

    @Override
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return "Data de Pagamento: " + formato.format(dataVencimento) + " - R$ " + valorParcela + "\n";
    }

    public Double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }
}
