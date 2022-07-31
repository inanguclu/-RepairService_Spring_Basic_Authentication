package com.example.springsecurityrepairservicerestapi.services;

import com.example.springsecurityrepairservicerestapi.entities.Product;
import com.example.springsecurityrepairservicerestapi.repositories.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class ProductService {

    final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public ResponseEntity save(Product product){
        Map<String,Object> hm = new LinkedHashMap<>();
        productRepository.save(product);
        hm.put("status",true);
        hm.put("result",product);
        return new ResponseEntity(hm, HttpStatus.OK);
    }

    public ResponseEntity list (){
        Map<String,Object> hm = new LinkedHashMap<>();
        hm.put("status",true);
        hm.put("result",productRepository.findAll());
        return new ResponseEntity(hm, HttpStatus.OK);
    }
}
