package com.projetointegrador.cemiteriovotorantim.domain.model;

import org.apache.tomcat.jni.Local;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
public class Finado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nome", nullable = false)
    private String nome;
    @Column(name = "CPF", nullable = false)
    private String cpf;
    @Column(name = "RG", nullable = false)
    private String rg;
    @Column(name = "DataDeObito"/*, nullable = false*/)
    private LocalDate dataObito;
    @Column(name = "DataDeNascimento"/*, nullable = false*/)
    private LocalDate dataNascimento;
    @Column(name = "Tumulo", nullable = false)
    private String tumulo;

    @ManyToOne
    @JoinColumn(name = "idConcessionario")
    private Concessionario concessionario;

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

    public LocalDate getDataObito() {
        return dataObito;
    }

    public void setDataObito(LocalDate dataObito) {
        this.dataObito = dataObito;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTumulo() {
        return tumulo;
    }

    public void setTumulo(String tumulo) {
        this.tumulo = tumulo;
    }

    public Concessionario getConcessionario() {
        return concessionario;
    }

    public void setConcessionario(Concessionario concessionario) {
        this.concessionario = concessionario;
    }




}
