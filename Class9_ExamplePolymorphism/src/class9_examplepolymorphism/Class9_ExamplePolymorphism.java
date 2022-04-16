/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class9_examplepolymorphism;

/**
 *
 * @author Fernando
 */
public class Class9_ExamplePolymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product p = new Book();
        p.mostra();
        Product p2 = new Magazine();
        p2.mostra();
        
        Book l = new Book();
        Product p3 = (Product)l; //Conversão, em melhores palavras typecast
        //Porem continua tendo a mesma istancia
        p3.mostra();
        
        if (p2 instanceof Book)
            System.out.println("é instância!");
        else
            System.out.println("Não é instância!");
        
    }
    
}
