package gestao.gestor.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Secretaria {
    private List<Aluno> alunos;
    private List<Professor> professores;

    public Secretaria() {
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    // Método para cadastrar um aluno
    public void cadastrarAluno(int id, String nome, String cpf, String filiacao, LocalDate dataNascimento) {
        Aluno aluno = new Aluno(id, nome, cpf, filiacao, dataNascimento);
        alunos.add(aluno);
        System.out.println("Aluno " + nome + " cadastrado com sucesso!");
    }

    // Método para cadastrar um professor
    public void cadastrarProfessor(int id, String nome, String cpf, String formacao, LocalDate dataNascimento) {
        Professor professor = new Professor(id, nome, cpf, formacao, dataNascimento);
        professores.add(professor);
        System.out.println("Professor " + nome + " cadastrado com sucesso!");
    }

    // Método para listar todos os alunos cadastrados
    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de Alunos:");
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }

    // Método para listar todos os professores cadastrados
    public void listarProfessores() {
        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado.");
        } else {
            System.out.println("Lista de Professores:");
            for (Professor professor : professores) {
                System.out.println(professor);
            }
        }
    }

    // Método para matricular um aluno em uma turma (simplificado, não considerando a turma especificamente)
    public void matricularAluno(int alunoId) {
        Aluno aluno = null;
        for (Aluno a : alunos) {
            if (a.getId() == alunoId) {
                aluno = a;
                break;
            }
        }
        if (aluno != null) {
            System.out.println("Aluno " + aluno.getNome() + " matriculado com sucesso!");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    // Método para listar a idade de todos os alunos
    public void listarIdadeAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + " tem " + aluno.calcularIdade() + " anos.");
        }
    }

    // Método para listar a idade de todos os professores
    public void listarIdadeProfessores() {
        for (Professor professor : professores) {
            System.out.println(professor.getNome() + " tem " + professor.calcularIdade() + " anos.");
        }
    }
}