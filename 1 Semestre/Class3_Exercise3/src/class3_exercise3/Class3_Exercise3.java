/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3_exercise3;

/**
 *
 * @author Fernando
 */
public class Class3_Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person Einstein = new Person(14,3,1879, "Einstein");
        Person Newton = new Person (4,1,1643, "Newton");
        System.out.println("A idade de " + Einstein.informaNome() + " é igual a " + Einstein.informaIdade());
        System.out.println("A idade de " + Newton.informaNome() + " é igual a " + Newton.informaIdade());
    }
    
}
