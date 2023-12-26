package com.webapp.ecommercebackend.service;

import com.webapp.ecommercebackend.api.model.RegistrationBody;
import com.webapp.ecommercebackend.exception.UserAlreadyExistsException;
import com.webapp.ecommercebackend.model.LocalUser;
import com.webapp.ecommercebackend.model.dao.LocalUserDAO;
import jakarta.validation.Valid;
import jakarta.validation.Validator;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    private LocalUserDAO localUserDAO;

    public UserService(LocalUserDAO localUserDAO) {
        this.localUserDAO = localUserDAO;
    }


    public LocalUser registerUser(RegistrationBody registrationBody) throws UserAlreadyExistsException {
        if (localUserDAO.findByEmailIgnoreCase(registrationBody.getEmail()).isPresent()
                || localUserDAO.findByUsernameIgnoreCase(registrationBody.getUsername()).isPresent()) {
            throw new UserAlreadyExistsException();
        }
        LocalUser user = new LocalUser();
        user.setEmail(registrationBody.getEmail());
        user.setUsername(registrationBody.getUsername());
        user.setFirstName(registrationBody.getFirstName());
        user.setLastName(registrationBody.getLastName());
        //TODO: create passwords encryption
        user.setPassword(registrationBody.getPassword());
        return localUserDAO.save(user);
    }
}
