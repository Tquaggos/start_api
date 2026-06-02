package com.biolab.copa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Selecao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String uniforme;
    private String mascote;
    public Selecao(){}

    public Selecao(String nome, String uniforme, String mascote) {
        this.nome = nome;
        this.uniforme = uniforme;
        this.mascote = mascote;
    }

    public Selecao(long id, String nome, String uniforme, String mascote) {
        this.id = id;
        this.nome = nome;
        this.uniforme = uniforme;
        this.mascote = mascote;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUniforme() {
        return uniforme;
    }

    public void setUniforme(String uniforme) {
        this.uniforme = uniforme;
    }

    public String getMascote() {
        return mascote;
    }

    public void setMascote(String mascote) {
        this.mascote = mascote;
    }
}
