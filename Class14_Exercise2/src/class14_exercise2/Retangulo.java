/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class14_exercise2;

/**
 *
 * @author Fernando
 */
public class Retangulo implements AreaCalculavel{
    private float base;
    private float height;

    public Retangulo(float base, float height) {
        this.base = base;
        this.height = height;
    }
    
    
    
    @Override
    public double calcularArea(){
        return this.getBase()*this.getHeight();
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
