package com.aula06.aula12;

public class Peixe extends Animal{
    //Atributos
    private String corEscama;

    //Métodos sobrescritos
    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }
    
    @Override
    public void emitirSom()  {
        System.out.println("Peixe não faz som");
    }
    
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    //Método
    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }

    //Acessores Getters e Setters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
