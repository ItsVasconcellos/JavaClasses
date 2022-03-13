/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3_exercise4;

/**
 *
 * @author Fernando
 */
public class Class3_Exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stock estoque1 = new Stock("Impressora", 13, 6);
        Stock estoque2 = new Stock("Monitor", 11, 13);
        Stock estoque3 = new Stock("Mouse", 6 , 2);
        
        estoque1.darBaixa(5);
        estoque2.repor(7);
        estoque3.darBaixa(4);
        System.out.println("Precisa repor: " + estoque3.precisaRepor());
        System.out.println(estoque1.Mostra());
        System.out.println(estoque2.Mostra());
        System.out.println(estoque3.Mostra());
                
    }
    
}
