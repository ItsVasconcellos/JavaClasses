/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class11_exercirse1;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Class11_Exercirse1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ticket v1 = new Vip(20,100);
        Ticket v2 = new Vip(30,100);
        Ticket c1 = new CommonTicket(50);
        ArrayList <Ticket> list = new ArrayList();
        list.add(v1);
        list.add(c1);
        list.add(v2);
                
        double total = 0;
        for(Ticket t: list){
            
            if(t instanceof Vip){
                Vip m = (Vip)t;
                total = total + m.getValue() + m.getExtraValue();
            }
            else if(t instanceof CommonTicket){
                CommonTicket c = (CommonTicket)t;
                total = total + c.getValue();
            }   
        }
        System.out.println("Total é de: " + total);
    }
    
}
