package com.aula06.aula12;

public class Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra(); 
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();

        a.emitirSom();
        m.emitirSom();
        r.emitirSom();
        p.emitirSom();

        c.locomover();
        k.locomover();
        j.locomover();
        t.locomover();
        g.locomover();
        e.locomover();
    }
}
