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
public class Person {
    private String name;
    private int age;
    protected double height;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void mostra(){
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
    }
}
