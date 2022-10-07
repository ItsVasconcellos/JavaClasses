/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Pokemon;


/**
 *
 * @author aluno
 */
public class PokemonController {
    private ArrayList<Pokemon> list;

    public PokemonController() {
        this.list = new ArrayList();
    }

    public ArrayList<Pokemon> getList() {
        return list;
    }

    public void setList(ArrayList<Pokemon> list) {
        this.list = list;
    }
    
    public void addLista(String nome, String tipo){
        Pokemon p1 = new Pokemon(nome,tipo);
        list.add(p1);
    }
    
}
