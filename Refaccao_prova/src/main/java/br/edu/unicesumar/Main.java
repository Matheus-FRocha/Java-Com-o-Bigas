package br.edu.unicesumar;

public class Main {
    public static void main(String[] args) {

        Sonda sonda = new Sonda("Nave super fodona", 30000, 1776, "Magnetico");

        Foguete foguete = new Foguete("Foguete absolutamente foda", 15000, 1200, 12900);

        Engenheiro luiz = new Engenheiro("Luiz Alvarez Cabral", "crea fodastico");
        luiz.inspecionarNave(sonda);

        Hangar hangar = new Hangar("Hangar da aura absoluta", 150);
        hangar.addNave(sonda);
        hangar.addNave(foguete);

        AgenciaEspacial agenciaEspacial = new AgenciaEspacial("Agencia CVC", "CVC", "Ruan");
        agenciaEspacial.addHangar(hangar);

        System.out.printf(sonda.getHangar().getNome());
    }
}
