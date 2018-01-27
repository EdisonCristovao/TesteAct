package br.com.actteste.springboot.resources;

import br.com.actteste.springboot.modelo.Questao;
import br.com.actteste.springboot.repository.QuestaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/questoes")
public class QuestaoResources {

    @Autowired
    private QuestaoRepository questaoRepository;

    @GetMapping
    public List<Questao> listar () {
        return questaoRepository.findAll();

    }
}
