package com.webapp.ecommercebackend.model.dao;

import com.webapp.ecommercebackend.model.Product;
import org.springframework.data.repository.ListCrudRepository;

public interface ProductDAO extends ListCrudRepository<Product, Long> {
}
