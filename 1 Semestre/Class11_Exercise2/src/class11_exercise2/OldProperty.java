/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class11_exercise2;

/**
 *
 * @author Fernando
 */
public class OldProperty extends Property {
    private double discount;

    public OldProperty(double discount, String address, double price) {
        super(address, price);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
}
