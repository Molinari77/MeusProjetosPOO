package dev.molinari.aula03;

public enum DiasSemana {
    DOMINGO(1),
    SEGUNDA(2),
    TERCA(3),
    QUARTA(4),
    QUINTA(5),
    SEXTA(6),
    SABADO(7);

    DiasSemana(int numeroSemana) {
        this.numeroSemana = numeroSemana;
    }

    public final int numeroSemana;

}
