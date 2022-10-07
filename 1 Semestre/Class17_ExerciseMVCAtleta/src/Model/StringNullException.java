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
public class StringNullException extends RuntimeException{
    @Override 
    public String getMessage(){
        return "A string não pode ser vazia";
    }
}
