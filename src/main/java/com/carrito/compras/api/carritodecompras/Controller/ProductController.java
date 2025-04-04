package com.carrito.compras.api.carritodecompras.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carrito.compras.api.carritodecompras.Entities.Product;
import com.carrito.compras.api.carritodecompras.Repositories.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
     @Autowired
    private ProductRepository productRepository;




    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Product not find with th ID: " + id));
    }
    

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        
        
        return productRepository.save(product);
    }


    @PostMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
        Product product = productRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Product not find with th ID: " + id));

        product.setName(productDetails.getName());
        product.setDescription(productDetails.getDescription());
        product.setPrice(productDetails.getPrice());
        product.setStock(productDetails.getStock());
        
        return productRepository.save(product);
    }
    

    @DeleteMapping()
    public String deleteProduct(@PathVariable Long id, @RequestBody Product productDetails) {
        Product product = productRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Product not find with th ID: " + id));


        
         productRepository.delete(product);
         return "The product with the ID: " + id + " is already deleted. ";
    }

    


}
