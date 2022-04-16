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
public class Cubo extends FormaTriDimensional{
    private double lado;
    
    @Override
    public double obterArea(){
        return lado*lado;
    }
    
    @Override
    public double ObterVolume(){
        return lado*lado*lado;
    }

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
