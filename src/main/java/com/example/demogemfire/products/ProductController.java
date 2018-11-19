package com.example.demogemfire.products;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Cacheable("Products")
    @GetMapping("/products/{upc}")
    public Product getProduct(@PathVariable("upc") String upc) {
        return productRepository.findById(upc).orElseThrow(ResourceNotFoundException::new);
    }

    @CacheEvict("Products")
    @DeleteMapping("/products/{upc}")
    public void deleteByUpc(@PathVariable("upc") String upc) {
        productRepository.deleteById(upc);
    }
}
