/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3_exercise4;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Fernando
 */
public class Stock {
    private String name;
    private int qtdAtual;
    private int qtdMinima;
    
    public Stock()
    {
        setName("");
        setQtdAtual(0);
        setQtdMinima(0);
    }
    
    public Stock(String name, int qtdAtual, int qtdMinima)
    {
        setName(name);
        setQtdAtual(qtdAtual);
        setQtdMinima(qtdMinima);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }
    
    public void repor(int qntdNova)
    {
        if(qntdNova > 0)
            this.qtdAtual = this.qtdAtual + qntdNova;
    }
    
    public void darBaixa(int qntdSub)
    {
        if((this.qtdAtual - qntdSub) < 0)
            this.qtdAtual = 0;
        else
            this.qtdAtual = this.qtdAtual - qntdSub;
    }
    
    public String Mostra()
    {
        String Values = "Nome: " + this.name + ";Quantidade Atual: " + this.qtdAtual + ";Quantidade Miníma: " + this.qtdMinima;
        return Values;
    }
    
    public boolean precisaRepor()
    {
        if(this.qtdMinima > this.qtdAtual)
        {
            return true;
        } 
       return false;
    }
            
}
