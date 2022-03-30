/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class8_exercise1;

/**
 *
 * @author Fernando
 */
public class Functionary {
    protected double sallary;
    private String name;

    public Functionary(double sal, String name){
        this.name = name;
        this.sallary = sal;
        
    }
    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double calculaBonificacao(){
        return this.sallary*0.1;
    }
    
    public void showing(){
        System.out.println("Nome: " + this.name);
        System.out.println("Salário: " + this.sallary);
    }
}
   