package com.carrito.compras.api.carritodecompras.Controller;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carrito.compras.api.carritodecompras.Entities.Cart;
import com.carrito.compras.api.carritodecompras.Entities.User;
import com.carrito.compras.api.carritodecompras.Repositories.CartRepository;
import com.carrito.compras.api.carritodecompras.Repositories.UserRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.util.UriComponentsBuilder;




@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartRepository cartRepository;
    
    @Autowired
    private UserRepository userRepository;
    private URI url;
    


    @GetMapping
    public List<Cart> getCarts(@RequestBody Cart cart) {
        return cartRepository.findByUserId(cart.getUserId().getId());
    }
    

    @PostMapping
    public ResponseEntity<Cart> postMethodName(@RequestBody Cart cart) {
       Cart cart2 = new Cart();
       cart2.setDate(LocalDate.now());
       cart2.setState(cart.getState());
       Optional<User> user = userRepository.findById(cart.getUserId().getId());
        if (user.isPresent()) {
            User user1 = user.get();
            cart2.setUserId(user1);
            cartRepository.save(cart2);
            
        }
        return ResponseEntity.created(url).body(cart2);
    }
    

}
