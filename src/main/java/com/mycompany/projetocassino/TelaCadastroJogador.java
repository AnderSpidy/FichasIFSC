/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetocassino;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class TelaCadastroJogador extends javax.swing.JFrame {

    private ControleJogador jogadores;
    private TelaPrincipal telaPrincipal;
    public TelaCadastroJogador(ControleJogador jogadoresCadastrados) {
        initComponents();
        this.jogadores = jogadoresCadastrados;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTituloCadastroJogador = new javax.swing.JLabel();
        labelNomeJogador = new javax.swing.JLabel();
        labelNomeJogador1 = new javax.swing.JLabel();
        labelEnderecoJogador = new javax.swing.JLabel();
        labelTelefoneJogador = new javax.swing.JLabel();
        textIdadeJogador = new javax.swing.JTextField();
        textNomeJogador1 = new javax.swing.JTextField();
        textEnderecoJogador = new javax.swing.JTextField();
        textTelefoneJogador = new javax.swing.JTextField();
        btnCadastrarJogador = new javax.swing.JButton();
        btnCancelarJogador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTituloCadastroJogador.setText("Cadastro  de Jogador");

        labelNomeJogador.setText("Nome:");

        labelNomeJogador1.setText("Idade:");

        labelEnderecoJogador.setText("Endereço:");

        labelTelefoneJogador.setText("Telefone:");

        textIdadeJogador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textIdadeJogadorKeyTyped(evt);
            }
        });

        textTelefoneJogador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textTelefoneJogadorKeyTyped(evt);
            }
        });

        btnCadastrarJogador.setText("Cadastrar");
        btnCadastrarJogador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarJogadorMouseClicked(evt);
            }
        });

        btnCancelarJogador.setText("Cancelar");
        btnCancelarJogador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarJogadorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrarJogador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarJogador))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelNomeJogador)
                                    .addComponent(labelTelefoneJogador)
                                    .addComponent(labelEnderecoJogador)
                                    .addComponent(labelNomeJogador1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textNomeJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textIdadeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textEnderecoJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textTelefoneJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(labelTituloCadastroJogador)))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTituloCadastroJogador)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeJogador)
                    .addComponent(textNomeJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeJogador1)
                    .addComponent(textIdadeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEnderecoJogador)
                    .addComponent(textEnderecoJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTelefoneJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefoneJogador))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarJogador)
                    .addComponent(btnCancelarJogador))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarJogadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarJogadorMouseClicked
         if (textNomeJogador1.getText()==""){
            
            JOptionPane.showMessageDialog(null, "Preencha o campo nome","ERRO",JOptionPane.ERROR_MESSAGE);

         }
         else if (textIdadeJogador.getText().equals("")) {
            
            JOptionPane.showMessageDialog(null, "Preencha o campo idade","ERRO",JOptionPane.ERROR_MESSAGE);
           
         }
         else if (textTelefoneJogador.getText().equals("")) {
            
            JOptionPane.showMessageDialog(null, "Preencha o campo telefone","ERRO",JOptionPane.ERROR_MESSAGE);
           
         }
         else if (textEnderecoJogador.getText().equals("")) {
            
            JOptionPane.showMessageDialog(null, "Preencha o campo endereço","ERRO",JOptionPane.ERROR_MESSAGE); 
        }
        else {
        String nome = textNomeJogador1.getText();
        String endereco = textEnderecoJogador.getText();
        int idade = Integer.parseInt(textIdadeJogador.getText());
        String telefone = textTelefoneJogador.getText();
                
            Jogador jogador = new Jogador(nome,idade,endereco,telefone);
            
            jogadores.RegistrarJogador(jogador);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso ","Informação",JOptionPane.INFORMATION_MESSAGE);
            
            telaPrincipal= new TelaPrincipal(jogadores);
            telaPrincipal.setLocationRelativeTo(null);
            telaPrincipal.setVisible(true);
            dispose();
         }       
    }//GEN-LAST:event_btnCadastrarJogadorMouseClicked

    private void btnCancelarJogadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarJogadorMouseClicked
            telaPrincipal= new TelaPrincipal(jogadores);
            telaPrincipal.setLocationRelativeTo(null);
            telaPrincipal.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnCancelarJogadorMouseClicked

    private void textIdadeJogadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textIdadeJogadorKeyTyped
       char c = evt.getKeyChar();
      if (!((c >= '0') && (c <= '9') ||
         (c == KeyEvent.VK_BACK_SPACE) ||
         (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
      }
    }//GEN-LAST:event_textIdadeJogadorKeyTyped

    private void textTelefoneJogadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTelefoneJogadorKeyTyped
        char c = evt.getKeyChar();
      if (!((c >= '0') && (c <= '9') ||
         (c == KeyEvent.VK_BACK_SPACE) ||
         (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
      }
  
    }//GEN-LAST:event_textTelefoneJogadorKeyTyped
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarJogador;
    private javax.swing.JButton btnCancelarJogador;
    private javax.swing.JLabel labelEnderecoJogador;
    private javax.swing.JLabel labelNomeJogador;
    private javax.swing.JLabel labelNomeJogador1;
    private javax.swing.JLabel labelTelefoneJogador;
    private javax.swing.JLabel labelTituloCadastroJogador;
    private javax.swing.JTextField textEnderecoJogador;
    private javax.swing.JTextField textIdadeJogador;
    private javax.swing.JTextField textNomeJogador1;
    private javax.swing.JTextField textTelefoneJogador;
    // End of variables declaration//GEN-END:variables
}
