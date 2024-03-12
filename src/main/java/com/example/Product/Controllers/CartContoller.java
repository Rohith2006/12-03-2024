package com.example.Product.Controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Product.DTO.FakeStoreApi;
import com.example.Product.Services.CartService;


@RestController
public class CartContoller {
    
    CartService CartService;
    public CartContoller(CartService CartService) {
        this.CartService = CartService;
    }
    @GetMapping("/carts/")
    public FakeStoreApi[] getAllCartItems(){
        return CartService.getAllCartItems();
    }
    
   @GetMapping("/carts/{id}/")
   public FakeStoreApi getCartItem(@PathVariable Long id){
       return CartService.getCartItem(id);
   }    

 
}

