package entities;
import java.util.List;
import java.util.Objects;

public class Curso {

    private List<Aluno> alunos;

    public Curso(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

}
