/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class9_examplepolymorphism;

/**
 *
 * @author Fernando
 */
public class Magazine extends Product {
    private String mes;
    private int ano;
    
    @Override
    public void mostra(){
            System.out.println("é uma revista!");
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
