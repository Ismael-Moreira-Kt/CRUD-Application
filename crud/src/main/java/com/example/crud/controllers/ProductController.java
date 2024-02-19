package com.example.crud.controllers;

import com.example.crud.dto.DeleteProductDTO;
import com.example.crud.dto.PostProductDTO;
import com.example.crud.dto.PutProductDTO;
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

    @PutMapping
    public ResponseEntity putProduct(@RequestBody @Valid PutProductDTO data) {
        ProductEntity productEntity = productRepository.getReferenceById(data.id());

        if (data.name() != null && !data.name().isEmpty()) {
            productEntity.setName(data.name());
        }
        if (data.price() != null) {
            productEntity.setPrice(data.price());
        }

        productRepository.save(productEntity);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity deleteProduct(@RequestBody @Valid DeleteProductDTO data) {
        ProductEntity productEntity = productRepository.getReferenceById(data.id());
        productRepository.delete(productEntity);
        return ResponseEntity.ok().build();
    }
}