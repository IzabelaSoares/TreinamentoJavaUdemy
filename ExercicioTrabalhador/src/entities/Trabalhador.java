package entities;

import java.util.ArrayList;
import java.util.List;

public class Trabalhador {
    //propriedades
    private String nome;
    private Double salario;
    private EDepartamentos departamento;
    private ECargos cargo;
    private List<Contrato> contratos = new ArrayList<>();

    //construtores
    public Trabalhador(String nome, Double salario, EDepartamentos departamento, ECargos cargo) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
        this.cargo = cargo;
    }

    //metodos
    public void adicionarContrato(Double valorhora, Integer horas){
        Contrato contrato = new Contrato();
        contrato.calcularContrato(valorhora, horas);
        contratos.add(contrato);
        System.out.println(contrato);
    }

    public String toString(){
        return String.format("Funcionário: %s%nDepartamento: %s%nCargo: %s%nSalário Mensal: %.2f",
                nome, departamento.getDescrição(), cargo.getDescricao(), salario);
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public EDepartamentos getDepartamento() {
        return departamento;
    }

    public void setDepartamento(EDepartamentos departamento) {
        this.departamento = departamento;
    }

    public ECargos getCargo() {
        return cargo;
    }

    public void setCargo(ECargos cargo) {
        this.cargo = cargo;
    }

    public List<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(List<Contrato> contratos) {
        this.contratos = contratos;
    }
}
