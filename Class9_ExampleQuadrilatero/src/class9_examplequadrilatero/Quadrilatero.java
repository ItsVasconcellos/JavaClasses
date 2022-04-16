/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class9_examplequadrilatero;

/**
 *
 * @author Fernando
 */
public class Quadrilatero {
    private double base;
    private double height;

    public Quadrilatero(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calcArea(){
        return base*height;
    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
}
