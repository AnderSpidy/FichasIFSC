/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetocassino;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author ander
 */
public class JogadorComboboxModel extends AbstractListModel implements ComboBoxModel {

    private List<Jogador> listaJogadores;
    private Jogador jogadorSelecionado;
    
    public JogadorComboboxModel(){
        this.listaJogadores = new ArrayList<>();
    }
    @Override
    public int getSize() {
        return listaJogadores.size();
    }

    @Override
    public Object getElementAt(int index) {
        return this.listaJogadores.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        if(anItem instanceof Jogador){
        this.jogadorSelecionado = (Jogador) anItem;
        fireContentsChanged(this.listaJogadores, 0, this.listaJogadores.size());
        }
    }

    @Override
    public Object getSelectedItem() {
        return this.jogadorSelecionado;

    }
    
    public void addJogador(Jogador jJogador){
        this.listaJogadores.add(jJogador);
    }
    
    public void reset(){
        this.listaJogadores.clear();
    }
    
}
