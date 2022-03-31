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
public class Doctor {
    private boolean treatInHospital;
    private String name;
    private int code;
    
    public Doctor(boolean treat,String name, int code){
        this.treatInHospital = treat;
        this.name = name;
        this.code = code;
    }
    
    public void treatPatient(){
        System.out.println("Treating Patient :D");
    }
    
    public void show(){
        System.out.println("Name: " + this.name);
        System.out.println("Code: " + this.code);
        System.out.println("Treat in hospital: " + this.treatInHospital);
    }

    public boolean isTreatInHospital() {
        return treatInHospital;
    }

    public void setTreatInHospital(boolean treatInHospital) {
        this.treatInHospital = treatInHospital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
