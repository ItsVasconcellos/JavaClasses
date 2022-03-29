/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class8_example1;

/**
 *
 * @author Fernando
 */
public class Student extends Person
{
    private int ra;
    
    public Student(String name, int age, int ra){
        super(name,ra);
        this.ra = ra;
        this.height = 1.70;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
    
    @Override
    public void mostra(){
        super.mostra();
        System.out.println("Ra: " + this.ra);
    }
}
