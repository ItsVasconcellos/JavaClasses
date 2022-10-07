/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class8_exercise4;

/**
 *
 * @author Fernando
 */
public class GeneralPracticer extends Doctor {
    private boolean treatInHome;
    
    public GeneralPracticer(boolean treat, String name, int code, boolean treatIn){
        super(treat,name,code);
        this.treatInHome = treatIn;
    }
    
    public void reciept(){
        System.out.println("The patient must take some medicine");
    }
    
    @Override
    public void show(){
        super.show();
        System.out.println("Treat in home: " + this.treatInHome);
    }
}

