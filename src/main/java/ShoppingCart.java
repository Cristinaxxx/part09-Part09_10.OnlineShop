/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */

import java.util.Map;
import java.util.HashMap;


public class ShoppingCart {
    
    private Map<String, Item> itemsList;
    
    public ShoppingCart() {
        this.itemsList = new HashMap<>();
    }
    
    public void add(String product, int price) {
        this.itemsList.putIfAbsent(product, new Item(product, 0, price));
        this.itemsList.get(product).increaseQuantity();        
    }
    
    public int price() {
        int totalPrice = 0;
        for(Item item : itemsList.values()) {
            totalPrice += item.price();
        }
        return totalPrice;
    }
    
    public void print() {
        for(Item item : itemsList.values()) {
            System.out.println(item);
        }
    }
    
}
