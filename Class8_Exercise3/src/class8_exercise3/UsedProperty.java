/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class8_exercise3;

/**
 *
 * @author Fernando
 */
public class UsedProperty extends Property {
    private double discount;
    public UsedProperty(int code, double price, String address, double discount){
        super(code,price,address);
        this.discount = discount;
        this.setPrice(price);
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    public void setPrice(double price){
        super.setPrice(price - this.discount);
    }
    
    public String finalValue(){
        return "" + (this.getPrice() - discount);
    }
}
