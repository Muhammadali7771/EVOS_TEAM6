package service;

import model.Product;

import java.util.UUID;

public class ProductService {
    private Product[] products = new Product[100];
    private int index = 0;
   public boolean addProduct(Product product,UUID categoryId){
       product.setCategoryId(categoryId);
       products[index++]=product;
       return  true;
   }
    public boolean hasProduct(String productName){
       for (Product product:products){
           if(product!=null||product.getName().equals(productName)){
               return true;
           }
       }
        return false;
    }


}
