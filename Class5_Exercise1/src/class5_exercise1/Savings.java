
package class5_exercise1;



public class Savings { 
    private static double anualTax; 
    private double balance; 
    public static double getAnualTax() {
        return anualTax; 
    } 
    public static void setAnualTax(double aAnualTax) { 
        anualTax = aAnualTax; 
    } 
    Savings(double balance1){ 
        this.balance = balance1; 
    } 
    public double getBalance() { return balance; } 
    public void setBalance(double balance) { this.balance = balance; } 
    public void montlhyIncomes(){ double monthly = this.balance*(anualTax/12); this.balance = balance + monthly; } 
}