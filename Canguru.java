package com.aula06.aula12;

public class Canguru extends Mamifero {
    //Método abstrato
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
    //Método
    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }
}
