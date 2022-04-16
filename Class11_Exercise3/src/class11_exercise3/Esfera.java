/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class11_exercise3;
import java.lang.Math;

/**
 *
 * @author Fernando
 */
public class Esfera extends FormaTriDimensional{
    private double raio;
    
    @Override
    public double obterArea(){
        return 4*Math.PI*raio*raio;
        
    }

    public Esfera(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double ObterVolume(){
        return (4/3)*Math.PI*raio*raio*raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
