/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.projetocassino;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
    //TelaPrincipal iniciar = new TelaPrincipal();
    //iniciar.setVisible(true);
        
    ArrayList<Jogador> jogadores = new ArrayList<Jogador>(); 
    Jogador jogador1 = new Jogador("Luan", 20, "Rua Almdeda", "999");
    TelaAdicionarFichas tela = new TelaAdicionarFichas(jogadores);
    jogadores.add(jogador1);
    tela.setVisible(true);

    }
        // TODO code application logic here
    }
   