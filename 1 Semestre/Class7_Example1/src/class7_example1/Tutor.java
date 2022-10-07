/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class7_example1;

/**
 *
 * @author Fernando
 */
public class Tutor extends Student{
    private double Incoming;
    
    public Tutor(String name, int age, int ra, double incoming){
        super(name,age,ra);
        this.Incoming = incoming;
    }

    public double getIncoming() {
        return Incoming;
    }

    public void setIncoming(double Incoming) {
        this.Incoming = Incoming;
    }
}
