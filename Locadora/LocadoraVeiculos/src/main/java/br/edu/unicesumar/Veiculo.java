package br.edu.unicesumar;

public class Veiculo {
    private String modelo;
    private String marca;
    private int anoFabricacao;
    private int qtdPortas;

    public Veiculo(String marca, String modelo, int anoFabricacao){
        this.marca = marca;
        this.modelo = modelo;
        validarAnoFabricacao(anoFabricacao);
        this.qtdPortas=2;
    }

    public int getQtdPortas(){
        return qtdPortas;
    }

    public String getMarca(){
        return marca;
    }

    public void setQtdPortas(int qtdPortas){
        if (qtdPortas > 0){
            this.qtdPortas = qtdPortas;
        }
    }

     public void setAnoFabricacao(int anoFabricacao){
         validarAnoFabricacao(anoFabricacao);
     }


    public void alterarQtdPortas(int valorNovo){
        qtdPortas = valorNovo;
    }

    public void exibirDados(){
        System.out.printf("Marca %s | Modelo: %s | Ano de Fabricação: %d \n\n",
                this.marca, modelo, anoFabricacao);
    }

    private void validarAnoFabricacao(int anoFabricacao){
        if(anoFabricacao <= 1500){
            System.out.println("Valor inválido!\n");
        }else{
            this.anoFabricacao = anoFabricacao;
        }
    }

}

