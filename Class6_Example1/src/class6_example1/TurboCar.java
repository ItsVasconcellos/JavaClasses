/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class6_example1;

/**
 *
 * @author Fernando
 */
public class TurboCar extends DefaultCar {
    boolean turbo;
    public TurboCar(){
        
    }
    public TurboCar(String manufacture){
        super(manufacture);
    }
    public void startTurbo(){
        turbo = true;
    }
    public void turnOffTurbo(){
        turbo = false;
    }
}
