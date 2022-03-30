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
public class BankAccount {
    private String client;
    private int accountNumber;
    private double balance;

    public String getClient() {
        return client;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    
    public void invest(float quantity){
        setBalance(this.balance+quantity);
    }
    public void withdraw(float quantity){
        if((this.balance - quantity) < 0){
            return;
        }
        else{this.setBalance(this.balance - quantity);}
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
