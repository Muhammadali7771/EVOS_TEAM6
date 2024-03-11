package model;

import java.util.UUID;

public class Basket extends BaseModel {
    private UUID productId;
    private int cnt;
    private boolean active = true;
    private double deliveryPrice;
    private UUID userId;

    public Basket(UUID userId, UUID productId, int cnt){
        this.userId = userId;
        this.productId = productId;
        this.cnt = cnt;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public int getCnt() {
        return cnt;
    }

    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getUserId() {
        return userId;
    }
}
