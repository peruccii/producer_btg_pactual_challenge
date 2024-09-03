package com.example.desafio_btg_pactual.usecaseimp;

import com.example.desafio_btg_pactual.domain.User;
import com.example.desafio_btg_pactual.exception.NotFoundException;
import com.example.desafio_btg_pactual.gateway.GetUserByIdGateway;
import com.example.desafio_btg_pactual.usecase.GetUserByIdUseCase;

import java.util.Optional;

public class GetUserByIdUseCaseImpl implements GetUserByIdUseCase {

    private final GetUserByIdGateway getUserByIdGateway;

    public GetUserByIdUseCaseImpl(GetUserByIdGateway getUserByIdGateway) {
        this.getUserByIdGateway = getUserByIdGateway;
    }

    @Override
    public User getUserById(Long id) throws NotFoundException {
        return getUserByIdGateway.getUserByIdGateway(id);
    }
}
