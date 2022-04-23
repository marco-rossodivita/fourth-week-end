package com.corso.java.springreactex.repository;

import com.corso.java.springreactex.domain.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdottoRepository extends JpaRepository<Prodotto, String> {
}
