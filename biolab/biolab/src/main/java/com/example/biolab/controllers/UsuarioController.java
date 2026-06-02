package com.example.biolab.controllers;

import com.example.biolab.entities.Usuario;
import com.example.biolab.repositories.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioController {


    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario u){
        Usuario usuario = new Usuario(u.getNome(),u.getEmail());
        usuarioRepository.save(usuario);
        return usuario;
    }

    @GetMapping
    public List<Usuario> mostrarUsuario(){
        List<Usuario> listaUsuario = usuarioRepository.findAll();
        return listaUsuario;
    }
}
