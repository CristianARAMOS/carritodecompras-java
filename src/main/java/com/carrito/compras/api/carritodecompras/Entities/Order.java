package com.carrito.compras.api.carritodecompras.Entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;

@Entity(name = "Order")
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn( name = "user")
    private User userId;
    private LocalDate date;
    private Double total;
    private State state;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.EAGER )
    private List<ItemOrder> itemOrder;
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
    public Double getTotal() {
        return total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }
    
    

}
