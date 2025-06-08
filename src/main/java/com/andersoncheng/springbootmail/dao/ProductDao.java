package com.andersoncheng.springbootmail.dao;

import com.andersoncheng.springbootmail.dto.ProductRequest;
import com.andersoncheng.springbootmail.model.Product;

public interface ProductDao {

    Product getProductId(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
