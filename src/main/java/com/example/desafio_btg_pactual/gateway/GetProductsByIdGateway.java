package com.example.desafio_btg_pactual.gateway;

import com.example.desafio_btg_pactual.domain.Product;
import com.example.desafio_btg_pactual.exception.NotFoundException;

import java.util.List;

public interface GetProductsByIdGateway {
    List<Product> getProductsByIdGateway(List<Long> id) throws NotFoundException;
}
