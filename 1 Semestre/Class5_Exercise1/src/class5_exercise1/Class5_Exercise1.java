/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5_exercise1;

/**
 *
 * @author Fernando
 */
public class Class5_Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Savings poupanca1 = new Savings(2000); 
        Savings poupanca2 = new Savings(3000); 
        Savings.setAnualTax(0.03); 
        poupanca1.montlhyIncomes(); 
        poupanca2.montlhyIncomes(); 
        System.out.println(poupanca1.getBalance()); 
        System.out.println(poupanca2.getBalance());
        Savings.setAnualTax(0.04); 
        poupanca1.montlhyIncomes(); 
        poupanca2.montlhyIncomes(); 
        System.out.println(poupanca1.getBalance()); 
        System.out.println(poupanca2.getBalance());
    }
    
}
