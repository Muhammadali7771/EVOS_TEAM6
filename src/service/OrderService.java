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
}
