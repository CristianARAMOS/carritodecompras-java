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
    @JoinColumn(name = "users")
    private User userId;

    private LocalDate date;

  
    private List<ItemCart> itemCarts;

    
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
    public User getUserId() {
        return userId;
    }
    public void setUserId(User userId) {
        this.userId = userId;
    }

    
}
