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
public class Circulo extends FormaBiDimensional{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    @Override
    public double obterArea(){
        return Math.PI*Math.pow(raio, 2);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
