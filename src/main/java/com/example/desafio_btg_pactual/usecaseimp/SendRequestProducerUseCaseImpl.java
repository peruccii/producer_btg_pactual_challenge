package com.example.desafio_btg_pactual.usecaseimp;

import com.example.desafio_btg_pactual.config.constants.RabbitMqConstants;
import com.example.desafio_btg_pactual.domain.Request;
import com.example.desafio_btg_pactual.gateway.SendRequestGateway;
import com.example.desafio_btg_pactual.usecase.SendRequestProducerUseCase;

public class SendRequestProducerUseCaseImpl implements SendRequestProducerUseCase {

    private final SendRequestGateway sendRequestGateway;

    public SendRequestProducerUseCaseImpl(SendRequestGateway sendRequestGateway) {
        this.sendRequestGateway = sendRequestGateway;
    }

    @Override
    public void sendRequestProducer(Request request) {
        sendRequestGateway.sendRequestProducer(request);
    }
}
