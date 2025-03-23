package com.carrito.compras.api.carritodecompras.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carrito.compras.api.carritodecompras.Entities.ItemOrder;

public interface ItemOrderRepository extends JpaRepository<ItemOrder, Long>{

}
