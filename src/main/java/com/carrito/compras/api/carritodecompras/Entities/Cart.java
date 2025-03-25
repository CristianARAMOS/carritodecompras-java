package com.carrito.compras.api.carritodecompras.Entities;

import java.time.LocalDate;
import java.util.List;


import jakarta.persistence.*;


@Entity(name = "Cart")
@Table(name = "cart")
public class Cart {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User userId;

    private LocalDate date;

    @OneToMany(mappedBy = "itemCart", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ItemCart> itemCart;

    
    @Enumerated(EnumType.STRING)
    private State state;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }
    
    public List<ItemCart> getItemCart() {
        return itemCart;
    }
    public void setItemCart(List<ItemCart> itemCart) {
        this.itemCart = itemCart;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public User getUserId() {
        return userId;
    }
    public void setUserId(User userId) {
        this.userId = userId;
    }
   
    
}
