/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetocassino;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class ControleJogador {
    private ArrayList<Jogador> jogadoresCadastrados = new ArrayList<>();

    public ArrayList<Jogador> getJogadoresCadastrados() {
        return jogadoresCadastrados;
    }
    
    public void RegistrarJogador(Jogador jogador){
        this.jogadoresCadastrados.add(jogador);
    }
    
    public Jogador buscarPorCodigo(int codigo){
        for(Jogador jogador : jogadoresCadastrados){
            if(jogador.getCodigo() == codigo){
                return jogador;
            }
        }
        return null;
    }
    
    public void adicionarFichas(Jogador jogador, int quantidadeFichasSelecionadas){
        int fichasAtuais = jogador.getQuantidadeFichas();
        int fichasAdicionadas = fichasAtuais + quantidadeFichasSelecionadas;
        jogador.setQuantidadeFichas(fichasAdicionadas);  
    }
    
}
