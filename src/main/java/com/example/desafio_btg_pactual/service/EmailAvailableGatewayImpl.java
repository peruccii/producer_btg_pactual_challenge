package com.example.desafio_btg_pactual.service;

import com.example.desafio_btg_pactual.gateway.EmailIsAvailableGateway;
import com.example.desafio_btg_pactual.repository.UserRepository;

public class EmailAvailableGatewayImpl implements EmailIsAvailableGateway {

    private final UserRepository userRepository;

    public EmailAvailableGatewayImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Boolean isEmailAvailable(String email) {
        return !userRepository.findByEmail(email);
    }
}
