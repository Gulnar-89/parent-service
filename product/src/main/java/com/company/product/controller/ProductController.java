package com.company.product.controller;

import com.company.product.dto.ProductRequest;
import com.company.product.dto.ProductResponse;
import com.company.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
@Slf4j
public class ProductController {

private final ProductService productService;

    @PostMapping
    public void createProduct(@RequestBody ProductRequest productRequest){
        log.info("new product created {}",productRequest);
        productService.createProduct(productRequest);
    }

    @GetMapping
    public List<ProductResponse> getAllProduct(){
       return productService.getAllProducts();
    }
}
