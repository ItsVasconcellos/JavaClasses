/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3_exercise1;

/**
 *
 * @author Fernando
 */
public class Employee {
    private String name;
    private String surname;
    private double monthly_Salary;
    public Employee(String name, String surname, double monthly_Salary)
    {
        setName(name);
        setSurname(surname);
        setMonthly_Salary(monthly_Salary);
    }
    
    public Employee()
    {
        setName("");
        setSurname("");
        setMonthly_Salary(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getMonthly_Salary() {
        return monthly_Salary;
    }

    public void setMonthly_Salary(double monthly_Salary) {
        if(this.monthly_Salary >= 0)
        {
                this.monthly_Salary = monthly_Salary;
        }
        else
        {
            this.monthly_Salary = 0;
        }
    }
    
    public double anual_Sal(double monthly_Salary)
    {
        double anual_Sal = monthly_Salary*12;
        return anual_Sal;
    }
    
    public double increase()
    {
        double increase = anual_Sal(this.monthly_Salary)*1.1;
        return increase;
        
    }
    
}
