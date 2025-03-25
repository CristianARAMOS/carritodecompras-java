package com.carrito.compras.api.carritodecompras.Entities;

import jakarta.persistence.*;


@Entity(name = "ItemCart")
@Table(name = "itemCart")
public class ItemCart {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "cart")
    private Cart cartId;

    @OneToOne
    @JoinColumn(name = "product")
    private Product productId;
    private long cuantity;
    private Double unityPrice;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
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
    public Product getProductId() {
        return productId;
    }
    public void setProductId(Product productId) {
        this.productId = productId;
    }
    public Cart getCartId() {
        return cartId;
    }
    public void setCartId(Cart cartId) {
        this.cartId = cartId;
    }

    



}
