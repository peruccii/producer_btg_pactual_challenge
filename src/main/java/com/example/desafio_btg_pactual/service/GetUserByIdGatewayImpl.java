package com.example.desafio_btg_pactual.service;

import com.example.desafio_btg_pactual.domain.User;
import com.example.desafio_btg_pactual.exception.NotFoundException;
import com.example.desafio_btg_pactual.exception.enums.ErrorCodeEnum;
import com.example.desafio_btg_pactual.gateway.GetUserByIdGateway;
import com.example.desafio_btg_pactual.repository.UserRepository;


public class GetUserByIdGatewayImpl implements GetUserByIdGateway {

    private final UserRepository userRepository;

    public GetUserByIdGatewayImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserByIdGateway(Long id) throws NotFoundException {
        User user = userRepository.findById(id).orElseThrow(() -> new NotFoundException(
                ErrorCodeEnum.ON0001.getMessage(),
                ErrorCodeEnum.ON0001.getCode()
        ));
        return user;
    }
}
