/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class11_exercise3;
import java.lang.Math;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Fernando
 */
public class Class11_Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Forma circ1 = new Circulo(4);
        Forma circ2 = new Circulo(6);
        Forma cubo1 = new Cubo(9);
        Forma cubo2 = new Cubo(5);
        Forma triang1 = new Triangulo(21,10);
        Forma triang2 = new Triangulo(8,9);
        Forma tetra1 = new Tetraedro(14);
        Forma tetra2 = new Tetraedro(3);
        Forma quadrado1 = new Quadrado(7);
        Forma quadrado2 = new Quadrado(90);
        Forma esfera1 = new Esfera(6);
        Forma esfera2 = new Esfera(9);
        
        ArrayList <Forma> formas = new ArrayList();
        formas.addAll(Arrays.asList(circ1,circ2,cubo1,cubo2,triang1,triang2,tetra1,tetra2,quadrado1,quadrado2,esfera1,esfera2));
        
        for(Forma f: formas){
            if(f instanceof FormaBiDimensional){
                System.out.println("A área é equivalente a: " + f.obterArea());
            }
        
            if(f instanceof FormaTriDimensional){
                FormaTriDimensional t1 = (FormaTriDimensional)f;
                System.out.println("A área é equivalente a: " + t1.obterArea());
                System.out.println("O volume é equivale a: " + t1.ObterVolume());
            }
        }
        
    }
    
}
