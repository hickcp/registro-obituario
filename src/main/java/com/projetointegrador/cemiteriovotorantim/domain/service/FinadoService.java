package com.projetointegrador.cemiteriovotorantim.domain.service;

import com.projetointegrador.cemiteriovotorantim.domain.model.Finado;
import com.projetointegrador.cemiteriovotorantim.domain.repository.FinadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinadoService {

    @Autowired
    private FinadoRepository finadoRepository;

    public Finado save(Finado finado){ return finadoRepository.save(finado);}
}
