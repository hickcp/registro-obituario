package com.projetointegrador.cemiteriovotorantim.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Concessionario {
    @Id
    @GeneratedValue(generator = "increment"/*GenerationType.IDENTITY*/)
    @GenericGenerator(name = "increment", strategy ="increment")
    private Long id;
    @Column(name = "Nome", nullable = false)
    private String nome;
    @Column(name = "CPF", nullable = false)
    private String cpf;
    @Column(name = "RG", nullable = false)
    private String rg;

    @Column(name = "DataDeNascimento"/*, nullable = false*/)
    private LocalDate dataNascimento;


    @JsonIgnoreProperties("concessionario")
    @OneToMany(mappedBy = "concessionario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Finado> finados = new ArrayList<>();

    @JsonIgnoreProperties("concessionario")
    @OneToOne(mappedBy = "concessionario", cascade = CascadeType.ALL, orphanRemoval = true)
    private Endereco endereco;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public List<Finado> getFinados() {
        return finados;
    }

    public void setFinados(List<Finado> finados) {
        this.finados = finados;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
