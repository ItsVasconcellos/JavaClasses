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
public class Book extends Product {
    private String publisher;
    
    @Override
    public void mostra(){
        System.out.println("é um livro!");
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
}
