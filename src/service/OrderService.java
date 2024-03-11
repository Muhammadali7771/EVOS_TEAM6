package service;

import model.Order;

import java.util.UUID;

public class OrderService {
    private Order[] orders = new Order[100];
    private int index = 0;

    public void addOrder(Order order, UUID userId){
        order.setUserId(userId);
        orders[index++] = order;
    }

    public void payOrder(UUID userId){
        for (int i=0;i<index;i++){
            if (orders[i]!=null && orders[i].getUserId().equals(userId) && !orders[i].isCompeted()){
                orders[i].setCompeted(true);
            }
        }
    }
}
