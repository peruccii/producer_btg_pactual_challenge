package com.example.desafio_btg_pactual.usecaseimp;

import com.example.desafio_btg_pactual.domain.Product;
import com.example.desafio_btg_pactual.domain.Request;
import com.example.desafio_btg_pactual.domain.User;
import com.example.desafio_btg_pactual.exception.NotFoundException;
import com.example.desafio_btg_pactual.usecase.CreateRequestUseCase;
import com.example.desafio_btg_pactual.usecase.GetProductsByIdUseCase;
import com.example.desafio_btg_pactual.usecase.GetUserByIdUseCase;
import com.example.desafio_btg_pactual.usecase.SendRequestProducerUseCase;

import java.util.List;

public class CreateRequestUseCaseImpl implements CreateRequestUseCase {

    private final SendRequestProducerUseCase sendRequestProducerUseCase;
    private final GetUserByIdUseCase getUserByIdUseCase;
    private final GetProductsByIdUseCase getProductsByIdUseCase;

    public CreateRequestUseCaseImpl(SendRequestProducerUseCase sendRequestProducerUseCase, GetUserByIdUseCase getUserByIdUseCase, GetProductsByIdUseCase getProductsByIdUseCase) {
        this.sendRequestProducerUseCase = sendRequestProducerUseCase;
        this.getUserByIdUseCase = getUserByIdUseCase;
        this.getProductsByIdUseCase = getProductsByIdUseCase;
    }

    @Override
    public Request createRequest(Request request, Long userId, List<Long> productsId) throws NotFoundException {
        // (DRY - Don't Repeat Yourself ) A service that will search all products by the `productsId` and return them.
        List<Product> products = getProductsByIdUseCase.getProductsById(productsId);

        // (DRY - Don't Repeat Yourself ) A service that will search the user by the `userId` and return it.
        User user = getUserByIdUseCase.getUserById(userId);

        Request rawRequest = new Request();
        rawRequest.setUser(user); // Turn `user` into a presenter response
        rawRequest.setItems(products); // Turn `products` into a presenter response

        // The request will not be saved in this project, it will be saved by the
        // consumer who is another project
        sendRequestProducerUseCase.sendRequestProducer(request);
        return request;
    }
}
