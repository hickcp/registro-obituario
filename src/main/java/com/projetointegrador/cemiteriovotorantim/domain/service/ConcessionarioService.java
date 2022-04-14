package com.projetointegrador.cemiteriovotorantim.domain.service;

import com.projetointegrador.cemiteriovotorantim.domain.model.Concessionario;
import com.projetointegrador.cemiteriovotorantim.domain.repository.ConcessionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConcessionarioService {

    //@Autowired
    private ConcessionarioRepository concessionarioRepository;

    public Concessionario save(Concessionario c){ return concessionarioRepository.save(c);}

    public List<Concessionario> all(){return concessionarioRepository.findAll();}

    public List<Concessionario> findByNomeStratsWith(String nome){
        return concessionarioRepository.findByNomeStartsWithIgnoreCase(nome);
    }

    public List<Concessionario> findByName(String nome){
    return concessionarioRepository.findByNomeIgnoreCase(nome);
    }
}
