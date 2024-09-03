package com.example.desafio_btg_pactual.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table
@Entity(name = "tbl_request")
@Getter
@Setter
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "user_id")
    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    @Column(name = "product_id")
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Product> items;
}
