package com.example.desafio_btg_pactual.usecaseimp;

import com.example.desafio_btg_pactual.domain.Product;
import com.example.desafio_btg_pactual.gateway.GetProductsByIdGateway;
import com.example.desafio_btg_pactual.usecase.GetProductsByIdUseCase;

import java.util.List;

public class GetProductsByIdUseCaseImpl implements GetProductsByIdUseCase {

    private final GetProductsByIdGateway getProductsByIdGateway;

    public GetProductsByIdUseCaseImpl(GetProductsByIdGateway getProductsByIdGateway) {
        this.getProductsByIdGateway = getProductsByIdGateway;
    }

    @Override
    public List<Product> getProductsById(List<Long> id) {
        return getProductsByIdGateway.getProductsByIdGateway(id);
    }
}
