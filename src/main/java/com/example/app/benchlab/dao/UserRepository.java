package com.example.app.benchlab.dao;

import com.example.app.benchlab.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    @Query("SELECT user FROM User AS user WHERE user.email=:e")
    User getByEmail(String e);
}
