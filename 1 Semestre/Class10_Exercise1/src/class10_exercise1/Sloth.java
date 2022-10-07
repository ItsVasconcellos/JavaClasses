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
public class Sloth extends Animal{

    public Sloth(String name, int age) {
        super(name, age);
    }
    
    public void climbTree(){
        System.out.println("Climbing a tree?");
    }
    public void makesNoise(){
        System.out.println("Noises");
    }
}
