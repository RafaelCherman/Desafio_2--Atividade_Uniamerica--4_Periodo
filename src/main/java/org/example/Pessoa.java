package org.example;

import java.util.List;

public class Pessoa {
    private int idade;
    private String nome;

    private List<Endereco> enderecos;

    public Pessoa(){}

    public Pessoa(String nome,int idade, List<Endereco> enderecos) {
        this.idade = idade;
        this.nome = nome;
        this.enderecos = enderecos;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}
