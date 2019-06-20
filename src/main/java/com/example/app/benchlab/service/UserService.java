package com.example.app.benchlab.service;

import com.example.app.benchlab.dao.UserRepository;
import com.example.app.benchlab.entity.Status;
import com.example.app.benchlab.entity.User;
import com.example.app.benchlab.exception.DataAlreadyExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public boolean register(User user) throws DataAlreadyExistException  {
        User userToCheck = repository.getByEmail(user.getEmail());
        if (userToCheck == null) {
            repository.save(user);
            return true;
        }
        throw new DataAlreadyExistException("Email already used");
    }


    public User findUserById(Long id) {
        Optional<User> userToFind = repository.findById(id);
        return userToFind.get();
    }
    public Iterable<User> getAllUser(){
        Iterable<User> userList = repository.findAll();
        return userList;
    }

    public boolean removeUser(Long id) {
        Optional<User> userToRemove = repository.findById(id);
        if (userToRemove != null) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
