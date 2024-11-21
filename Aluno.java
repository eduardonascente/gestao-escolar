package model;

import java.time.LocalDate;

public class Aluno {
    private int id;
    private String nome;
    private String cpf;
    private String filiacao;
    private LocalDate dataNascimento;

    // Construtor
    public Aluno(int id, String nome, String cpf, String filiacao, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.filiacao = filiacao;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(String filiacao) {
        this.filiacao = filiacao;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Método para calcular a idade do aluno
    public int calcularIdade() {
        return LocalDate.now().getYear() - this.dataNascimento.getYear();
    }

    // Validação do CPF (exemplo simplificado)
    public boolean validarCpf() {
        return this.cpf != null && this.cpf.matches("\\d{11}");
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", filiacao='" + filiacao + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}