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
import java.util.Set;


public class Warehouse {
    
    private Map<String, Integer> priceList;
    private Map<String, Integer> stock;
    
    public Warehouse() {
        this.priceList = new HashMap<>();
        this.stock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.priceList.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product) {
        if(this.priceList.containsKey(product)) {            
            return this.priceList.get(product);
        }
        else return -99;
    }
    
    public int stock(String product) {
        if(this.stock.containsKey(product)) {            
            return this.stock.get(product);
        }
        else return 0;
    }
    
    public boolean take(String product) {
        if(stock(product) == 0) {
            return false;
        } else {
            this.stock.put(product, stock(product) - 1);
            return true;
        }     
    } 
    
    public Set<String> products() {
        return this.priceList.keySet();
    }
    
}
