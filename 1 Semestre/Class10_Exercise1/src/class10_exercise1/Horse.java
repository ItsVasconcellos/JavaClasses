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
public class Horse extends Animal {

    public Horse(String name, int age) {
        super(name, age);
    }
    
    public void run(){
        System.out.println("Running!");
    }
    
    @Override
    public void makesNoise(){
        System.out.println("Rilinchin!");
    }
}
