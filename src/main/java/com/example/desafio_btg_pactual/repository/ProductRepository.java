package com.example.desafio_btg_pactual.repository;

import com.example.desafio_btg_pactual.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllById(List<Long> id);
}
