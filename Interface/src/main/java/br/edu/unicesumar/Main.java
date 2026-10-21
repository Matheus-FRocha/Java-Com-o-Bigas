package br.edu.unicesumar;

public class Main {
    public static void main(String[] args) {

        Gerente barbara = new Gerente("Barbara", "1519", 8000, "DEv", "1515");
        Desenvolvedor matheus = new Desenvolvedor("Matheus", "1917", 15000, "Javao pegado", "1");
        Estagiario arthur = new Estagiario("Arthur", "1224", 600, "1555");

        barbara.baterPonto("1515");

        matheus.baterPonto("1");
    }
}
