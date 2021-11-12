package com.company;
import entities.Aluno;
import entities.Curso;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();

        List<Aluno> alunosCurso1 = new ArrayList<>();
        alunosCurso1.add(new Aluno(35));
        alunosCurso1.add(new Aluno(21));
        alunosCurso1.add(new Aluno(22));

        List<Aluno> alunosCurso2 = new ArrayList<>();
        alunosCurso2.add(new Aluno(21));
        alunosCurso2.add(new Aluno(50));

        List<Aluno> alunosCurso3 = new ArrayList<>();
        alunosCurso3.add(new Aluno(35));
        alunosCurso3.add(new Aluno(42));
        alunosCurso3.add(new Aluno(13));

        cursos.add(new Curso(alunosCurso1));
        cursos.add(new Curso(alunosCurso2));
        cursos.add(new Curso(alunosCurso3));

        Set<Aluno> totalAlunos = new HashSet<>();

        for(var curso : cursos){
            for(var aluno : curso.getAlunos())
            totalAlunos.add(new Aluno(aluno.getCodigoAluno()));
        }

        System.out.println(totalAlunos.size());

    }
}
