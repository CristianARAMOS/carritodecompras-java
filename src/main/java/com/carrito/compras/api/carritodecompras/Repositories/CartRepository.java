package com.carrito.compras.api.carritodecompras.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carrito.compras.api.carritodecompras.Entities.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

    List<Cart> findByUserId(Long userid);

}
