package com.company;
import models.entities.Contrato;
import models.services.PagamentoService;
import models.services.PaypalService;
import java.sql.Date;


public class Main {
    public static void main(String[] args) {

        Contrato contrato = new Contrato(123, 600.0, Date.valueOf("2018-06-25"));
        PagamentoService pagamento = new PagamentoService(contrato, 3, new PaypalService());
        pagamento.gerarParcelas();
        System.out.println(contrato);
        contrato.getParcelas().forEach(parcela -> System.out.println(parcela));

    }
}
