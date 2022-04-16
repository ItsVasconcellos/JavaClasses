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
public class Trapezio extends Quadrilatero{
    private double base2;

    public Trapezio(double base2, double base, double height) {
        super(base, height);
        this.base2 = base2;
    }
    public double getBase2() {
        return base2;
    }
    
    @Override
    public double calcArea(){
        return((this.getBase()+ base2)*this.getHeight()/2);
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }
    
}
