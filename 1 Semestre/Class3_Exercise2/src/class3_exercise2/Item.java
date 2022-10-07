/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3_exercise2;

/**
 *
 * @author Fernando
 */
public class Item {
    private String code;
    private String description;
    private int soldItems;
    private double price;
    
    public Item(String code, String description, int soldItems, double price)
    {
        setCode(code);
        setDescription(description);
        setSoldItems(soldItems);
        setPrice(price);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSoldItems() {
        return soldItems;
    }

    public void setSoldItems(int soldItems) {
        if(soldItems < 0)
            this.soldItems = 0;
        else
            this.soldItems = soldItems;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0)
            this.price = 0;
        else
            this.price = price;
    }
    
    public double getTotal(double price, int quantitySold)
    {
        double totalPrice;
        if(quantitySold >= 0)
            totalPrice = price*quantitySold;
        else
            totalPrice = 0;
        return totalPrice;
    }
}
