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
public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }
    
    
    @Override
    public void makesNoise(){
        System.out.println("Ruf ruf");
    }
    public void run(){
        System.out.println("Running! ");
    }
}
