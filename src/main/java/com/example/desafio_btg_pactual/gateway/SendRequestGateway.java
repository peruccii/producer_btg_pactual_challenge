package com.example.desafio_btg_pactual.gateway;

import com.example.desafio_btg_pactual.domain.Request;

public interface SendRequestGateway {
    void sendRequestProducer(Request request);
}
