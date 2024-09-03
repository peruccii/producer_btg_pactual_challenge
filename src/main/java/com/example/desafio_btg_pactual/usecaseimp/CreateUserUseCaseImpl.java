package com.example.desafio_btg_pactual.usecaseimp;

import com.example.desafio_btg_pactual.domain.User;
import com.example.desafio_btg_pactual.gateway.CreateUserGateway;
import com.example.desafio_btg_pactual.usecase.CreateUserUseCase;

public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private final CreateUserGateway createUserGateway;

    public CreateUserUseCaseImpl(CreateUserGateway createUserGateway) {
        this.createUserGateway = createUserGateway;
    }

    @Override
    public void createUser(User user) {
        createUserGateway.createUserGateway(user);
    }
}
