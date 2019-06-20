package com.example.app.benchlab.service;

import com.example.app.benchlab.dao.InstituteRepository;
import com.example.app.benchlab.entity.Address;
import com.example.app.benchlab.entity.Institute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InstituteService {
    @Autowired
    private InstituteRepository repository;

    public boolean AddNewInstitute(String name, Address address) {
        Institute instituteToCreate = new Institute(name, address);
        Optional<Institute> idChecking = repository.findById(instituteToCreate.getId());
        if (idChecking == null) {
            repository.save(instituteToCreate);
            return true;
        }
        return false;
    }

    public Optional<Institute> findInstituteById(Long id) {
        Optional<Institute> instituteToFind = repository.findById(id);
        return instituteToFind;
    }


}
