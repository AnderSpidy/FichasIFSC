/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetocassino;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Aluno
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private ControleJogador controleJogadores = new ControleJogador();
    private TelaCadastroJogador cadastroJogador;
    private TelaAdicionarFichas adicionarfichas;
    private TelaVisualizarJogadores visualizarJogadores;
    
    ResourceBundle traducoes = null;
    
    public TelaPrincipal(ControleJogador controleJogador,ResourceBundle traducoes) {
        this.traducoes = traducoes;
        
        initComponents();
        this.controleJogadores = controleJogador;
        if(controleJogadores.getJogadoresCadastrados().isEmpty()){
            btnAdicionarFichas.setEnabled(false);
            btnVisualizarJogadores.setEnabled(false);
        }
        
        this.tradTela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        btnAdicionarJogador = new javax.swing.JButton();
        btnAdicionarFichas = new javax.swing.JButton();
        labelTextoApresentacao = new javax.swing.JLabel();
        btnVisualizarJogadores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelTitulo.setText("Bem Vindo ao Cassino CSFI");

        btnAdicionarJogador.setText("Adicionar Jogador");
        btnAdicionarJogador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdicionarJogadorMouseClicked(evt);
            }
        });

        btnAdicionarFichas.setText("Adicionar Fichas");
        btnAdicionarFichas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdicionarFichasMouseClicked(evt);
            }
        });

        labelTextoApresentacao.setText("Adicione o jogador ou adicione fichas a um jogador existente. ");

        btnVisualizarJogadores.setText("Visualizar Jogadores");
        btnVisualizarJogadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVisualizarJogadoresMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelTextoApresentacao))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 46, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdicionarJogador)
                                .addGap(56, 56, 56)
                                .addComponent(btnAdicionarFichas))
                            .addComponent(labelTitulo))))
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(btnVisualizarJogadores)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addComponent(labelTextoApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarJogador)
                    .addComponent(btnAdicionarFichas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVisualizarJogadores)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarJogadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarJogadorMouseClicked
       cadastroJogador = new TelaCadastroJogador(this.controleJogadores,traducoes);
       cadastroJogador.setLocationRelativeTo(null);
       cadastroJogador.setVisible(true);
       dispose();
       
    }//GEN-LAST:event_btnAdicionarJogadorMouseClicked

    private void btnVisualizarJogadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarJogadoresMouseClicked
       visualizarJogadores = new TelaVisualizarJogadores(this.controleJogadores,traducoes);
       visualizarJogadores.setLocationRelativeTo(null);
       visualizarJogadores.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnVisualizarJogadoresMouseClicked

    private void btnAdicionarFichasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarFichasMouseClicked
       adicionarfichas = new TelaAdicionarFichas(this.controleJogadores,traducoes);
       adicionarfichas.setLocationRelativeTo(null);
       adicionarfichas.setVisible(true);
       dispose();    }//GEN-LAST:event_btnAdicionarFichasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarFichas;
    private javax.swing.JButton btnAdicionarJogador;
    private javax.swing.JButton btnVisualizarJogadores;
    private javax.swing.JLabel labelTextoApresentacao;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables

    private void tradTela() {
        this.labelTitulo.setText(this.traducoes.getString("labelTitulo"));
        this.labelTextoApresentacao.setText(this.traducoes.getString("labelTextoApresentacao"));
        this.btnAdicionarJogador.setText(this.traducoes.getString("btnAdicionarJogador"));
        this.btnAdicionarFichas.setText(this.traducoes.getString("btnAdicionarFichas"));
        this.btnVisualizarJogadores.setText(this.traducoes.getString("btnVisualizarJogadores"));

    }
}
