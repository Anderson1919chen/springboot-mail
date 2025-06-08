package com.andersoncheng.springbootmail.service;

import com.andersoncheng.springbootmail.dao.ProductDao;
import com.andersoncheng.springbootmail.dto.ProductRequest;
import com.andersoncheng.springbootmail.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductSerivceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductId(Integer productId) {

        return productDao.getProductId(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {

        return productDao.createProduct(productRequest);
    }
}
