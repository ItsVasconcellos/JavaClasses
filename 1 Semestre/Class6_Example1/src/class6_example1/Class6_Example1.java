/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class6_example1;

/**
 *
 * @author Fernando
 */
public class Class6_Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DefaultCar car1;
        TurboCar car2;
        car1 = new DefaultCar();
        car2 = new TurboCar();
        
        car1.turnOn();
        car2.startTurbo();
        car2.turnOn();
    }
    
}
