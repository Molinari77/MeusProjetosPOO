package dev.molinari.game;

import java.util.Random;
import java.util.Scanner;

public class PapelPedraTesoura implements StartGame {

    private Object object;

    private final String bemVindo = "Seja bem-vindo ao Papel - Pedra - Tesoura";
    private final String selectMsg = "Selecione: \n 1 - Tesoura\n 2 - Papel\n 3 - Pedra";
    private final String msgEscolha = "O Computador escolheu ";
    private final Scanner teclado;
    private int vitorias;
    private int derrotas;
    private final int tesoura = 1;
    private final int papel = 2;
    private final int pedra = 3;

    public PapelPedraTesoura(Scanner teclado) {
        this.teclado = teclado;
    }

    @Override
    public void start() {
        boolean isContinue = true;
        exibirMessage(bemVindo);
        do {
            try {
                exibirMessage(selectMsg);
                int escolhaJogador = teclado.nextInt();
                Status status = verificarVencedor(escolhaJogador);
                switch (status) {
                    case VITORIA: {
                        exibirMessage("Parabéns vc ganhou");
                        break;
                    }
                    case DERROTA: {
                        exibirMessage("Você perdeu");
                        break;
                    }
                    case EMPATE: {
                        exibirMessage("Houve um empate");
                        break;
                    }
                }
                showPlacar();
                exibirMessage("Deseja continuar jogando? Se sim selecione S e aperte enter");
                String continueJogo = teclado.next();
                if (!continueJogo.equalsIgnoreCase("s")) {
                    isContinue = false;
                    exibirMessage("Muito obrigado por participar");
                }
            } catch (Exception e) {
                exibirMessage("Você não selecionou um numero correto");
                isContinue = false;
            }

        } while (isContinue);
    }

    private void exibirMessage(String msg) {
        System.out.println(msg);
    }

    private String showPlacar() {
        System.out.println("O placar atual é " + "Vitorias: " + vitorias + " e " + "derrotas " + derrotas);
        return "O placar atual é " + "Vitorias: " + vitorias + " e " + "derrotas " + derrotas;
    }

    private Status verificarVencedor(int escolhaJogador) throws Exception {
        final int jogadaComputador = escolhaComputador();
        msgEscolhaComputador(jogadaComputador);
        switch (escolhaJogador) {
            case 1:
                return comTesoura(jogadaComputador);
            case 2:
                return comPapel(jogadaComputador);
            case 3:
                return comPedra(jogadaComputador);
            default:
                throw new Exception();
        }
    }

    private Status comTesoura(int jogadaComputador) {
        if (jogadaComputador == pedra) {
            addDerrota();
            return Status.DERROTA;
        } else if (jogadaComputador == papel) {
            addVitoria();
            return Status.VITORIA;
        } else {
            return Status.EMPATE;
        }
    }

    private Status comPapel(int jogadaComputador) {
        if (jogadaComputador == tesoura) {
            addDerrota();
            return Status.DERROTA;
        } else if (jogadaComputador == pedra) {
            addVitoria();
            return Status.VITORIA;
        } else {
            return Status.EMPATE;
        }
    }

    private Status comPedra(int jogadaComputador) {
        if (jogadaComputador == papel) {
            addDerrota();
            return Status.DERROTA;
        } else if (jogadaComputador == tesoura) {
            addVitoria();
            return Status.VITORIA;
        } else {
            return Status.EMPATE;
        }
    }

    private void msgEscolhaComputador(int random) {
        if (random == 1) {
            System.out.println();
        } else if (random == 2) {
            System.out.println(msgEscolha + "papel");
        } else {
            System.out.println(msgEscolha + "pedra");
        }
    }

    private int escolhaComputador() {
        return new Random().nextInt(3) + 1;
    }

    private void addVitoria() {
        vitorias++;
    }

    private void addDerrota() {
        derrotas++;
    }

    private enum Status {
        VITORIA, DERROTA, EMPATE
    }

    @Override
    public String toString() {
        return "Esse é meu metodo";
    }
}

