/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4_challenge1;

/**
 *
 * @author Fernando
 */
public class Class4_Challenge1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //upper case
        String txt = "Teste";
        System.out.println(txt.toUpperCase());
        //position 3
        char position3 = txt.charAt(3);
        System.out.println(position3);
        
        String compare = "Teste";
        int i = txt.compareTo(compare);
        if(i==0)
        {
            System.out.println("São iguais!");
        }
        else
            System.out.println("São diferentes");
        
        /*String legal = new String("Indaiatuba");
        String chato = new String("Atibaia");
        
        System.out.println(legal.charAt(3));
        System.out.println(legal.toUpperCase());
        System.out.println(legal.endsWith("a"));
        
        if (legal.equals(chato))
        {
            System.out.println("É igual");
        }
        else
        {
            System.out.println("É diferente");
        }
        
        System.out.println(legal.equalsIgnoreCase(chato));*/
    }
    
}
