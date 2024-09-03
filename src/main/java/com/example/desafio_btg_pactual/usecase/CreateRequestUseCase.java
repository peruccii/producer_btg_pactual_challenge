package com.example.desafio_btg_pactual.usecase;

import com.example.desafio_btg_pactual.domain.Request;
import com.example.desafio_btg_pactual.exception.NotFoundException;

import java.util.List;

public interface CreateRequestUseCase {
    Request createRequest(Request request, Long userId, List<Long> productsId) throws NotFoundException;
}
