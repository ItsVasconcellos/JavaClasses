/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class8_exercise2;

/**
 *
 * @author Fernando
 */
public class Class8_Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            BankAccount b1 = new BankAccount("Roberto",120,10000);
            SavingAccount s1 = new SavingAccount("Pedro",140,7000,1);
            SpecialAccount sp1 = new SpecialAccount("Rebeca",150,9000,2000);
            
            s1.newBalance(0.08);
            
    }
    
}
