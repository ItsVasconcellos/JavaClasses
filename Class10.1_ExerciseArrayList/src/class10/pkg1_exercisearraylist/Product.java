/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class10.pkg1_exercisearraylist;

/**
 *
 * @author Fernando
 */
public class Product {
    private int code;
    private String name;

    public void mostra(){
        System.out.println("é um produto");
    }    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
