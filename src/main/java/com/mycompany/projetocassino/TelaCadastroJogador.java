/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetocassino;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class TelaCadastroJogador extends javax.swing.JFrame {

    private ControleJogador jogadores;
    private TelaPrincipal telaPrincipal;
    ResourceBundle traducoes;
    
    public TelaCadastroJogador(ControleJogador jogadoresCadastrados,ResourceBundle traducoes) {
        initComponents();
        this.traducoes = traducoes;
        this.jogadores = jogadoresCadastrados;
        this.tradTela();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTituloCadastroJogador = new javax.swing.JLabel();
        labelNomeJogador = new javax.swing.JLabel();
        labelIdadeJogador = new javax.swing.JLabel();
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

        labelIdadeJogador.setText("Idade:");

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
                                    .addComponent(labelIdadeJogador))
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
                    .addComponent(labelIdadeJogador)
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
         String mensagemDeErro = "";
         
         int idadeConvertida = Integer.parseInt(textIdadeJogador.getText());
         
        if (textNomeJogador1.getText().equals("")){       
            mensagemDeErro = traducoes.getString("erro-nome");
            JOptionPane.showMessageDialog(null, mensagemDeErro,"ERRO",JOptionPane.ERROR_MESSAGE);
        }
        else if (textIdadeJogador.getText().equals("")) {
            
             mensagemDeErro = traducoes.getString("erro-idade");
            JOptionPane.showMessageDialog(null, mensagemDeErro,"ERRO",JOptionPane.ERROR_MESSAGE);
           
        }
        else if (textTelefoneJogador.getText().equals("")) {
            
             mensagemDeErro = traducoes.getString("erro-telefone");
            JOptionPane.showMessageDialog(null, mensagemDeErro,"ERRO",JOptionPane.ERROR_MESSAGE);
           
        }
        else if (textEnderecoJogador.getText().equals("")) {
            
             mensagemDeErro = traducoes.getString("erro-endereco");
            JOptionPane.showMessageDialog(null, mensagemDeErro,"ERRO",JOptionPane.ERROR_MESSAGE); 
        }
        else if(textNomeJogador1.getText().length() < 3) {
            mensagemDeErro = traducoes.getString("erro-nome-tamanho");
            JOptionPane.showMessageDialog(null, mensagemDeErro,"ERRO",JOptionPane.ERROR_MESSAGE);
        }    
        else if(idadeConvertida < 18) {
            mensagemDeErro = traducoes.getString("erro-idade-menor");
            JOptionPane.showMessageDialog(null, mensagemDeErro,"ERRO",JOptionPane.ERROR_MESSAGE);
        } 
        else if(textTelefoneJogador.getText().length() < 3) {
            mensagemDeErro = traducoes.getString("erro-telefone-tamanho");
            JOptionPane.showMessageDialog(null, mensagemDeErro,"ERRO",JOptionPane.ERROR_MESSAGE);
        } 
        else if(textEnderecoJogador.getText().length() < 3) {
            mensagemDeErro = traducoes.getString("erro-endereco-tamanho");
            JOptionPane.showMessageDialog(null, mensagemDeErro,"ERRO",JOptionPane.ERROR_MESSAGE);
        } 
        else{
        String nome = textNomeJogador1.getText();
        String endereco = textEnderecoJogador.getText();
        int idade = Integer.parseInt(textIdadeJogador.getText());
        String telefone = textTelefoneJogador.getText();
                
            Jogador jogador = new Jogador(nome,idade,endereco,telefone);
            
            jogadores.RegistrarJogador(jogador);
            String mensagemRegistro = traducoes.getString("registro-realizado");
            JOptionPane.showMessageDialog(null, mensagemRegistro,"Informação",JOptionPane.INFORMATION_MESSAGE);
            
            telaPrincipal= new TelaPrincipal(jogadores,traducoes);
            telaPrincipal.setLocationRelativeTo(null);
            telaPrincipal.setVisible(true);
            dispose();
         }       
    }//GEN-LAST:event_btnCadastrarJogadorMouseClicked

    private void btnCancelarJogadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarJogadorMouseClicked
            telaPrincipal= new TelaPrincipal(jogadores,traducoes);
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
    private javax.swing.JLabel labelIdadeJogador;
    private javax.swing.JLabel labelNomeJogador;
    private javax.swing.JLabel labelTelefoneJogador;
    private javax.swing.JLabel labelTituloCadastroJogador;
    private javax.swing.JTextField textEnderecoJogador;
    private javax.swing.JTextField textIdadeJogador;
    private javax.swing.JTextField textNomeJogador1;
    private javax.swing.JTextField textTelefoneJogador;
    // End of variables declaration//GEN-END:variables

    private void tradTela() {
        this.labelTituloCadastroJogador.setText(this.traducoes.getString("labelTituloCadastroJogador"));
        this.labelNomeJogador.setText(this.traducoes.getString("labelNomeJogador"));
        this.labelIdadeJogador.setText(this.traducoes.getString("labelIdadeJogador"));
        this.labelEnderecoJogador.setText(this.traducoes.getString("labelEnderecoJogador"));
        this.labelTelefoneJogador.setText(this.traducoes.getString("labelTelefoneJogador"));
        this.btnCadastrarJogador.setText(this.traducoes.getString("btnCadastrarJogador"));
        this.btnCancelarJogador.setText(this.traducoes.getString("btnCancelarJogador"));
    }
}
