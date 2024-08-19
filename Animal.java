package com.aula06.aula12;

public abstract class Animal {
    //Atributos
    protected float peso;
    protected int idade;
    protected int membros;

    //Métodos abstratos que serão utilizados pelas classes filhas
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    //Acessores getters e setters
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMembros() {
        return membros;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    } 
    
}
