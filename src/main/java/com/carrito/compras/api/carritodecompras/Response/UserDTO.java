package com.carrito.compras.api.carritodecompras.Response;

public record UserDTO(String name ) {


    public UserDTO(String name){
        this.name = name;
    }
    

}
