package application;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Maria Clara";
        aluno.notas.add(7.5);
        aluno.notas.add(5.5);
        aluno.notas.add(9.5);
        aluno.media = aluno.calcularMedia();
        aluno.status = aluno.verificarAprovacao();
        System.out.println(aluno);
    }
}
