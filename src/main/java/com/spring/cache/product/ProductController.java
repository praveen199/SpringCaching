package com.spring.cache.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

  @Autowired
  private ProductService service;

  @GetMapping("/{id}")
  public String getProduct(@PathVariable String id) {
    return service.getProductById(id);
  }

  @DeleteMapping("/cache")
  public String clearCache() {
    service.clearCache();
    return "Cache cleared!";
  }
}

