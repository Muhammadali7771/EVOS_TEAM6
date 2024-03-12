package service;

import model.Product;

import java.util.UUID;

public class ProductService {
    private Product[] products = new Product[100];
    private int index = 0;
   public boolean addProduct(Product product,UUID categoryId){
       if(!hasProduct(product.getName())){
       product.setCategoryId(categoryId);
       products[index++]=product;
       return  true;
       }
       return  false;
   }
    public boolean hasProduct(String productName){
       for (Product product:products){
           if(product!=null&&product.getName().equals(productName)){
               return true;
           }
       }
        return false;
    }

public  Product[] getProducts(){
       return products;
    }

    public void deleteProduct(UUID id){
        for (int i = 0; i <index ; i++) {
            if(products[i]!=null&&products[i].getId().equals(id)){
                for (int j = i; j <index-1 ; j++) {
                    products[j]=products[j+1];
                }
                products[index-1]=null;
                index--;
                return;
            }
        }
    }

    public void updateProduct(UUID id, String name, double price){
        Product existingProduct = getProductById(id);
        if (existingProduct != null){
            existingProduct.setName(name);
            existingProduct.setPrice(price);
        }
    }

    public Product getProductById(UUID id){
       for (Product product : products){
           if (product != null && product.getId().equals(id)){
               return product;
           }
       }
       return null;
    }

    public Product[] getProductsByCategoryId(UUID categoryId){
       int count = 0;
       for (Product product : products){
           if (product != null && product.getCategoryId().equals(categoryId)){
               count++;
           }
       }
       Product[] products1 = new Product[count];
       int index1 = 0;
       for (Product product : products){
            if (product != null && product.getCategoryId().equals(categoryId)){
                products1[index1++] = product;
            }
       }
       return products1;
    }
}
