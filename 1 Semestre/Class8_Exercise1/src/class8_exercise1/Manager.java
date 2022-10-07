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
public class Manager extends Functionary {
    private String username;
    private String password;
    
    public Manager(double sal, String name, String password, String username){
        super(sal,name);
        this.password = password;
        this.username = username;
                
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public double calculaBonificacao(){
        return this.sallary*0.2;
    }
    public void showing(){
        super.showing();
        System.out.println("Usuário: " +this.username);
        System.out.println("Senha: " + this.password);
        
    }
}
