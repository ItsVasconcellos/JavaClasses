/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class11_exercise2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Fernando
 */
public class Class11_Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Property n1 = new NewProperty(1000, "Rua Jacaranda", 20000);
        Property n2 = new NewProperty(500, "Rua Cristovam", 30000);
        Property n3 = new NewProperty(600, "Rua Lorena", 35000);
        Property o1 = new OldProperty(500, "Rua Alleoni", 40000);
        Property o2 = new OldProperty(700, "Rua Alleoni", 60000);
        Property o3 = new OldProperty(800, "Rua Alleoni", 50000);
        
        ArrayList <Property> list = new ArrayList();
        
        list.addAll(Arrays.asList(n1,n2,n3,o1,o2,o3));
        
        for(Property p: list){
            if(p instanceof NewProperty){
                NewProperty n = (NewProperty)p;
                n.show();
            }
        }
    }
    
}
