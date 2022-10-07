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
public class Property {
    private int code;
    private String address;
    private double price;
    
    public Property(int code, double price, String address){
        this.code = code;
        this.price = price;
        this.address = address;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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
    
    public String finalValue(){
        return "O valor final é de: " + (this.getPrice());
    }
    
    public void show(){
        System.out.println("O código do imóvel é: " +this.code);
        System.out.println("O valor do imóvel é de : " +this.price);
        System.out.println("O endereço é : " +this.address);
    }
}
