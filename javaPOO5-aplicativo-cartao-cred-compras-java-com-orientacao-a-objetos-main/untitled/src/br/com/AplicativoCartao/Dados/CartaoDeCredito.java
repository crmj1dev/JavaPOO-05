package br.com.AplicativoCartao.Dados;

public class CartaoDeCredito extends Cliente {

    double limite;
    String numeroDoCartao;
    String bandeira;

    public void imprimirInformacoes () {
        System.out.printf(("""
         
         *************************
         
         Nome: %s
         Idade: %s
         Cpf: %s
         limite: %s
         Numero do cartão: %s
         Bandeira cartão: %s
         
         *************************
         
         """), getNome(), getIdade(), getCpf(), getLimite(), getNumeroDoCartao(), getBandeira());

    }

    public CartaoDeCredito() {
        super();
        this.numeroDoCartao = numeroDoCartao;
        this.limite = limite;
        this.bandeira = bandeira;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
}


