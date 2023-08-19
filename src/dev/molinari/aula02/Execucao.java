package dev.molinari.aula02;

public class Execucao {

    public static void main(String[] args) {
        /*Caneta caneta = new Caneta(true);
        caneta.escrever("Ola mundo");
        caneta.setEsfera(0.5f);
        String densidade = caneta.getTintaDensidade();
        caneta.tinta.setDensidade("Nova densidade");
        String densidade1 = caneta.getTintaDensidade();
        System.out.println(densidade1);*/


        /*MinhaClasse.MEU_VALOR = "NOVO VALOR";
        String valor1 = MinhaClasse.MEU_VALOR;*/
        MinhaClasse classe1 = new MinhaClasse();
        MinhaClasse classe2 = new MinhaClasse();

        // Instancia de tinta

        Caneta.Tinta tinta = new Caneta(true).new Tinta();


        System.out.println(classe1.MEU_VALOR);

    }

}
