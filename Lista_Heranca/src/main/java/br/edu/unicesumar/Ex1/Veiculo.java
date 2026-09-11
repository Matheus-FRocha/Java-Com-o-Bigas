package br.edu.unicesumar.Ex1;

public class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public void ExibirDados(){
        System.out.printf("Marca %s | Modelo %s ", marca,modelo);
    }

}

