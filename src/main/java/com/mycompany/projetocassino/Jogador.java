/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetocassino;

/**
 *
 * @author Aluno
 */
public class Jogador {
    
    private int codigo;
    private String nome;
    private int idade;
    private int quantidadeFichas;
    private String endereco;
    private String telefone;
    static int contador = 1;

    public Jogador(String nome, int idade, String endereco, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.quantidadeFichas = 0;
        this.endereco = endereco;
        this.telefone = telefone;
        this.codigo = contador;
        contador++;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQuantidadeFichas() {
        return quantidadeFichas;
    }

    public void setQuantidadeFichas(int quantidadeFichas) {
        this.quantidadeFichas = quantidadeFichas;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Jogador{" + "codigo=" + codigo + ", nome=" + nome + ", idade=" + idade + ", quntidadeFichas=" + quantidadeFichas + ", endereco=" + endereco + ", telefone=" + telefone + '}';
    }

    
    
    
}