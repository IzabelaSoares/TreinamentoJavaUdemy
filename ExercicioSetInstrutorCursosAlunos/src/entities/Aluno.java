package entities;

import java.util.Objects;

public class Aluno {
    private int codigoAluno;

    public Aluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public int getCodigoAluno() {
        return codigoAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return codigoAluno == aluno.codigoAluno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoAluno);
    }
}
