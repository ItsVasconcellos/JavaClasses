/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class14_example1;

/**
 *
 * @author Fernando
 */
public class StringVaziaException extends RuntimeException{
    @Override 
    public String getMessage(){
        return ("A string nao pode ser vazia!");
    }
    
}
