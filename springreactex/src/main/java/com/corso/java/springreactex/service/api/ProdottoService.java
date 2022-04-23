package com.corso.java.springreactex.service.api;

import com.corso.java.springreactex.domain.Prodotto;

import java.util.List;
import java.util.Optional;

public interface ProdottoService {

    Optional findById(String id);
    List<Prodotto> findAll();
    void deleteById(String id);
    Prodotto save(Prodotto prodotto);
}
