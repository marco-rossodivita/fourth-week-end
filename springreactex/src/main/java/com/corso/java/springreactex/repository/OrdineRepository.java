package com.corso.java.springreactex.repository;

import com.corso.java.springreactex.domain.Ordine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdineRepository extends JpaRepository<Ordine, String> {


}
