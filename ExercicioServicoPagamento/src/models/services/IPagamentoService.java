package models.services;
import models.entities.Parcela;
import java.util.List;

public interface IPagamentoService {

    public Double calcularParcela(Double valorParcela, int numeroParcela);
}
