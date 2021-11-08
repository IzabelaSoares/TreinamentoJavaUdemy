package entities;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Cliente {
    private String nome;
    private Date dataAniversario;
    private String cpf;
    private String email;

    private static final SimpleDateFormat CONVERTDATA = new SimpleDateFormat("dd/MM/yyyy");

    public Cliente(String nome, Date dataAniversario, String cpf, String email) {
        this.nome = nome;
        this.dataAniversario = dataAniversario;
        this.cpf = cpf;
        this.email = email;
    }


    @Override
    public String toString() {
        return nome + " Nascimento: " + CONVERTDATA.format(dataAniversario) + " CPF:" + cpf + " Email: " + email + "\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(Date dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
