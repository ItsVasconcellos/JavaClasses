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
public class SpecialAccount extends BankAccount{
    private float limit;
    
    public SpecialAccount(String client, int code, double bal, float limit){
        super(client,code,bal);
        this.limit = limit;
    }
    
    public void withdraw(float quantity){
        if(this.getBalance() - quantity < (- limit) ){ return;}
        else{ this.setBalance(this.getBalance() - quantity);}
    }

    public float getLimit() {
        return limit;
    }

    public void setLimit(float limit) {
        this.limit = limit;
    }
    
}
