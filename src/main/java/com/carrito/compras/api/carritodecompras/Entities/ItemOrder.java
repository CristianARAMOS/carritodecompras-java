package com.carrito.compras.api.carritodecompras.Entities;

import jakarta.persistence.* ;


@Entity(name = "ItemOrder")
@Table(name = "orderItem")
public class ItemOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "itemOrder")
    private Order itemOrder;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product")
    private Product productId;
    private Integer cuantity;
    private Double unityPrice;
    public long getId() {
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
    
    public Product getProductId() {
        return productId;
    }
    public void setProductId(Product productId) {
        this.productId = productId;
    }
    public Order getOrder() {
        return itemOrder;
    }
    public void setOrder(Order itemOrder) {
        this.itemOrder = itemOrder;
    }

    

}
