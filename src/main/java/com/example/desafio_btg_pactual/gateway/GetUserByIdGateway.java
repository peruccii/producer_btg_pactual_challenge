package com.example.desafio_btg_pactual.gateway;

import com.example.desafio_btg_pactual.domain.User;
import com.example.desafio_btg_pactual.exception.NotFoundException;

import java.util.Optional;

public interface GetUserByIdGateway {
    User getUserByIdGateway(Long id) throws NotFoundException;
}
