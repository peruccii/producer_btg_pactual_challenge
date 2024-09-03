package com.example.desafio_btg_pactual.usecase;

import com.example.desafio_btg_pactual.domain.Product;

import java.util.List;

public interface GetProductsByIdUseCase {
    List<Product> getProductsById(List<Long> id);
}
