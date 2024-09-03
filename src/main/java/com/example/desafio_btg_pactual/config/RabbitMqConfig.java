package com.example.desafio_btg_pactual.config;

import com.example.desafio_btg_pactual.config.constants.RabbitMqConstants;
import jakarta.annotation.PostConstruct;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    private static final String NAME_EXCHANGE = "amq.direct";
    private AmqpAdmin amqpAdmin;

    public RabbitMqConfig(AmqpAdmin amqpAdmin){
        this.amqpAdmin = amqpAdmin;
    }

    private Queue queue(String queueName) {
        return new Queue(queueName, true, false, false);
    }

    private DirectExchange directExchange() {
        return new DirectExchange(NAME_EXCHANGE);
    }

    private Binding relation(Queue queue, DirectExchange direct) {
        return new Binding(queue.getName(), Binding.DestinationType.QUEUE, direct.getName(), queue.getName(), null);
    }

    @PostConstruct
    private void add() {
        Object RabbitMQConstants;
        Queue stockQueue =  this.queue(RabbitMqConstants.STOCK_REQUESTS);

        DirectExchange direct = this.directExchange();

        Binding ligationStock = this.relation(stockQueue, direct);

        this.amqpAdmin.declareQueue(stockQueue);

        this.amqpAdmin.declareExchange(direct);

        this.amqpAdmin.declareBinding(ligationStock);
    }

    @Bean
    public Jackson2JsonMessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }
}
