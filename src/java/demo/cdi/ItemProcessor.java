/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.cdi;

import demo.dao.ItemDao;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author roberto
 */

@Named
@SessionScoped
public class ItemProcessor implements Serializable{
private static final long serialVersionUID = 1L;
    @Inject
    private ItemDao itemDao;

    List<Item> items;
    Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    
    
    
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    
    public String add()
    {
        item= new Item();
        return "add";
    }
    
        public String save()
    {
        items.add(item);
        return "home";
    }
    
    public String execute() {
        items = itemDao.fetchItems();
        return "home";
    
    }

}
