package com.webapp.ecommercebackend.model.dao;


import com.webapp.ecommercebackend.model.LocalUser;
import com.webapp.ecommercebackend.model.WebOrder;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface WebOrderDAO extends ListCrudRepository<WebOrder, Long> {
    List<WebOrder> findByUser(LocalUser user);

}
