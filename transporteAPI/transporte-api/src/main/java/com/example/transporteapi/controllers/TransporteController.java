package com.example.transporteapi.controllers;

import com.example.transporteapi.entities.Transporte;
import com.example.transporteapi.repository.TransporteRepository;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Collections;
import java.util.List;


@RestController
public class TransporteController {

    private final TransporteRepository transporteRepository;

    public TransporteController(TransporteRepository transporteRepository) {
        this.transporteRepository = transporteRepository;
    }

    public TransporteRepository getTransporteRepository() {
        return transporteRepository;
    }

    @PostMapping( value = "/transporte")
    public Transporte criarTransporte(@RequestBody Transporte transporte){

        Transporte s = new Transporte(transporte.getNome(), transporte.getTipo(), transporte.getCapacidade(), transporte.getValor());

        transporteRepository.save(s);

        return s;










    }

    @GetMapping
    public List<Transporte> showTransporte(){
        List<Transporte> listarTransporte = transporteRepository.findAll();
        return listarTransporte;
    }

    @DeleteMapping(value = "/{id}")

    public String deletarSelecao(@PathVariable long id){
        Transporte transporte = transporteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Trnsporte não encontrada"));
        transporteRepository.deleteById(transporte.getId());
        return "Seleção foi excluida com sucesso!!!";
    }

    @PutMapping(value  = "/{id}")
    public Transporte alterarTransporte(@PathVariable long id, @RequestBody Transporte tAtualizado){
        Transporte transporte = transporteRepository.findById(id).orElseThrow(() -> new RuntimeException("Transporte Nâo Encontrado"));

        transporte.setNome(tAtualizado.getNome());
        transporte.setCapacidade(tAtualizado.getCapacidade());
        transporte.setValor(tAtualizado.getValor());
        return  transporteRepository.save(transporte);
    }
}
