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
public class Class9_ExampleQuadrilatero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quadrilatero q1 = new Retangulo(2,4);
        System.out.println(q1.calcArea());
        
        Quadrilatero q2 = new Trapezio(3,5,2);
        //Opção alternativa//
        /*Trapezio t1 = (Trapezio)q2;
        t1.setBase2(2);*/
        System.out.println(q2.calcArea());
        
    }
    
}
