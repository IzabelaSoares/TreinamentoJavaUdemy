package entities;

public final class EmpregadoTerceiro extends Empregado{

    private Double despesaAdicional;

    public EmpregadoTerceiro(String nome, Integer horas, Double valorHora) {
        super(nome, horas, valorHora);
    }

    @Override
    public final Double calcularSalario() {
       return super.calcularSalario() + (despesaAdicional * 1.1);
    }

    public Double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(Double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }
}
