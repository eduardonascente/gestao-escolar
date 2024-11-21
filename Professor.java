package model;

import java.time.LocalDate;

public class Professor {
    private int id;
    private String nome;
    private String cpf;
    private String formacao;
    private LocalDate dataNascimento;

    // Construtor
    public Professor(int id, String nome, String cpf, String formacao, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.formacao = formacao;
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

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Método para calcular a idade
    public int calcularIdade() {
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }

    // Validação do CPF
    public boolean validarCpf() {
        return cpf != null && cpf.matches("\\d{11}");
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", formacao='" + formacao + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}