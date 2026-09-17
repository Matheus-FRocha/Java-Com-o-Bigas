package br.edu.unicesumar;

import java.util.Scanner;

public class Dispositivo {
    private String nome;
    private int consumoWatts;
    private boolean ligado=false;
    private Comodo comodo;

    public Dispositivo(Comodo comodo){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o nome do dispositivo: ");
        this.nome = scanner.nextLine();

        System.out.printf("Digite o consumo em Watts do dispositivo: ");
        this.consumoWatts = scanner.nextInt();

        this.comodo = comodo;
        this.comodo.addDispositivo(this);
    }

    public String getNome() {
        return nome;
    }

    public int getConsumoWatts() {
        return consumoWatts;
    }

    public void exibirDados(){
        System.out.printf("\nNome dispositivo: %s | Consumo em watts: %d | Situação: %s\n", nome, consumoWatts, ligado ? "Ligado" : "Desligado");
    }
}
