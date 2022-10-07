/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class14_exercise2;

import java.util.Set;

/**
 *
 * @author Fernando
 */
public class Quadrado implements AreaCalculavel{
    private float side;
    
    public Quadrado(float s){
        
        this.setSide(s);   
        
    }
    
    @Override
    public double calcularArea(){
        return this.getSide()*this.getSide();
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        if(side<0){
            throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que 0 (zero)");
        }
        else{
        this.side = side;
        }
    }
}
