/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3_exercise3;

/**
 *
 * @author Fernando
 */
public class Person {
    private int age;
    private int day;
    private int month;
    private int year;
    private String name;
    
    public Person(int day, int month, int year)
    {
        setDay(day);
        setMonth(month);
        setYear(year);
        setName("");
        /* setAge(0); */
        // a idade deve ser definida ou não? pois ela estará errada!//
    }

    public Person(int day, int month, int year, String name)
    {
        setDay(day);
        setMonth(month);
        setYear(year);
        setName(name);
        /* setAge(0); */
        // a idade deve ser definida ou não? pois ela estará errada!//
    }
    
    public int informaIdade() {
        int age = this.calculoIdade();
        return age;
    }

    public void setAge(int age) {
        if(age < 0)
            this.age = 0;
        else
            this.age = age;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day >= 1 && day <= 31)
            this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month >= 1 && month <= 12)
            this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >= 1000 && year <= 2022)
            this.year = year;
    }

    public String informaNome() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int calculoIdade() {
        int var = 2022 - this.year;
        setAge(var);
        return var;
    }
}
