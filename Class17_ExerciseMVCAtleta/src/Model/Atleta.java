/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Fernando
 */
public class Atleta {
    private String name;
    private int code;
    private double peso;
    private double altura;
    private double idade;

    public String getName() {
        return name;
    }

    public Atleta(String name, int code, double peso, double altura, double idade) {
        this.name = name;
        this.code = code;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }
    
    
}
