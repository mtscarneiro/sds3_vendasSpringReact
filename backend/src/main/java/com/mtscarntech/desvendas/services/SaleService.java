package com.mtscarntech.desvendas.services;

import java.util.List;

import com.mtscarntech.desvendas.entities.Sale;
import com.mtscarntech.desvendas.repositories.SaleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public List<Sale> findAll() {
        return repository.findAll();
    }

}
