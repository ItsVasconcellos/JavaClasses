/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5_exercise2;

/**
 *
 * @author Fernando
 */
public class TemperatureConversion {
    public double celciusToF(double celcius){
        double result = (celcius*1.8) + 32;
        return result;
    }
    public double fToCelcius(double fahrenheint){
        double result = (fahrenheint-32)/1.8;
        return result;
    }

}
