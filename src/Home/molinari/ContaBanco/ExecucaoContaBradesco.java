package Home.molinari.ContaBanco;


import Home.molinari.ContaBanco.ContaBradesco;

import java.util.Scanner;

// conta C1 = numero da conta 1
// conta C2 = numero da conta 2
public class ExecucaoContaBradesco {

    public static void main(String[] args) {

        // criação do objeto e atribuição de atributos

        ContaBradesco c1 = new ContaBradesco("Rodrigo Molinari", "Corrente", 1, 1000);
        ContaBradesco c2 = new ContaBradesco("Leandro Modena", "Poupança", 2, 2000);


        // inicio do metodo de transferencia, check do saldo e status


        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua conta");
        int vA = teclado.nextInt();

        System.out.println("Digite o valor a ser transferido");
        double valor = teclado.nextDouble();


        switch (vA) {

            case 1:

                c1.transfParte1(valor);
                break;

            case 2:

                c2.transfParte1(valor);
                break;

            default:
                System.out.println("Conta invalida.");
                c1.inativar();
                c2.inativar();
        }


        if (c1.isStatus() != false && c2.isStatus() != false) {


            System.out.println("Digite a conta a ser transferida");
            int vB = teclado.nextInt();

            if (vA == vB) {
                System.out.println("Erro, Tente novamente!");

                switch (vA) {

                    case 1:

                        c1.transfParte2(valor);
                        break;

                    case 2:

                        c2.transfParte2(valor);
                        break;


                }


            } else {

                switch (vB) {

                    case 1:

                        c1.transfParte2(valor);
                        break;
                    case 2:

                        c2.transfParte2(valor);
                        break;

                    default:
                        System.out.println("Conta invalida.");


                }

            }


            switch (vA) {

                case 1:
                    if (c1.getSaldo() == 0) {
                        c1.inativar();
                    }

                case 2:
                    if (c2.getSaldo() == 0) {
                        c2.inativar();

                    }


            }


            c1.imprimir();
            c2.imprimir();


        }

    }
}
