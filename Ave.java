package com.aula06.aula12;

public class Ave extends Animal{
        //Atributos
        private String corPena;

        //Métodos sobrescritos
        @Override
        public void alimentar() {
            System.out.println("Comendo frutas");
        }
    
        @Override
        public void emitirSom()  {
            System.out.println("Som de ave");
        }
    
        @Override
        public void locomover() {
            System.out.println("Voando");
        }

        //Método
        public void fazerNinho() {
            System.out.println("Construiu um ninho");
        }

        //Acessores Getters e Setters
        public String getCorPena() {
            return corPena;
        }

        public void setCorPena(String corPena) {
            this.corPena = corPena;
        }

        
}
