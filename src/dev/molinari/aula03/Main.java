package dev.molinari.aula03;

public class Main {

    public static void main(String[] args) {
        /*CartasEnum a = CartasEnum.A;
        CartasEnum k = CartasEnum.K;
        int valorCarta = a.valorCarta;
        String carta = a.getCarta();

        System.out.println(valorCarta);
        System.out.println(carta);*/

        /*DiasSemana dia = DiasSemana.SEXTA;
        System.out.println(dia.numeroSemana);*/

        /*Matematica matematica = new Matematica();
        int result = matematica.mostreASomaDeDoisNumero(5, 9);
        System.out.println(result);*/

        Pessoa pessoa = new Pessoa();

        System.out.println(pessoa.saveNome("Molinari"));
        System.out.println(pessoa.saveNome("Leandro"));
        System.out.println(pessoa.saveNome("Janaina"));

    }
}
