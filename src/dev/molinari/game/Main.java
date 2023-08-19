package dev.molinari.game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new PapelPedraTesoura(new Scanner(System.in)).start();

       /* Scanner scanner = new Scanner(System.in);
        PapelPedraTesoura papelPedraTesoura = new PapelPedraTesoura(scanner);
        papelPedraTesoura.start();*/

       // System.out.println(new PapelPedraTesoura(new Scanner(System.in)).toString());
    }

}
