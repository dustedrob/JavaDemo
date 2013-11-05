/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.dao;

import demo.cdi.Item;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roberto
 */
public class DefaultItemDao implements ItemDao, Serializable {

    
    @Override
    public List<Item> fetchItems() {
        List<Item> results = new ArrayList<Item>();
        results.add(new Item(900,"Laptop Computer"));
        results.add(new Item(500, "Play Station 4"));
        results.add(new Item(100, "Car Stereo"));
        results.add(new Item(600, "Iphone"));
        return results;
    }

   

    
}
