package com.example.app.benchlab.service;

import com.example.app.benchlab.dao.UserRepository;
import com.example.app.benchlab.entity.Status;
import com.example.app.benchlab.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService  {
    @Autowired
    private UserRepository repository;

    public boolean createUser(String firstname, String lastname, String email, String password, Status status){
        User userToCreate = new User(firstname,lastname,email,password,status);
        String emailToCheck = userToCreate.getEmail();
        if (emailToCheck == null){
            repository.save(userToCreate);
            return true;
        }
        return false;
    }

    public Optional<User> findUserById(Long id){
        Optional<User> userToFind = repository.findById(id);
        return userToFind;
    }
    public boolean removeUser(Long id){
        Optional<User> userToRemove = repository.findById(id);
        if (userToRemove != null){
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
