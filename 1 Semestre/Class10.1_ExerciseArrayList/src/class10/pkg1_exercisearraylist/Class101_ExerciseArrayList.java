/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class10.pkg1_exercisearraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Fernando
 */
public class Class101_ExerciseArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Book bk1 = new Book();
        bk1.setCode(1234);
        bk1.setName("Diario de uma banana!");
        bk1.setPublisher("Abril");
        
        Magazine m1 = new Magazine();
        m1.setName("Veja");
        m1.setCode(456);
        m1.setMes("June");
        m1.setAno(2022);
        
        ArrayList <Product> lista = new ArrayList(); 
        lista.add(bk1);
        lista.add(m1);
        
        for(Product p: lista){
            if(p instanceof Magazine){
                Magazine m = (Magazine)p;
                System.out.println(m.getMes() + " " + m.getAno());
            }
            else if(p instanceof Book){
                Book b = (Book)p;
                System.out.println(b.getPublisher());
            }
        }
        
    }
    
}
