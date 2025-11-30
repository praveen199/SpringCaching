package com.spring.cache.product;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  @Cacheable("products")   // cache name = "products"
  public String getProductById(String id) {
    simulateSlowCall();
    return "Product-" + id;
  }

  @CacheEvict(value = "products", allEntries = true)
  public void clearCache() {
    System.out.println("Cache cleared!");
  }

  private void simulateSlowCall() {
    try {
      Thread.sleep(2000); // simulate slow DB/API call
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
