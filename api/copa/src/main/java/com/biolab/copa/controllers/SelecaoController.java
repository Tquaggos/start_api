package com.biolab.copa.controllers;

import com.biolab.copa.entities.Selecao;
import com.biolab.copa.repositories.SelecaoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SelecaoController {


    private final SelecaoRepository selecaoRepository;

    public SelecaoController(SelecaoRepository selecaoRepository) {
        this.selecaoRepository = selecaoRepository;
    }

    @PostMapping
    public String criarSelecao(@RequestBody Selecao selecao){
        Selecao s = new Selecao(selecao.getNome(), selecao.getMascote(), selecao.getUniforme());
        selecaoRepository.save(s);
        return "Calvo com sucesso!!" ;
    }
    @PostMapping(value = "teste")
    public Selecao criarSelecao1(@RequestBody Selecao selecao){
        Selecao s = new Selecao(selecao.getNome(), selecao.getMascote(), selecao.getUniforme());
        selecaoRepository.save(s);
        return s ;
    }


    @GetMapping
    public List<Selecao> resultadoSelelcao(){
        List<Selecao> listaSelecao = selecaoRepository.findAll();
        return listaSelecao;
    }
}
