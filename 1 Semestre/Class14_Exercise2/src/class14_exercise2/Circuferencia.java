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
public class Circuferencia implements AreaCalculavel{
    private double raio;
    @Override
    public double calcularArea(){
        return  Math.PI*Math.pow(this.getRaio(), 2);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circuferencia(double raio) {
        this.raio = raio;
    }
}
