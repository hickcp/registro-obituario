package com.projetointegrador.cemiteriovotorantim.api;

import com.projetointegrador.cemiteriovotorantim.domain.model.Concessionario;
import com.projetointegrador.cemiteriovotorantim.domain.model.Endereco;
import com.projetointegrador.cemiteriovotorantim.domain.model.Finado;
import com.projetointegrador.cemiteriovotorantim.domain.service.ConcessionarioService;
import com.projetointegrador.cemiteriovotorantim.domain.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @Autowired
    private ConcessionarioService concessionarioService;

    @PostMapping("/write")
    public ResponseEntity<Endereco> save(@RequestBody Endereco newEndereco) {

        String cnome = newEndereco.getConcessionario().getNome();

        if (cnome.length() > 1 && newEndereco.getCidade().length() > 1) {

            Concessionario concessionario = concessionarioService.findByName(cnome).get(0);

            newEndereco.setConcessionario(concessionario);

            Endereco savedEndereco = enderecoService.save(newEndereco);

            return ResponseEntity.status(HttpStatus.CREATED).body(savedEndereco);
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
}

