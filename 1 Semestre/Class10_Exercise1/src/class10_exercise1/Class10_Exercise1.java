/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class10_exercise1;

/**
 *
 * @author Fernando
 */
public class Class10_Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal a1 = new Dog("Jesus",17);
        Animal a2 = new Horse("Lando",10);
        Animal a3 = new Sloth("Baiano",5);
        
        a1.makesNoise();
        a2.makesNoise();
        a3.makesNoise();
    }
    
}
