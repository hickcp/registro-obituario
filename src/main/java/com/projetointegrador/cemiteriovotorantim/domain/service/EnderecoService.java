package com.projetointegrador.cemiteriovotorantim.domain.service;

import com.projetointegrador.cemiteriovotorantim.domain.model.Endereco;
import com.projetointegrador.cemiteriovotorantim.domain.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco save(Endereco endereco){
        return enderecoRepository.save(endereco);
    }
}
