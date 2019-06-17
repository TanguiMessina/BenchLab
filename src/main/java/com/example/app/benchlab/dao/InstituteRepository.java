package com.example.app.benchlab.dao;

import com.example.app.benchlab.entity.Institute;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstituteRepository extends CrudRepository<Institute, Long> {
}
