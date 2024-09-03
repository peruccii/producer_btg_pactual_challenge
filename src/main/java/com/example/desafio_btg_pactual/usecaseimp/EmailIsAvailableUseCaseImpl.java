package com.example.desafio_btg_pactual.usecaseimp;

import com.example.desafio_btg_pactual.gateway.EmailIsAvailableGateway;
import com.example.desafio_btg_pactual.usecase.EmailIsAvailableUseCase;

public class EmailIsAvailableUseCaseImpl implements EmailIsAvailableUseCase {

    private final EmailIsAvailableGateway emailIsAvailableGateway;

    public EmailIsAvailableUseCaseImpl(EmailIsAvailableGateway emailIsAvailableGateway) {
        this.emailIsAvailableGateway = emailIsAvailableGateway;
    }

    @Override
    public Boolean isEmailAvailable(String email) {
        return emailIsAvailableGateway.isEmailAvailable(email);
    }
}
