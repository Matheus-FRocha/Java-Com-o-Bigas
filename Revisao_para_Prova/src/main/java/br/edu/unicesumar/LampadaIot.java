package br.edu.unicesumar;

import java.util.Scanner;

public class LampadaIot extends Dispositivo{
    private String corHexadecimal;

    public LampadaIot(Comodo comodo){
        super(comodo);

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a cor da %s: ", getNome());
        this.corHexadecimal = scanner.nextLine();
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.printf("Cor hexadecimal: %s", corHexadecimal);
    }
}
