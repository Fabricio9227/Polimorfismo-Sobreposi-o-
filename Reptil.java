package com.aula06.aula12;

public class Reptil extends Animal {
    //Atributos
    private String corEscama;

    //Métodos sobrescritos
    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom()  {
        System.out.println("Som de réptil");
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    //Acessores 
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
