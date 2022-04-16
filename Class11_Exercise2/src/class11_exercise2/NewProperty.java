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
public class NewProperty extends Property{
    private double extraValue;

    public NewProperty(double extraValue, String address, double price) {
        super(address, price);
        this.extraValue = extraValue;
    }

    public double getExtraValue() {
        return extraValue;
    }

    public void setExtraValue(double extraValue) {
        this.extraValue = extraValue;
    }
}
