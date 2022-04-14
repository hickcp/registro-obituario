package com.projetointegrador.cemiteriovotorantim.domain.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
public class Finado {
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
    @Column(name = "DataDeObito"/*, nullable = false*/)
    private String dataObito;
    @Column(name = "DataDeNascimento"/*, nullable = false*/)
    private String dataNascimento;
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

    public String getDataObito() {
        return dataObito;
    }

    public void setDataObito(String dataObito) {
        this.dataObito = dataObito;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
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
