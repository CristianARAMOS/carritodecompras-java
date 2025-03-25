package com.carrito.compras.api.carritodecompras.Entities;

import java.security.PrivateKey;
import java.util.List;

import jakarta.persistence.*;



@Entity(name = "User")
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private String name;
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Cart> carts;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public List<Cart> getCarts() {
        return carts;
    }
    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }
    

    
  


}
