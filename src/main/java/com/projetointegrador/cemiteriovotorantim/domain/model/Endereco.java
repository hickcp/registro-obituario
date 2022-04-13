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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idConcessionario")
    private Concessionario concessionario;

    public Concessionario getConcessionario() {
        return concessionario;
    }

    public void setConcessionario(Concessionario concessionario) {
        this.concessionario = concessionario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
