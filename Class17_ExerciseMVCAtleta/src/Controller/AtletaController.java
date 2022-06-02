/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Atleta;
import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class AtletaController {
    private ArrayList<Atleta> lista;
    
    public AtletaController(){
        lista = new ArrayList();
    }
    
    public void cadastrar(String name, int code, double peso, double altura, double idade){
        Atleta a1 = new Atleta(name, code, peso, altura, idade);
        lista.add(a1);
    }
    
    public void excluirAtletas(int code){
        for(Atleta a: lista){
            if(a.getCode() == code){
                lista.remove(a);
            }
        }
    }
}
