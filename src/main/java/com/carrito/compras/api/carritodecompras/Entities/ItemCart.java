package com.carrito.compras.api.carritodecompras.Entities;

import jakarta.persistence.*;


@Entity(name = "ItemCart")
@Table(name = "cartItem")
public class ItemCart {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "itemCart")
    private Cart itemCart;

    @OneToOne
    @JoinColumn(name = "product")
    private Product product;
    private Integer cuantity;
    private Double unityPrice;
    public Long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
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
    public Cart getCart() {
        return itemCart;
    }
    public void setCart(Cart itemCart) {
        this.itemCart = itemCart;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
   
    


}
