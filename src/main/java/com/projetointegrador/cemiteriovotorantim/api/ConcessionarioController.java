package com.projetointegrador.cemiteriovotorantim.api;

import com.projetointegrador.cemiteriovotorantim.domain.model.Concessionario;
import com.projetointegrador.cemiteriovotorantim.domain.service.ConcessionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/concessionario")
public class ConcessionarioController {

    @Autowired
    private ConcessionarioService concessionarioService;

    @GetMapping("/all")
    public ResponseEntity<List<Concessionario>> all(){ // retorna em lista todos os concessionario
        return ResponseEntity.ok(concessionarioService.all());
    }

    @PostMapping("/write")
    public ResponseEntity<Concessionario> save (@RequestBody Concessionario concessionario){ //salva o concessionario
        Concessionario c = concessionarioService.save(concessionario);

        return ResponseEntity.status(HttpStatus.CREATED).body(c);
    }


}
