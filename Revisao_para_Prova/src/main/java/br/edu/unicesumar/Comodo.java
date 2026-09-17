package br.edu.unicesumar;

import java.util.Scanner;

public class Comodo {
    private String nome;
    private int cargaMaximaWatts;
    private Dispositivo dispositivos[];
    private int proximaPosicaoLivre;

    public Comodo(){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o nome do Comodo: ");
        this.nome = scanner.nextLine();

        System.out.printf("Digite a quantidade máxima de Watts suportada pelo comodo: ");
        this.cargaMaximaWatts = scanner.nextInt();

        dispositivos = new Dispositivo[10];
        proximaPosicaoLivre=0;
    }

    public void exibirDados(){
        System.out.printf("Nome Comodo: %s | Quantidade máxima Watts: %d ", nome, cargaMaximaWatts);
    }

    public void addDispositivo(Dispositivo dispositivo){
        if(this.proximaPosicaoLivre >= 10){
            System.out.printf("Limite de dispositivos do Comodo %s ", this.nome);
        }else{
            this.dispositivos[proximaPosicaoLivre] = dispositivo;
            this.proximaPosicaoLivre++;
        }
    }

    public void exibirDispositivos(){
        System.out.printf("Comodo %s", nome);
            for(int i=0; i<10; i++){
                if(dispositivos[i] != null){
                    System.out.printf(" \nDispositivo %d: %s | Consumo \n", i, dispositivos[i].getNome(), dispositivos[i].getConsumoWatts());
                }else{
                    System.out.printf("nao ta preenchido");
                }
            }


    }

}
