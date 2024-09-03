package com.example.desafio_btg_pactual.service;

import com.example.desafio_btg_pactual.domain.Product;
import com.example.desafio_btg_pactual.exception.NotFoundException;
import com.example.desafio_btg_pactual.exception.enums.ErrorCodeEnum;
import com.example.desafio_btg_pactual.gateway.GetProductsByIdGateway;
import com.example.desafio_btg_pactual.repository.ProductRepository;

import java.util.List;

public class GetProductsByIdGatewayImpl implements GetProductsByIdGateway {

    private final ProductRepository productRepository;

    public GetProductsByIdGatewayImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getProductsByIdGateway(List<Long> id) throws NotFoundException {
        List<Product> products = productRepository.findAllById(id).stream().toList();

        if(products.isEmpty()) throw new NotFoundException(
                ErrorCodeEnum.ON0002.getMessage(),
                ErrorCodeEnum.ON0002.getCode()
        );

        if (products.size() != id.size()) {
            throw new NotFoundException(
                    ErrorCodeEnum.ON0003.getMessage(),
                    ErrorCodeEnum.ON0003.getCode()
            );
        }

        return products;
    }
}
