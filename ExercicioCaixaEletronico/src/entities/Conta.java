package entities;

import exceptions.Excecao;

public class Conta {

    private Integer numero;
    private String usuario;
    private Double saldo;
    private Double limiteSaque;

    public Conta(Integer numero, String usuario, Double limiteSaque) {
        this.numero = numero;
        this.usuario = usuario;
        this.limiteSaque = limiteSaque;
        saldo = 0.0;
    }

    public void sacar(Double valor) throws Excecao {
        if(verificarValorSaque(valor)){
            saldo -= valor;
        }
    }

    public void depositar(Double valor) throws Excecao {
        if(verificarValorDeposito(valor)) {
            saldo += valor;
        }
    }

    private Boolean verificarValorDeposito(Double valor) throws Excecao {
        if (valor <= 0) {
            throw new Excecao("Não é possivel sacar o valor informado!");
        }
        else{
            return true;
        }
    }

    private Boolean verificarValorSaque(Double valor) throws Excecao{
        if(valor <= 0){
            throw new Excecao("Não é possivel sacar o valor informado!");
        }
        else if(valor >= limiteSaque){
            throw new Excecao("Não é possivel realizar essa operação, excedido limite de saque!");
        }
        else if(valor >= saldo){
            throw new Excecao("Não é possivel realizar essa operação, valor superior ao saldo em conta!");
        }
        else{
            return true;
        }
    }

    @Override
    public String toString() {
        return String.format("Nome: %s%nConta: %d%nSaldo: %.2f", usuario, numero, saldo);
    }
}
