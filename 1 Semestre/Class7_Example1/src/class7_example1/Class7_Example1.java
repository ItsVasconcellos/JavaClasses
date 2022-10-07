/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class7_example1;

import java.util.Set;

/**
 *
 * @author Fernando
 */
public class Class7_Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person("Tania",22);
        Student a1 = new Student("Fulano", 50, 123);
        System.out.println(p1.getName()+ " " + p1.getAge());
        
        System.out.println(a1.getName() + " " + a1.getAge() + " " + a1.getRa());
        
        Teacher professor1 =  new Teacher("Matioli",92,20000);
        System.out.println(professor1.getName() + " " + professor1.getAge() + " " + professor1.getSalary());
        
        Tutor jesus = new Tutor("Victor Jesus", 33, 200000, 500);
        System.out.println(jesus.getName() + " " + jesus.getAge() + " " + jesus.getRa() + " Renda:" + jesus.getIncoming());
        
        
        
    }
    
}
