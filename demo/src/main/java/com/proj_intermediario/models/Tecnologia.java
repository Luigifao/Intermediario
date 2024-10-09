package com.proj_intermediario.models;

public class Tecnologia{
    private String nomeTecOrigem;
    private String nomeTecDestino;

    public Tecnologia(String nomeTecOrigem, String nomeTecDestino) {
        this.nomeTecOrigem = nomeTecOrigem;
        this.nomeTecDestino = nomeTecDestino;
    }

    public String getNomeTecOrigem() {
        return nomeTecOrigem;
    }

    public void setNomeTecOrigem(String nomeTecOrigem) {
        this.nomeTecOrigem = nomeTecOrigem;
    }

    public String getNomeTecDestino() {
        return nomeTecDestino;
    }

    public void setNomeTecDestino(String nomeTecDestino) {
        this.nomeTecDestino = nomeTecDestino;
    }
}