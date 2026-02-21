package com.ecommerce.service;

import java.util.List;
import com.ecommerce.model.Product;

public interface ProductService {

    Product addProduct(Product product);

    List<Product> getAllProducts();

    Product getProductById(Long id);
}
