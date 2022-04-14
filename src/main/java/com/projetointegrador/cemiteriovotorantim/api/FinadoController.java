package com.projetointegrador.cemiteriovotorantim.api;

import com.projetointegrador.cemiteriovotorantim.domain.model.Concessionario;
import com.projetointegrador.cemiteriovotorantim.domain.model.Finado;
import com.projetointegrador.cemiteriovotorantim.domain.service.ConcessionarioService;
import com.projetointegrador.cemiteriovotorantim.domain.service.FinadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/finado")
public class FinadoController {

    //@Autowired
    private FinadoService finadoService;
    //@Autowired
    private ConcessionarioService concessionarioService;

    @GetMapping("/all")
    public ResponseEntity<List<Finado>> all() {
        return ResponseEntity.ok(finadoService.all());
    }


    @PostMapping("/write")
    public ResponseEntity<Finado> save(@RequestBody Finado newFinado){
        String cnome = newFinado.getConcessionario().getNome();

        if (cnome.length() > 1 && newFinado.getCpf().length() > 1) {

            Concessionario concessionario = concessionarioService.findByName(cnome).get(0);

            newFinado.setConcessionario(concessionario);

            Finado savedFinado = finadoService.save(newFinado);

            return ResponseEntity.status(HttpStatus.CREATED).body(savedFinado);

        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @GetMapping("/search/{nome}")
    public ResponseEntity<List<Finado>> search(@PathVariable String nome){
        return ResponseEntity.ok(finadoService.findByNomeStratsWith(nome));
    }


}


