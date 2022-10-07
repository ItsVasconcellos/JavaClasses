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
public class Secretary extends Functionary{
    private int branch_Number;

    public Secretary(double sal,String name, int branch_Number)
    {
        super(sal,name);
        this.branch_Number = branch_Number;
    }
    public int getBranch_Number() {
        return branch_Number;
    }

    public void setBranch_Number(int branch_Number) {
        this.branch_Number = branch_Number;
    }
    public void showing(){
        super.showing();
        System.out.println("Codigo ramal: " + this.branch_Number);
    }
}
