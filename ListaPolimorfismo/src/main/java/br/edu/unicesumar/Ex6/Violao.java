package br.edu.unicesumar.Ex6;

public class Violao extends InstrumentoMusical{
    public Violao() {
    }

    @Override
    public void tocar(){
        System.out.printf("Soando cordas de nylon");
    }
}
