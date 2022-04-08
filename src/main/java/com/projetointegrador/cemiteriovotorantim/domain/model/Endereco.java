package com.projetointegrador.cemiteriovotorantim.domain.model;

import javax.persistence.*;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Estado", nullable = false)
    private String estado;
    @Column(name = "Cidade", nullable = false)
    private String cidade;
    @Column(name = "Bairro", nullable = false)
    private String bairro;
    @Column(name = "Rua", nullable = false)
    private String rua;
    @Column(name = "Numero", nullable = false)
    private Integer numero;

}
