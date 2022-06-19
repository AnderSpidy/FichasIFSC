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
        ControleJogador controleJogador = new ControleJogador();
        TelaPrincipal j = new TelaPrincipal(controleJogador);
       j.setLocationRelativeTo(null);
       j.setVisible(true);
    
    }
}
   