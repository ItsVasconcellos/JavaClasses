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
public class Class3_Exercise1 {

    public static void main(String[] args)
    {
        Employee banana = new Employee("Teste", "Boco", 1000);
        System.out.println("Salario anual: " + banana.anual_Sal(banana.getMonthly_Salary()));
        System.out.format("Salario com aumento : %.2f", banana.increase());
        Employee fernando = new Employee();
        fernando.setMonthly_Salary(3500);
        fernando.setName("Fernando");
        fernando.setSurname("Vasconcellos");
        System.out.println("\nNome: " + fernando.getName() + "\nSurname: " + fernando.getSurname() + "\nSallary: " + fernando.getMonthly_Salary());
    }
    
}
