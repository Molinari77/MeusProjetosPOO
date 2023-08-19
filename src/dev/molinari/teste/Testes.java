package dev.molinari.teste;

import dev.molinari.aula01.Conta;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Testes {


    public static void main(String[] args) {
        teste2();
    }

    public static void teste1() {
        /* Enunciado: Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule
        e mostre seu peso ideal, utilizando as seguintes fórmulas:
        - para sexo masculino: peso ideal = (72.7 * altura) - 58
                - para sexo feminino: peso ideal = (62.1 * altura) - 44.7 */

        //   enviado para o Github

        Scanner tec = new Scanner(System.in);


        System.out.println("Digite seu nome:");
        String nome = tec.next();
        System.out.println("Digite sua altura (exemplo 1,12):");
        float altura = tec.nextFloat();
        System.out.println("Digite seu sexo (M ou F):");
        String sexo = tec.next();

        double PesoidealM = (72.7 * altura) - 58, PesoidealF = (62.1 * altura) - 44.7;
        DecimalFormat formatador = new DecimalFormat("0.0");


        String mensagem = (sexo.equals("M")) ? nome + " ,seu peso ideal é " + formatador.format(PesoidealM) + " Kg" : nome + " ,seu peso ideal é "
                + formatador.format(PesoidealF) + " Kg";
        System.out.println(mensagem);


    }

    public static void teste2() {

        /*25)  Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
        escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
        ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'*/


        Scanner tec = new Scanner(System.in);
        System.out.println("Digite sua conta corrente (111222):");
        int ContaUsuarioDigitada = tec.nextInt();


        String[] clientes = new String[4];
        clientes[0] = " Rodrigo Molinari";
        clientes[1] = " Claudia Molinari";
        clientes[2] = " Leandro Modena";
        clientes[3] = " Janaina Modena";

        int[] CC = new int[4];
        CC[0] = 135112;
        CC[1] = 135113;
        CC[2] = 135114;
        CC[3] = 135115;

        //SDB: L1 Saldo, L2 debito e l3 credito
        double[][] SDB = {{2000, 200, 5000, 500}, {1000, 50, 2000, 50}, {100, 100, 100, 100}};

        double SaldoAtual = 0;
        String Informacao;
        int validacao;
        DecimalFormat formatador = new DecimalFormat("0.00");

        switch (ContaUsuarioDigitada) {



            case 135112:
                Informacao = clientes[0];
                SaldoAtual = SDB[0][0] - SDB[1][0] + SDB[2][0];
                System.out.println("Olá" + clientes[0] + " seu saldo atual é R$ " +formatador.format(SaldoAtual));

                break;

            case 135113:
                Informacao = clientes[1];
                SaldoAtual = SDB[0][1] - SDB[1][1] + SDB[2][1];
                System.out.println("Olá" + clientes[1] + " seu saldo atual é R$ " + formatador.format(SaldoAtual));
                break;

            case 135114:
                Informacao = clientes[2];
                SaldoAtual = SDB[0][2] - SDB[1][2] + SDB[2][2];
                ;
                System.out.println("Olá" + clientes[2] + " seu saldo atual é R$ " + formatador.format(SaldoAtual));
                break;

            case 135115:
                Informacao = clientes[3];
                SaldoAtual = SDB[0][3] - SDB[1][3] + SDB[2][3];
                ;
                System.out.println("Olá" + clientes[3] + " seu saldo atual é R$ " + formatador.format(SaldoAtual));
                break;
            default:
                System.out.println("Olá, conta corrente inválida");


        }


    }


}
