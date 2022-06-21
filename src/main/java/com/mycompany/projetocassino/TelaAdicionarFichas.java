/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetocassino;
import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 *
 * @author Aluno
 */
public class TelaAdicionarFichas extends javax.swing.JFrame {

    private JogadorComboboxModel jogadorComboboxModel;
    private ControleJogador jogadores;
    private TelaPrincipal telaPrincipal;
    ResourceBundle traducoes;
    
    public TelaAdicionarFichas(ControleJogador jogadores,ResourceBundle traducoes) {
        this.traducoes = traducoes;
        this.jogadores = jogadores;
        initComponents();
        this.jogadorComboboxModel = new JogadorComboboxModel();
        for(Jogador j : jogadores.getJogadoresCadastrados()){
            this.jogadorComboboxModel.addJogador(j);
        }
        cmbbxJogador.setModel(jogadorComboboxModel);
        
        this.tradTela();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTituloAdicionarFichas = new javax.swing.JLabel();
        labelSelecionarJogadorFichas = new javax.swing.JLabel();
        cmbbxJogador = new javax.swing.JComboBox<>();
        checkboxUmaFicha = new javax.swing.JCheckBox();
        checkboxVinteECincoFichas = new javax.swing.JCheckBox();
        checkboxCinquentaFichas = new javax.swing.JCheckBox();
        checkboxCemFichas = new javax.swing.JCheckBox();
        checkboxQuinhentasFichas = new javax.swing.JCheckBox();
        btnAdicionarFichas = new javax.swing.JButton();
        btnCancelarFichas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTituloAdicionarFichas.setText("Adicionar Fichas");

        labelSelecionarJogadorFichas.setText("Selecionar Jogador:");

        cmbbxJogador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        checkboxUmaFicha.setText("Uma Ficha (1)");

        checkboxVinteECincoFichas.setText("Vinte e Cinco Fichas (25)");

        checkboxCinquentaFichas.setText("Cinquenta Fichas (50)");

        checkboxCemFichas.setText("Cem Fichas (100)");

        checkboxQuinhentasFichas.setText("Quinhentas Fichas (500)");

        btnAdicionarFichas.setText("Adicionar Fichas");
        btnAdicionarFichas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdicionarFichasMouseClicked(evt);
            }
        });

        btnCancelarFichas.setText("Cancelar");
        btnCancelarFichas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarFichasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(labelTituloAdicionarFichas))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelSelecionarJogadorFichas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbbxJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(checkboxUmaFicha))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(checkboxVinteECincoFichas))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(checkboxCinquentaFichas))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(checkboxCemFichas))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(checkboxQuinhentasFichas)))
                        .addGap(0, 66, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdicionarFichas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarFichas)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTituloAdicionarFichas)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSelecionarJogadorFichas)
                    .addComponent(cmbbxJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(checkboxUmaFicha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkboxVinteECincoFichas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkboxCinquentaFichas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkboxCemFichas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkboxQuinhentasFichas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarFichas)
                    .addComponent(btnCancelarFichas))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarFichasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarFichasMouseClicked
        Jogador jogadorSelecionado = (Jogador)cmbbxJogador.getSelectedItem();
        if(checkboxUmaFicha.isSelected()){
            jogadores.adicionarFichas(jogadorSelecionado, 1);
        }
        if(checkboxVinteECincoFichas.isSelected()){
            jogadores.adicionarFichas(jogadorSelecionado, 25);
        }
        if(checkboxCinquentaFichas.isSelected()){
            jogadores.adicionarFichas(jogadorSelecionado, 50);
        }
        if(checkboxCemFichas.isSelected()){
            jogadores.adicionarFichas(jogadorSelecionado, 100);
        }
        if(checkboxQuinhentasFichas.isSelected()){
            jogadores.adicionarFichas(jogadorSelecionado, 500);
        }
            //voltar para a tela principal
            telaPrincipal= new TelaPrincipal(jogadores,traducoes);
            telaPrincipal.setLocationRelativeTo(null);
            telaPrincipal.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnAdicionarFichasMouseClicked

    private void btnCancelarFichasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarFichasMouseClicked
        telaPrincipal= new TelaPrincipal(jogadores,traducoes);
            telaPrincipal.setLocationRelativeTo(null);
            telaPrincipal.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnCancelarFichasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarFichas;
    private javax.swing.JButton btnCancelarFichas;
    private javax.swing.JCheckBox checkboxCemFichas;
    private javax.swing.JCheckBox checkboxCinquentaFichas;
    private javax.swing.JCheckBox checkboxQuinhentasFichas;
    private javax.swing.JCheckBox checkboxUmaFicha;
    private javax.swing.JCheckBox checkboxVinteECincoFichas;
    private javax.swing.JComboBox<String> cmbbxJogador;
    private javax.swing.JLabel labelSelecionarJogadorFichas;
    private javax.swing.JLabel labelTituloAdicionarFichas;
    // End of variables declaration//GEN-END:variables

    private void tradTela() {
        this.labelTituloAdicionarFichas.setText(this.traducoes.getString("labelTituloAdicionarFichas"));
        this.labelSelecionarJogadorFichas.setText(this.traducoes.getString("labelSelecionarJogadorFichas"));
        this.checkboxUmaFicha.setText(this.traducoes.getString("checkboxUmaFicha"));
        this.checkboxVinteECincoFichas.setText(this.traducoes.getString("checkboxVinteECincoFichas"));
        this.checkboxCinquentaFichas.setText(this.traducoes.getString("checkboxCinquentaFichas"));
        this.checkboxCemFichas.setText(this.traducoes.getString("checkboxCemFichas"));
        this.checkboxQuinhentasFichas.setText(this.traducoes.getString("checkboxQuinhentasFichas"));
        this.btnAdicionarFichas.setText(this.traducoes.getString("btnAdicionarFichas"));
        this.btnCancelarFichas.setText(this.traducoes.getString("btnCancelarFichas"));
        
        

    }
}
