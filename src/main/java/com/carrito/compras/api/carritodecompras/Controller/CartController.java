package com.carrito.compras.api.carritodecompras.Controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carrito.compras.api.carritodecompras.Entities.Cart;
import com.carrito.compras.api.carritodecompras.Repositories.CartRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartRepository cartRepository;


    @GetMapping
    public List<Cart> getCarts(@RequestBody Cart cart) {
        return cartRepository.findByUserId(cart.getUserId());
    }
    

    @PostMapping
    public Cart postMethodName(@RequestBody Cart cart) {
       Cart cart2 = new Cart();
       cart2.setDate(LocalDate.now());
       cart2.setState(cart.getState());
       cart2.setUserId(cart.getUserId());
        
        return cartRepository.save(cart2);
    }
    

}
