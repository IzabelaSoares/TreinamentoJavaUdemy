package models.services;
import models.entities.Contrato;
import models.entities.Parcela;
import java.util.Calendar;
import java.util.Date;

public class PagamentoService {

    private Contrato contrato;
    private int quantidadeParcelas;
    private IPagamentoService service;

    public PagamentoService(Contrato contrato, int quantidadeParcelas, IPagamentoService service) {
        this.contrato = contrato;
        this.service = service;
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public void gerarParcelas() {
        Double valorBase = contrato.getValorContrato() / Double.valueOf(quantidadeParcelas);
        for (int i = 1; i <= quantidadeParcelas; i++) {
            Date dataParcela = adicionarMeses(contrato.getDataDoContrato(), i);
            contrato.getParcelas().add(new Parcela(dataParcela, service.calcularParcela(valorBase, i)));
        }
    }

    private Date adicionarMeses(Date dataInicial, int mes){
        Calendar data = Calendar.getInstance();
        data.setTime(dataInicial);
        data.add(Calendar.MONTH, mes);
        return data.getTime();
    }
}
