package br.edu.unicesumar.Ex5;

public abstract class Personagem {
    private String nome;
    private String classe;
    private String status;
    private double vida;
    private double dano;
    private int nivel;

    public Personagem(String nome, String classe, String status, double vida, double dano, int nivel) {
        this.nome = nome;
        this.classe = classe;
        this.status = "Vivo";
        this.vida = vida;
        this.dano = dano;
        this.nivel = nivel;
    }

    public void atacar(Personagem alvo){
        if(this.status != "Vivo"){
            System.out.printf("O personagem %s está morto, e não pode atacar", this.getNome());
            return;
        }

        if(alvo.status != "Vivo"){
            System.out.printf("O personagem %s está morto, e não pode atacar", alvo.getNome());
            return;
        }
        double vidaAntes = alvo.getVida();

        alvo.setVida(alvo.getVida() - this.getDano());
        System.out.printf("A vida anterior do personagem %s era de %.2f, agora é %.2f", alvo.getNome(), vidaAntes, alvo.getVida());
        System.out.println();
        System.out.printf("O dano do personagem %s foi de %.2f", this.getNome(), this.getDano());
        System.out.println();

        if(alvo.getVida() <= 0){
            alvo.setStatus("Morto");
        }

        if(alvo.getStatus() == "Morto"){
            System.out.printf("O personagem %s foi morto", alvo.getNome());
        }
    }

    public void exibirDados(){
        System.out.printf("Nome: %s", nome);
        System.out.printf("\nClasse: %s", classe);
        System.out.printf("\nStatus: %s", status);
        System.out.printf("\nVida atual: %.2f", vida);
        System.out.printf("\nDano do personagem: %.2f", dano);
        System.out.printf("\nNivel atual: %d", nivel);
        System.out.println("\n");
    }


    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }

    public double getDano() {
        return dano;
    }

    public int getNivel() {
        return nivel;
    }

    public String getStatus() {
        return status;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
