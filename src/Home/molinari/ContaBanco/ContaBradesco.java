package Home.molinari.ContaBanco;


import java.util.Scanner;

// Classe
public class ContaBradesco {

    //Atributos
    private String cliente, tipo;
    private double saldo;
    private int numero;
    private boolean status;


    // Metodo construtor (objeto Conta Bradesco)
    public ContaBradesco(String cliente, String tipo, int numero, double saldo) {

        this.setCliente(cliente);
        this.setTipo(tipo);
        this.setNumero(numero);
        this.setSaldo(saldo);
        this.setStatus(true);
    }


    // Metodo transferência entre contas e inativação -  parte 1

    public void transfParte1(double valor) {

        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);

        } else {

            System.out.println("Saldo insuficiente");
            this.setStatus(false);

        }


    }
    // Metodo transferência entre contas e inativação -  parte 2

    public void transfParte2(double valor) {

        setSaldo(getSaldo() + valor);

            }

    // metodo inativar

    public void inativar() {

        this.setStatus(false);

    }


    // Metodo (imprimir)

    public void imprimir() {

        System.out.println("Cliente da conta:" + this.cliente + "; tipo de conta:" + getTipo() + "; numero da conta:"
                + this.numero + " Status ativo:" + this.status + "; Saldo R$ " + getSaldo());

    }

    // Metodo (getter e setter para os atributos private)


    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
