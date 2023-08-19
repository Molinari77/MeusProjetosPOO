package dev.molinari.aula01;

import dev.molinari.aula02.Caneta;

public class Execucao {


    public static void main(String[] args) {
        Conta contaA = new Conta("corrente");
        Conta contaB = new Conta("corrente");
        Caneta caneta = new Caneta(false);

        contaA.setNome("Leandro");
        contaB.setNome("Molinari");

        contaA.setSaldo(1000);
        contaB.setSaldo(2000);

        contaA.transferencia(100000000, contaA);

        System.out.println(contaA.getSaldo());

        System.out.println(contaA.retornarNomeTipo());


    }

}
