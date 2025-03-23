package com.carrito.compras.api.carritodecompras.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ItemCart {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long cartId;
    private long productId;
    private long cuantity;
    private Double unityPrice;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getCartId() {
        return cartId;
    }
    public void setCartId(long cartId) {
        this.cartId = cartId;
    }
    public long getProductId() {
        return productId;
    }
    public void setProductId(long productId) {
        this.productId = productId;
    }
    public long getCuantity() {
        return cuantity;
    }
    public void setCuantity(long cuantity) {
        this.cuantity = cuantity;
    }
    public Double getUnityPrice() {
        return unityPrice;
    }
    public void setUnityPrice(Double unityPrice) {
        this.unityPrice = unityPrice;
    }

    



}
