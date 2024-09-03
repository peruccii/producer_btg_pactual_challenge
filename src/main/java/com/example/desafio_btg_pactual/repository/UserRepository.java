package com.example.desafio_btg_pactual.repository;

import com.example.desafio_btg_pactual.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Boolean findByEmail(String email);
}
