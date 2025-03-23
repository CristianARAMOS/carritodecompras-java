package com.carrito.compras.api.carritodecompras.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carrito.compras.api.carritodecompras.Entities.ItemCart;

public interface ItemCartRepository extends JpaRepository<ItemCart, Long>{

}
