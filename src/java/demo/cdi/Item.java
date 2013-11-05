/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.cdi;

/**
 *
 * @author roberto
 */
public class Item {

    private int value;
    private String description;

    public Item() {
    }

    
    
    public Item(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   
    
    
    @Override
    public String toString() {
        return this.value+" "+this.description;
    }
}
