/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetocassino;

import java.util.ArrayList;
import java.util.ResourceBundle;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Aluno
 */
public class TelaVisualizarJogadores extends javax.swing.JFrame {

    private ControleJogador jogadores;
    private TelaPrincipal telaPrincipal;
    ResourceBundle traducoes;
    
    public TelaVisualizarJogadores(ControleJogador jogadoresCadastrados,ResourceBundle traducoes) {
        this.traducoes = traducoes;
        initComponents();

        this.jogadores = jogadoresCadastrados;
        
        DefaultListModel model = new DefaultListModel();
        
        for(Jogador j : jogadores.getJogadoresCadastrados()){
            String mensagemVisualizar = traducoes.getString("ficha");
            model.addElement(j.toString() + ", " + j.getQuantidadeFichas() + " " + mensagemVisualizar); 
        }
         listboxJogadoresCadastrados.setModel(model);
         
         this.tradTela();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listboxJogadoresCadastrados = new javax.swing.JList<>();
        labelTituloJogadoresCadastrados = new javax.swing.JLabel();
        btnSairJogadorCadastrados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listboxJogadoresCadastrados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listboxJogadoresCadastrados);

        labelTituloJogadoresCadastrados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTituloJogadoresCadastrados.setText("Jogadores Cadastrados");

        btnSairJogadorCadastrados.setText("Sair");
        btnSairJogadorCadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairJogadorCadastradosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(labelTituloJogadoresCadastrados)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSairJogadorCadastrados)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTituloJogadoresCadastrados)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSairJogadorCadastrados)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairJogadorCadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairJogadorCadastradosMouseClicked
            telaPrincipal= new TelaPrincipal(jogadores,traducoes);
            telaPrincipal.setLocationRelativeTo(null);
            telaPrincipal.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnSairJogadorCadastradosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSairJogadorCadastrados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTituloJogadoresCadastrados;
    private javax.swing.JList<String> listboxJogadoresCadastrados;
    // End of variables declaration//GEN-END:variables

    private void tradTela() {
        this.labelTituloJogadoresCadastrados.setText(this.traducoes.getString("labelTituloJogadoresCadastrados"));
        this.btnSairJogadorCadastrados.setText(this.traducoes.getString("btnSairJogadorCadastrados"));

    }
}
