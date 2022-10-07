/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class6_example1;

/**
 *
 * @author Fernando
 */
public class DefaultCar {
    boolean turnedOn;
    private String manufacturer;
    public DefaultCar(){
        
    }
    public DefaultCar(String manufacture){
        this.manufacturer = manufacture;
    }
    public void turnOn(){
        turnedOn = true;
    }
    public void turnOff(){
        turnedOn = false;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
