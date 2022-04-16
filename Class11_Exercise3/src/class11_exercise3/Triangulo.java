/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class11_exercise3;

/**
 *
 * @author Fernando
 */
public class Triangulo extends FormaBiDimensional {
    private double height;
    private double base;
    
    @Override
    public double obterArea(){
        return (height*base)/2;
    }

    public Triangulo(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}
