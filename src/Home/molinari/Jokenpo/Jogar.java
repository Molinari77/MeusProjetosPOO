package Home.molinari.Jokenpo;

import java.util.Scanner;

public class Jogar {

    //atributos

    private Jogador usuario1;
    private Jogador usuario2;
    int objeto1, objeto2;
    private boolean iniciar;

    String resposta;

    //metodos

    public void rodarJogo(Jogador j1, Jogador j2) {


///aqui
        do {

            this.usuario1 = j1;
            this.usuario2 = j2;

            Scanner scanner = new Scanner(System.in);
            boolean continuar = true;

            if (continuar == true) {

                System.out.println("*** A disputa começou, melhor de 3 partidas ***\n");

                 for (int i = 0; i <= 2; i++) {

                    System.out.println("Jogador1, escolha um dos objetos, digitando (1) para pedra, (2) para papel ou (3) para tesoura");
                    objeto1 = scanner.nextInt();

                    System.out.println("Jogador2,  escolha um dos objetos, digitando (1) para pedra, (2) para papel ou (3) para tesoura");
                    objeto2 = scanner.nextInt();

                    regra();
                    usuario1.status(false);
                     usuario2.status(false);

                }
            }

            vencedor();

            System.out.println("Deseja jogar novamente, digite (S) para continuar ou (N) para sair");
            resposta = scanner.next();

        } while (resposta.equals("S")) ;

            System.out.println("Jogo encerrado.");


        }







    public void regra() {

        //1 = pedra, 2 = papel  e 3 = tesoura
        if (objeto1 == objeto2) {
            System.out.println("\n------------------------------------------");
            System.out.println("Resultado da partida: Empate");
            System.out.println("------------------------------------------\n");;
            this.usuario1.empate();
            this.usuario2.empate();

        } else if (objeto1 == 1 && objeto2 == 3) {
            System.out.println("\n------------------------------------------");
            System.out.println("Resultado da partida: Ganhou o jogador1");
            System.out.println("------------------------------------------\n");
            this.usuario1.vitoria();
            this.usuario2.derrota();

        } else if (objeto1 == 2 && objeto2 == 1) {
            System.out.println("\n------------------------------------------");
            System.out.println("Resultado da partida: Ganhou o jogador1");
            System.out.println("------------------------------------------\n");
            this.usuario1.vitoria();
            this.usuario2.derrota();

        } else if (objeto1 == 3 && objeto2 == 2) {
            System.out.println("\n------------------------------------------");
            System.out.println("Resultado da partida: Ganhou o jogador1");
            System.out.println("\n------------------------------------------");
            this.usuario1.vitoria();
            this.usuario2.derrota();

        } else {
            System.out.println("\n------------------------------------------");
            System.out.println("Resultado da partida: Ganhou o jogador2");
            System.out.println("------------------------------------------\n");
            this.usuario1.derrota();
            this.usuario2.vitoria();
        }
    }


    public void vencedor() {
        if(usuario1.getVitoria()> usuario2.getVitoria()) {
            System.out.println("------------------------------------------");
            System.out.println("Resultado final: Jogador 1, ganhou o jogo");
            System.out.println("------------------------------------------");
        }else if(usuario2.getVitoria()> usuario1.getVitoria()) {
            System.out.println("------------------------------------------");
            System.out.println("Resultado final: Jogador 2, ganhou o jogo");
            System.out.println("------------------------------------------");
        }else{
            System.out.println("------------------------------------------");
            System.out.println("Resultado final: Houve um empate");
        }System.out.println("------------------------------------------");

    }



    //metodos especiais


    public Jogador getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(Jogador usuario1) {
        this.usuario1 = usuario1;
    }

    public Jogador getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(Jogador usuario2) {
        this.usuario2 = usuario2;
    }

    public boolean isIniciar() {
        return iniciar;
    }

    public void setIniciar(boolean iniciar) {
        this.iniciar = iniciar;

    }

    public int getObjeto1() {
        return objeto1;
    }

    public void setObjeto1(int objeto1) {
        this.objeto1 = objeto1;
    }

    public int getObjeto2() {
        return objeto2;
    }

    public void setObjeto2(int objeto2) {
        this.objeto2 = objeto2;
    }


}
