package com.example.desafio_btg_pactual.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tbl_user")
@Table
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;
}
