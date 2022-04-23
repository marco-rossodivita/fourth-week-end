package com.corso.java.springreactex.service;

import com.corso.java.springreactex.domain.Consegna;
import com.corso.java.springreactex.repository.ConsegnaRepository;
import com.corso.java.springreactex.service.api.ConsegnaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsegnaServiceImpl implements ConsegnaService {

    @Autowired
    ConsegnaRepository consegnaRepository;

    @Override
    public Optional findById(String id) {
        return consegnaRepository.findById(id);
    }

    @Override
    public List<Consegna> findAll() {
        return consegnaRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        consegnaRepository.deleteById(id);
    }

    @Override
    public Consegna save(Consegna consegna) {
        return null;
    }

}