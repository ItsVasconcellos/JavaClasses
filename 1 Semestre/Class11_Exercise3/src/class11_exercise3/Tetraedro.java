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
public class Tetraedro extends FormaTriDimensional{
    private double aresta;
    
    @Override
    public double obterArea(){
        return Math.pow(aresta,2) * Math.sqrt(3);
    }
    
    @Override
    public double ObterVolume(){
        return Math.pow(aresta, 3) *  Math.sqrt(2) / 12;
    }

    public Tetraedro(double aresta) {
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
}
