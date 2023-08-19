package dev.molinari.aula01;

public class Conta {

    private int numero;
    private String nome;
    private String tipo;
    private int saldo;

    protected String retornarNomeTipo() {
        return nome + " " + tipo;
    }

    public void transferencia(int valor, Conta recebe) {
        if (getSaldo() >= valor) {
            // Subtração
            setSaldo(getSaldo() - valor);

            // Adição na conta
            recebe.setSaldo(recebe.getSaldo() + valor);

        } else {
            System.out.println("Saldo insuficiente na conta " + getNome());
        }
    }

    public Conta(String tipo) {
        if (tipo.equals("poupança") || tipo.equals("corrente")) {
            this.tipo = tipo;
        } else {
            this.tipo = "outros";
        }
    }

    public void setTipo(String tipo) {
        if (tipo.equals("poupança") || tipo.equals("corrente")) {
            this.tipo = tipo;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
