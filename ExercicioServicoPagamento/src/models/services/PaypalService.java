package models.services;

public class PaypalService implements IPagamentoService{

    private final Double JUROS_MENSAIS = 0.01;
    private final Double TAXA_PAGAMENTO = 0.02;

    @Override
    public Double calcularParcela(Double valorParcela, int numeroParcela){
        valorParcela += valorParcela * JUROS_MENSAIS * numeroParcela;
        return valorParcela + valorParcela * TAXA_PAGAMENTO;
    }

   }
