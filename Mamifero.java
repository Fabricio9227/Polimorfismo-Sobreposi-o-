package com.aula06.aula12;

public class Mamifero extends Animal {
    //Atributos
    private String corPelo;

    //Métodos sobrescritos
    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom()  {
        System.out.println("Som de Mamífero");
    }

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    //Acessores

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
