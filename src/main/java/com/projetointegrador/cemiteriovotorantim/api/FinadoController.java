package com.projetointegrador.cemiteriovotorantim.api;

import com.projetointegrador.cemiteriovotorantim.domain.model.Concessionario;
import com.projetointegrador.cemiteriovotorantim.domain.model.Finado;
import com.projetointegrador.cemiteriovotorantim.domain.service.ConcessionarioService;
import com.projetointegrador.cemiteriovotorantim.domain.service.FinadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/finado")
public class FinadoController {

    @Autowired
    private FinadoService finadoService;
    @Autowired
    private ConcessionarioService concessionarioService;
    @GetMapping("/all")
    public ResponseEntity<List<Finado>> all (){return ResponseEntity.ok(finadoService.all());}


}


