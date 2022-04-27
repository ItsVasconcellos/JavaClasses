/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class12_example1;

/**
 *
 * @author Fernando
 */
public class Carro implements VeiculoTerrestre, Automovel {
    @Override
    public void frear(){
        System.out.println("Freando...."); 
    }
    @Override
    public void acelerar(){
        System.out.println("Acelerando a 200KM/h");
    }
}
