package com.example.desafio_btg_pactual.presenter;

import java.math.BigDecimal;

public record ProductPresenter(
        String name,
        Integer quantity,
        BigDecimal price
) {
}
