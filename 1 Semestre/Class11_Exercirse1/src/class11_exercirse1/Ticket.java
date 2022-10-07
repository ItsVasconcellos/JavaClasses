/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class11_exercirse1;

/**
 *
 * @author Fernando
 */
public class Ticket {
    private double Value;

    public Ticket(double value){
        this.setValue(value);
    }
    public double getValue() {
        return Value;
    }

    public void setValue(double Value) {
        this.Value = Value;
    }
    
    public void showValue(){
        System.out.println("O valor do ingresso é: " + this.getValue());
    }
}
