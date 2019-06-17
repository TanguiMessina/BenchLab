package com.example.app.benchlab.service;

import com.example.app.benchlab.dao.AddressRepository;
import com.example.app.benchlab.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    private AddressRepository repository;

    public void AddAddress(Long streetNumber, String street, Long zipCode, String city, String country){
        Address addressToCreate = new Address(streetNumber,street,zipCode,city,country);
        repository.save(addressToCreate);
    }
}
