package dev.molinari.aula00;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        lesson01();
    }

    private static void lesson01() {
        /*Exercício 1: Dias da semana
         Escreva um programa em Java que recebe um número de 1 a 7 como
         entrada, representando um dia da semana, e exibe o nome
         correspondente do dia da semana usando switch case.
         Considere que 1 representa segunda-feira, 2 representa terça-feira
         e assim por diante.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número (1-7): ");
        int numeroDia = teclado.nextInt();

        String nomeDia;
        // numeroDia Inteiro
        switch (numeroDia) {
            // case precisa ser do mesmo tipo da comparação
            case 1:
                nomeDia = "Segunda-feira";
                System.out.println("Puts é segunda-feira");
                break;
            case 2:
                nomeDia = "Terça-feira";
                break;
            case 3:
                nomeDia = "Quarta-feira";
                break;
            case 4:
                nomeDia = "Quinta-feira";
                break;
            case 5:
                nomeDia = "Sexta-feira";
                System.out.println("Sextooouuu");
                break;
            case 6:
                nomeDia = "Sábado";
                break;
            case 7:
                nomeDia = "Domingo";
                break;
            default:
                nomeDia = "Dia inválido";
        }

        System.out.println(nomeDia);
    }

    private void lesson02() {
        /*Exercício 2: Cálculo de imposto
        Escreva um programa em Java que recebe o código de um produto como
        entrada (valores de 1 a 4) e calcula o imposto a ser pago com base nas
        seguintes regras:

        Para código 1, o imposto é de 5%.
        Para código 2, o imposto é de 10%.
        Para código 3, o imposto é de 15%.
        Para código 4, o imposto é de 20%.
        */
    }

}
