package com.corso.java.springreactex.service;

import com.corso.java.springreactex.domain.Prodotto;
import com.corso.java.springreactex.repository.ProdottoRepository;
import com.corso.java.springreactex.service.api.ProdottoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdottoServiceImpl implements ProdottoService {

    @Autowired
    ProdottoRepository prodottoRepository;

    @Override
    public Optional findById(String id) {
        return prodottoRepository.findById(id);
    }

    @Override
    public List<Prodotto> findAll() {
        return prodottoRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        prodottoRepository.deleteById(id);
    }

    @Override
    public Prodotto save(Prodotto prodotto) {
        return prodottoRepository.save(prodotto);
    }
}
