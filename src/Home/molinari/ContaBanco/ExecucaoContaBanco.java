package Home.molinari.ContaBanco;

import Home.molinari.ContaBanco.ContaBanco;

import java.util.Scanner;

public class ExecucaoContaBanco {

    public static void main(String[] args) {


        //Numero da contaA = 3547 e contaB = 3566

        // ***INICIO: Criação do objeto conta e atribuição de um número de conta ***
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua conta de 4 números sem o dígito");
        ContaBanco contaA = new ContaBanco(teclado.next());

        System.out.println("Digite a conta a ser transferida de 4 números sem o dígito");
        ContaBanco contaB = new ContaBanco(teclado.next());
        // ***FIM***


        // ***INICIO: Atribuições ao atributo clienteDaConta ***
        contaA.setClienteDaconta("Rodrigo Molinari");
        contaB.setClienteDaconta("Leandro Modena");
        // ***FIM***



        // ***INICIO: Atribuições ao atributo saldoDaconta ***
        contaA.setSaldoDaconta(1000);
        contaB.setSaldoDaconta(2000);
        // ***FIM***



        // ***INICIO: Transferencia (Aqui utilizado a função do mecanismo de transferencia e inativação da conta)***

        if(contaA.getNumeroDaconta().equals("3547") && contaB.getNumeroDaconta().equals("3566") ) {


            System.out.println("Digite o valor a ser transferido");
            int vlr = teclado.nextInt();

            contaA.TransferenciaEntreContas(vlr, contaB);
            System.out.println("Saldo atual R$" + contaB.getSaldoDaconta() + " conta: "
                    + contaB.getNumeroDaconta() + " cliente " + contaB.getClienteDaconta());

            System.out.println("Saldo atual R$" + contaA.getSaldoDaconta() + " conta: "
                    + contaA.getNumeroDaconta() + " cliente " + contaA.getClienteDaconta());

        }else{

            System.out.println("Conta(s) inexistente(s)");

        }


        // ***FIM***


        // ***INICIO: Inativação da conta***

        contaB.status(contaA.isStatusDaconta());
        contaA.status(contaB.isStatusDaconta());
        // ***FIM***
    }

}
