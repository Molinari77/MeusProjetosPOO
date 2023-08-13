package Home.molinari.Jokenpo;

import java.util.Scanner;

public class Jogar {

    //atributos
    private Jogador jogador1;
    private Jogador jogador2;
    private boolean iniciar;


    //metodos
    public void jogarJogo (Jogador j1, Jogador j2) {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

         if (continuar == true) {

            System.out.println("Jogo iniciado");


               for (int i = 0; i <= 3; i++) {

               System.out.println(this.jogador1.getNome()+"Escolha um dos objetos, digitando (1) para pedra, (2) para papel ou (3) para tesoura");
                int objeto1 = scanner.nextInt();

                System.out.println("Jogador2 escolha um dos objetos, digitando (1) para pedra, (2) para papel ou (3) para tesoura");
                int objeto2 = scanner.nextInt();

                System.out.println(objeto1);
                System.out.println(objeto2);



            }
        }


    }


    //metodos especiais

    public Jogador getJogador1() {
        return jogador1;
    }

    public void setJogador1(Jogador jogador1) {
        this.jogador1 = jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public void setJogador2(Jogador jogador2) {
        this.jogador2 = jogador2;
    }

    public boolean isIniciar() {
        return iniciar;
    }

    public void setIniciar(boolean iniciar) {
        this.iniciar = iniciar;

    }


}
