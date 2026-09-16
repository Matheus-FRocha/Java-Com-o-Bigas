package br.edu.unicesumar;

import java.util.Scanner;

public class ArCondicionadoIot extends Dispositivo{
    private double temperaturaDecimal;

    public ArCondicionadoIot(){
        super();

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a temperatura do Ar condicionado: ");
        this.temperaturaDecimal = scanner.nextDouble();
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.printf("Temperatura do ar condicionado: %.2f", temperaturaDecimal);
    }
}
