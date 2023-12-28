package com.webapp.ecommercebackend.service;

import com.webapp.ecommercebackend.model.Product;
import com.webapp.ecommercebackend.model.dao.ProductDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductDAO productDAO;

    public ProductService(ProductDAO productDAO){
        this.productDAO = productDAO;
    }

    public List<Product> getProducts(){
        return productDAO.findAll();
    }
}
