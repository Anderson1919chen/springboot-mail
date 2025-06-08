package com.andersoncheng.springbootmail.service;

import com.andersoncheng.springbootmail.dto.ProductRequest;
import com.andersoncheng.springbootmail.model.Product;

public interface ProductService {

    Product getProductId(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
