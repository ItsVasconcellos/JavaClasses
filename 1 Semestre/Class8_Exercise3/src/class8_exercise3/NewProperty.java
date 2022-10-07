/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class8_exercise3;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Fernando
 */
public class NewProperty extends Property {
    private double extraPrice;
    
    public NewProperty(int code, double price, String address, double extraPrice){
        super(code,price,address);
        this.extraPrice = extraPrice;
        this.setPrice(price);
    }

    public double getExtraPrice() {
        return extraPrice;
    }

    public void setExtraPrice(double extraPrice) {
        this.extraPrice = extraPrice;
    }
    
    public void setPrice(double price){
        super.setPrice(price + this.extraPrice);
    }
    public String finalValue(){
        return "O valor final é de: " + (this.getPrice() + extraPrice);
    }
    
    @Override 
    public void show(){
        super.show();
    }
}
