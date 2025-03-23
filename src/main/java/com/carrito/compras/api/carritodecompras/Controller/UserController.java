package com.carrito.compras.api.carritodecompras.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carrito.compras.api.carritodecompras.Entities.User;
import com.carrito.compras.api.carritodecompras.Repositories.UserRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    
    @GetMapping()
    public List<User> getMethodName() {
    
       
    
        return  userRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {

        return userRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("User not found with the id: " + id));
    }

    @PostMapping
    public User postMethodName(@RequestBody User user) {
        
        
        return userRepository.save(user);
    }
    
    

}
