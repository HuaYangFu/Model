package com.lexelpro.service;

import com.lexelpro.dao.UserDAO;
import com.lexelpro.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
	
    @Autowired
    private UserDAO userDAO;

    @Transactional
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

}
