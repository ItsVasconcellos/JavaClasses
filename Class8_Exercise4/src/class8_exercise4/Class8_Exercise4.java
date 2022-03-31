/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class8_exercise4;

/**
 *
 * @author Fernando
 */
public class Class8_Exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Doctor d1 = new Doctor(true,"Cris",10);
        GeneralPracticer g1 = new GeneralPracticer(true,"Roberto",9,false);
        Surgeon s2 = new Surgeon(false,"Lucas", 11);
        
        d1.treatPatient();
        g1.reciept();
        s2.incision();
        s2.treatPatient();
        
        g1.show();
        s2.show();
        d1.show();
    }
    
}
