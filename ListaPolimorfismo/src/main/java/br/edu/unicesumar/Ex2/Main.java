package br.edu.unicesumar.Ex2;

public class Main {
    public static void main(String[] args) {

        Cachorro husky = new Cachorro("Husky siberiano", "2 anos", "Bob");

        Gato persa = new Gato("Persa", "5 anos", "Zé da manga");

        husky.emitirSom();

        persa.emitirSom();
    }
}
