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
public class Vip extends Ticket {
    
    private double extraValue;

    public Vip(double extraValue,double value){
        super(value);
        this.extraValue = extraValue;
    }
    public double getExtraValue() {
        return extraValue;
    }

    public void setExtraValue(double extraValue) {
        this.extraValue = extraValue;
    }
    
}
