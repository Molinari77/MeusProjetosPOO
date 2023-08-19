package Home.molinari.Jokenpo;

import java.util.Scanner;

public class Jogar {

    //atributos

    private Jogador usuario1;
    private Jogador usuario2;

     int objeto1, objeto2;
    private boolean iniciar;


    //metodos


    public void rodarJogo (Jogador j1, Jogador j2) {
        this.usuario1 = j1;
        this.usuario2 = j2;

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

         if (continuar == true) {

            System.out.println("Vamos lá, jogo iniciado");


                   for (int i = 0; i <= 3; i++) {

               System.out.println("Jogador1, escolha um dos objetos, digitando (1) para pedra, (2) para papel ou (3) para tesoura");
                objeto1 = scanner.nextInt();

                System.out.println("Jogador2,  escolha um dos objetos, digitando (1) para pedra, (2) para papel ou (3) para tesoura");
                objeto2 = scanner.nextInt();

                regra();
                usuario1.status(false);
                usuario2.status(false);

            }
        }


    }

public void regra (){

            //1 = pedra, 2 = papel  e 3 = tesoura
            if(objeto1==objeto2){
                System.out.println("Empate");
                this.usuario1.empate();
                this.usuario2.empate();
            }else if(objeto1==1 && objeto2==3) {

                System.out.println("-----------------------------------");
                System.out.println("##### Jogador1, ganhou a luta #####");
                System.out.println("-----------------------------------");

            this.usuario1.vitoria();
            this.usuario2.derrota();
        }else if (objeto1==2 && objeto2==1){
                System.out.println("-----------------------------------");
                System.out.println("##### Jogador1, ganhou a luta #####");
                System.out.println("-----------------------------------");

            this.usuario1.vitoria();
            this.usuario2.derrota();
        }else if (objeto1==3 && objeto2==2) {


                   System.out.println("-----------------------------------");
                System.out.println("##### Jogador1, ganhou a luta #####");
                System.out.println("-----------------------------------");

            this.usuario1.vitoria();
            this.usuario2.derrota();
        }else{


                System.out.println("-----------------------------------");
                System.out.println("##### Jogador2, ganhou a luta #####");
                System.out.println("-----------------------------------");



                this.usuario1.derrota();
            }
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
