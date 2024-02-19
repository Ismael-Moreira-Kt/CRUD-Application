package com.example.crud.controllers;

import com.example.crud.dto.PostProductDTO;
import com.example.crud.entities.ProductEntity;
import com.example.crud.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public ResponseEntity getAllProducts(){
        var allProducts = productRepository.findAll();
        return ResponseEntity.ok(allProducts);
    }

    @PostMapping
    public ResponseEntity postProduct(@RequestBody @Valid PostProductDTO data){
        ProductEntity productEntity = new ProductEntity(data);
        productRepository.save(productEntity);
        return ResponseEntity.ok().build();
    }
}