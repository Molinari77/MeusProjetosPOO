package Home.molinari.ContaBanco;

public class ContaBanco {


    // INICIO: Atributos

    private int saldoDaconta;
    private String clienteDaconta, numeroDaconta;

    private int statusDaconta;

    // FIM


    // INICIO: Atribuição a classe o numero da conta
      public ContaBanco(String numero){

          this.numeroDaconta = numero;
      }
   // FIM


        // INICIO: Criação da função do mecanismo da conta inativa
       public void status(int statusDaconta){

        if (getSaldoDaconta() == 0) {
        System.out.println("Conta inativa saldo zerado, conta "+getNumeroDaconta());
        }}
        // FIM



    // INICIO: Criação da função do mecanismo de transferencia e falta de saldo

    public void TransferenciaEntreContas(int valor, ContaBanco recebe) {


        if (getSaldoDaconta() >= valor) {

            setSaldoDaconta(getSaldoDaconta() - valor);  // movimentação de subtração

            recebe.setSaldoDaconta(recebe.getSaldoDaconta() + valor);  // movimentação de adição

         } else {

            System.out.println("Transferencia não realizada por falta de saldo");

        } }

    // *** FIM****



    // *** INICIO: Metodo Getter and Setter para oS atributos***
    public int getSaldoDaconta() {
        return saldoDaconta;
    }

    public void setSaldoDaconta(int saldoDaconta) {
        this.saldoDaconta = saldoDaconta;
    }

    public String getClienteDaconta() {
        return clienteDaconta;
    }

    public void setClienteDaconta(String clienteDaconta) {
        this.clienteDaconta = clienteDaconta;
    }

    public int isStatusDaconta() {
        return statusDaconta;
    }

    public void setStatusDaconta(int statusDaconta) {
        this.statusDaconta = statusDaconta;
    }

    public String getNumeroDaconta() {
        return numeroDaconta;
    }

    public void setNumeroDaconta(String numeroDaconta) {
        this.numeroDaconta = numeroDaconta;
    }
// *** FIM: Metodo Getter and Setter para os atributos***


}

