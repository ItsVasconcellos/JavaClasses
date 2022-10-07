/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class8_exercise3;

/**
 *
 * @author Fernando
 */
public class Class8_Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewProperty n1 = new NewProperty(1,100000,"Rua Nick Lauda", 20000);
        UsedProperty u1 = new UsedProperty(2,120000,"R. Paschoal Marmo, 1888 - Jardim Nova Italia, Limeira - SP, 13484-431 ", 10000);
        
        n1.show();
        u1.show();
    }
    
}
