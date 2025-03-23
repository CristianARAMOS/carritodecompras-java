package com.carrito.compras.api.carritodecompras.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.carrito.compras.api.carritodecompras.Entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
