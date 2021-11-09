package entities;

public class PessoaFisica extends Pessoa{

    private Double despesaSaude;

    public PessoaFisica(String nome, Double rendaAnual, Double despesaSaude) {
        super(nome, rendaAnual);
        this.despesaSaude = despesaSaude;
    }

    protected Double calcularImpostoPessoaFisica(){
        Double imposto = getRendaAnual() < 20000.0 ? calcularImposto(15.0) : calcularImposto(25.0);
        return imposto - (despesaSaude * 0.5);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Imposto Pessoa Fisica: %.2f%n", calcularImpostoPessoaFisica());
    }
}
