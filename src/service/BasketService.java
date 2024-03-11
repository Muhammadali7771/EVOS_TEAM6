package service;

import model.Basket;

public class BasketService {
    private Basket[] baskets = new Basket[100];
    private int index = 0;
    public void addBasket(Basket basket){
        baskets[index++] = basket;
    }

}
