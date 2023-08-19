package dev.molinari.aula03;

public enum CartasEnum {
    J(11, "J"),
    Q(12, "Q"),
    K(13, "K"),
    A(14, "A");

    public int valorCarta;
    private String carta;

    CartasEnum(int valor, String carta) {
        valorCarta = valor;
        this.carta = carta;
    }

    public String getCarta() {
        return carta;
    }
}
