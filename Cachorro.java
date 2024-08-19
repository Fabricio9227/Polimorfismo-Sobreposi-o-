package com.aula06.aula12;

public class Cachorro extends Mamifero {
    //Método abstrato
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }

    //Métodos
    public void enterrarOsso() {
        System.out.println("Enterrando o osso");
    }
    public void abanarRabo() {
        System.out.println("Abanando o rabo");
    }
}
