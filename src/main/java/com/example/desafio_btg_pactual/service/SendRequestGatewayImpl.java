package com.example.desafio_btg_pactual.service;

import com.example.desafio_btg_pactual.config.constants.RabbitMqConstants;
import com.example.desafio_btg_pactual.domain.Request;
import com.example.desafio_btg_pactual.gateway.SendRequestGateway;
import org.springframework.amqp.core.AmqpTemplate;

public class SendRequestGatewayImpl implements SendRequestGateway {

    private final AmqpTemplate amqpTemplate;

    public SendRequestGatewayImpl(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    @Override
    public void sendRequestProducer(Request request) {
        amqpTemplate.convertAndSend(
                RabbitMqConstants.STOCK_REQUESTS,
                request
        );
    }
}
