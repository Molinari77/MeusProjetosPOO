package Home.molinari.Jokenpo;

public class Main {
             public static void main(String[] args) {

        Jogador jogador1 = new Jogador(1,"Rodrigo Molinari", 46);
        Jogador jogador2 = new Jogador(2,"leandro Modena", 26);

         jogador1.status(true);
         jogador2.status(false);


         Jogar rodarJogo = new Jogar();
         rodarJogo.jogarJogo(jogador1,jogador2);


    }


}
