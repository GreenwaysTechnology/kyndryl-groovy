package com.mycom.oo.javabeans;

import com.mycom.oo.javabeans.entity.Product;

public class ProductMain {
    public static void main(String[] args) {
        //Here object is initalized through setters
        Product product = new Product();
        product.setId(1);
        product.setProductName("IPhone");
        product.setPrice(45.89);
        product.setInStock(true);
        product.setQty(100);
        //get product details
        System.out.println("Id " + product.getId());
        System.out.println("Name " + product.getProductName());
        System.out.println("Price " + product.getPrice());
        System.out.println("Stock " + product.isInStock());

        //Here Object is initalized through constructors
        Product newProduct = new Product(12, "Tv", 89.89, 100, true);
        System.out.println("Id " + newProduct.getId());
        System.out.println("Name " + newProduct.getProductName());
        System.out.println("Price " + newProduct.getPrice());
        System.out.println("Stock " + newProduct.isInStock());

    }
}
