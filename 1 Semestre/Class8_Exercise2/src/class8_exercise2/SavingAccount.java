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
public class SavingAccount extends BankAccount{
    private int diaRendimento;
    
    public SavingAccount(String client, int num, double bal, int dia){
        super(client,num,bal);
        this.diaRendimento = dia;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    public void newBalance(double tax){
        this.setBalance(this.getBalance()*(1+tax));
    }
    
}
