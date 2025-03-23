package com.carrito.compras.api.carritodecompras.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carrito.compras.api.carritodecompras.Entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
