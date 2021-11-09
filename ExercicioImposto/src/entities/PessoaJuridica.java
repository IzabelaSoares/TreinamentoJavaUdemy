package entities;

public class PessoaJuridica extends Pessoa{
    private Integer funcionarios;

    public PessoaJuridica(String nome, Double rendaAnual, Integer funcionarios) {
        super(nome, rendaAnual);
        this.funcionarios = funcionarios;
    }

    public Double calcularImpostoPessoaJuridica(){
        return funcionarios > 10 ? calcularImposto(14.0) : calcularImposto(16.0);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Imposto Pessoa Juridica: %.2f", calcularImpostoPessoaJuridica());
    }

}
