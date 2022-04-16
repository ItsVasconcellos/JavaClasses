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
public class Property {
    private String address;
    private double price;
    public Property(String address, double price){
        this.setAddress(address);
        this.setPrice(price);
    } 

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void show(){
        System.out.println("The address of the property is: "+ this.getAddress());
        System.out.println("The price of the property is: " + this.getPrice());
    }
}
