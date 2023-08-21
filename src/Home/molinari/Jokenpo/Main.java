package Home.molinari.Jokenpo;



public class Main {
             public static void main(String[] args) {

          Jogador jogador1 = new Jogador(1, "Rodrigo Molinari", 46,0,0,0);
         Jogador jogador2 = new Jogador(2,"leandro Modena", 26,0,0,0);

            jogador1.status(true);
           jogador2.status(false);


         Jogar Jogo = new Jogar();
        Jogo.rodarJogo(jogador1,jogador2);



    }


}
