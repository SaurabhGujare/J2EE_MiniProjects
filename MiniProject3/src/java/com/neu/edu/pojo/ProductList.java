/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.pojo;

import java.util.ArrayList;

/**
 *
 * @author Saurabh Gujare (NUID : 001424874)
 */
public class ProductList {
    private ArrayList<Product> productList; 

    public ProductList() {
        this.productList=new ArrayList<Product>();
    }

    public ProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public void add(Product item){
        productList.add(item);
    }
    
    public boolean remove(Product item){
        return productList.remove(item);
    }
    
    public boolean removeAll(ProductList list){       
        return productList.removeAll(list.getProductList());
    }
    
}
