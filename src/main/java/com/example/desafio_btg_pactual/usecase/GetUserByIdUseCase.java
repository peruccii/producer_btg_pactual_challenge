package com.example.desafio_btg_pactual.usecase;

import com.example.desafio_btg_pactual.domain.User;
import com.example.desafio_btg_pactual.exception.NotFoundException;

import java.util.Optional;

public interface GetUserByIdUseCase {
    User getUserById(Long id) throws NotFoundException;
}
