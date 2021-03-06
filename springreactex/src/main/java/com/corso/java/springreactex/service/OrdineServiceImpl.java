package com.corso.java.springreactex.service;


import com.corso.java.springreactex.domain.Ordine;
import com.corso.java.springreactex.repository.OrdineRepository;
import com.corso.java.springreactex.service.api.OrdineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdineServiceImpl implements OrdineService {

    @Autowired
    OrdineRepository ordineRepository;

    @Override
    public Optional findById(String id) {
        return ordineRepository.findById(id);
    }

    @Override
    public List<Ordine> findAll() {
        return ordineRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        ordineRepository.deleteById(id);
    }

    @Override
    public Ordine save(Ordine ordine) {
        return ordineRepository.save(ordine);
    }
}
