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
public class Operators extends Functionary{
    private int stationCode;
    
    public Operators(double sallary, String name, int stationCode){
        super(sallary,name);
        stationCode = this.stationCode;
    }
    
    public int getStationCode() {
        return stationCode;
    }

    public void setStationCode(int stationCode) {
        this.stationCode = stationCode;
    }
    
    public void showing(){
        super.showing();
        System.out.println("Codigo de estação de trabalho: " + this.stationCode);
    }
}
