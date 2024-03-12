package com.example.Product.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.Product.DTO.FakeStoreApi;

@Service
public class CartService {
    
    RestTemplate restTemplate = new RestTemplate();
    String url = "https://fakestoreapi.com/";

    public FakeStoreApi[] getAllCartItems() {
      FakeStoreApi[] response = restTemplate.getForObject(url + "carts", FakeStoreApi[].class);
      return response;
    }
    public FakeStoreApi getCartItem(Long id) {
      FakeStoreApi response = restTemplate.getForObject(url + "carts/" + id, FakeStoreApi.class);
      return response;
    }


}
