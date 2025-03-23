package com.carrito.compras.api.carritodecompras.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ItemOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long orderId;
    private long productId;
    private Integer cuantity;
    private Double unityPrice;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getOrderId() {
        return orderId;
    }
    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }
    public long getProductId() {
        return productId;
    }
    public void setProductId(long productId) {
        this.productId = productId;
    }
    public Integer getCuantity() {
        return cuantity;
    }
    public void setCuantity(Integer cuantity) {
        this.cuantity = cuantity;
    }
    public Double getUnityPrice() {
        return unityPrice;
    }
    public void setUnityPrice(Double unityPrice) {
        this.unityPrice = unityPrice;
    }

    

}
