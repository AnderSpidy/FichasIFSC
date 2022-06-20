/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.projetocassino;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        ControleJogador controleJogador = new ControleJogador();
        String idioma;
        String pais;
        
   
       
        if (args.length != 2) {
            idioma = new String("en");
            pais = new String("US");
        } else {
            idioma = new String(args[0]);
            pais = new String(args[1]);
        }
        
        Locale localCorrente;
        ResourceBundle traducoes = null;
        
        localCorrente = new Locale(idioma, pais);
        traducoes = ResourceBundle.getBundle("MessagesBundle", localCorrente);
        
        TelaPrincipal j = new TelaPrincipal(controleJogador,traducoes);
        j.setLocationRelativeTo(null);
        j.setVisible(true);
    
    }
}
   