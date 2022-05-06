/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class14_exercise1;

/**
 *
 * @author Fernando
 */
public class Class14_Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Object o = null;
        o.toString();
        }
        catch(NullPointerException f){
            System.out.println("Não é possível conveter um tipo null!");
        }
    }
    
}
