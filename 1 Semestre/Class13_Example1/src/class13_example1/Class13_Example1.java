/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class13_example1;

/**
 *
 * @author Fernando
 */
public class Class13_Example1 {

    public static void aumentarLetra(){
        String teste = "cidade";
        try{
            //System.out.println(teste.toUpperCase());
            System.out.println(teste.charAt(3));
        }
        catch(NullPointerException e){
            System.out.println(e);
            System.out.println("String nao pode ser nula!");
        }
        catch(Exception e){
            System.out.println("Erro " + e.getMessage());
        }
        finally{
            System.out.println("Catabimpas!");
        }
    }
    public static void main(String[] args) {
        aumentarLetra();
        System.out.println("Fim!");
    }
    
}
