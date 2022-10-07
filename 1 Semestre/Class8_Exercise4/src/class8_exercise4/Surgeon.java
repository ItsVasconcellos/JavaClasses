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
public class Surgeon extends Doctor{
    public Surgeon (boolean treat,String name, int code){
        super(treat,name,code);
    }
    
    public void treatPateint(){
        System.out.println("Making surgery");
    }
    
    public void incision(){
        System.out.println("Incision in progress");
    }

}
