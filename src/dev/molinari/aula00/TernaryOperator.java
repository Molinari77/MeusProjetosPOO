package dev.molinari.aula00;

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {
        //lesson01();
        lesson02();
    }

    private static void lesson01() {
        /*
     Exercício 1: Verificação de maioridade
     Escreva um programa em Java que recebe a idade de uma pessoa como
     entrada e verifica se ela é maior de idade (idade igual ou superior
     a 18 anos) usando o operador ternário.
     Em seguida, exiba a mensagem "Maior de idade" ou "Menor de idade"
     com base no resultado da verificação.
        */
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = tec.nextInt();


        //                                   true               false
        String mensagem = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(mensagem);

    }

    private static void lesson02() {
        /*
         Exercício 2: Verificação de paridade
         Escreva um programa em Java que recebe um número inteiro como
         entrada e verifica se ele é par ou ímpar usando o operador ternário.
         Em seguida, exiba a mensagem "Número par" ou "Número ímpar" com base
         no resultado da verificação.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int sobraDivisao = numero % 2;
        //                                         true           false
        String mensagem = (sobraDivisao == 0) ? "Número par" : "Número ímpar";
        System.out.println("Essa foi a sobra da divisão: " + sobraDivisao);
        System.out.println(mensagem);
    }

}
