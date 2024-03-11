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
        for (Order order : orders){
            if (order!=null && order.getUserId().equals(userId)){
                order.setCompeted(true);
            }
        }
    }
}
