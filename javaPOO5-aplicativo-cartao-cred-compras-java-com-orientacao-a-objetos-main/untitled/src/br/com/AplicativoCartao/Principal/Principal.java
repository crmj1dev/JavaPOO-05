package br.com.AplicativoCartao.Principal;

import br.com.AplicativoCartao.ComprasEGastos.ComprasEGastos;
import br.com.AplicativoCartao.ComprasEGastos.ListaDeComprasEGastos;
import br.com.AplicativoCartao.Dados.CartaoDeCredito;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal extends CartaoDeCredito {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Scanner leitura2 = new Scanner(System.in);
        Scanner leitura3 = new Scanner(System.in);

        CartaoDeCredito pessoa = new CartaoDeCredito();
        //CAPTURA DE DADOS DO CLIENTE
        System.out.println("Digite seu nome:");
        pessoa.setNome(leitura.nextLine());

        System.out.println("Digite seu cpf:");
        pessoa.setCpf(leitura.nextLine());

        System.out.println("Digite sua idade:");
        pessoa.setIdade(leitura.nextInt());

        System.out.println("Digite a bandeira do seu cartão:");
        pessoa.setBandeira(leitura2.nextLine());

        System.out.println("Digite seu limite: ");
        pessoa.setLimite(leitura2.nextDouble());

        System.out.println("Digite os numeros do seu cartão:");
        pessoa.setNumeroDoCartao(leitura3.nextLine());

        pessoa.imprimirInformacoes();
        //CAPTURA DE COMPRAS E GASTOS
        System.out.println("O limite do seu cartão é " + pessoa.getLimite());

        System.out.println("\nDigite a descrição da sua compra ou gasto: ");
        String compras = (leitura3.nextLine());
        ListaDeComprasEGastos.ComprasiGastos.add(compras);

        for (Integer numero : numeros) {
            System.out.println(numero);


        }
    }
}






