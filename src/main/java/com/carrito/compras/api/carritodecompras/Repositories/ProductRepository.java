package com.carrito.compras.api.carritodecompras.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carrito.compras.api.carritodecompras.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
