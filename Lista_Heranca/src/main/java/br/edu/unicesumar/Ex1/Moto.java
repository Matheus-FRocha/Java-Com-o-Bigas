package br.edu.unicesumar.Ex1;

public class Moto extends Veiculo{
    private int cilindradas;


    public Moto(String marca, String modelo){
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}

