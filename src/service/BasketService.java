package service;

import model.Basket;

import java.util.UUID;

public class BasketService {
    private Basket[] baskets = new Basket[100];
    private int index = 0;
    public void addBasket(Basket basket){
        baskets[index++] = basket;
    }
    public Basket[] getMyBasket(UUID userId){
        int count = 0;
        for (int i=0; i < index; i++){
            if (baskets[i] != null && baskets[i].getUserId().equals(userId) && baskets[i].isActive()){
                count++;
            }
        }
        Basket[] myBasket = new Basket[count];
        int index1 = 0;
        for (int i=0; i < index; i++){
            if (baskets[i] != null && baskets[i].getUserId().equals(userId) && baskets[i].isActive()){
                myBasket[index1++] = baskets[i];
            }
        }
        return myBasket;
    }

}
