package Home.molinari.Jokenpo;

public class Jogador {

    //atributos
      private String nome;
    private int idade, vitoria, derrota, numero, empate;


    // metodos


    public void status(boolean continuar) {

        while (continuar) {

            System.out.println("###### Bem vindos ao jogo JOKENPO ######");


            continuar = false;

        }
        System.out.println("-------------------------------------------");
        System.out.println("Jogador" + this.getNumero() + ":" + this.getNome());
        System.out.println("Idade:" + this.getIdade());
        System.out.println("Placar: Vitorias:" + this.getVitoria()+"   Derrotas:"+ this.getDerrota()+"   Empates:"+this.getEmpate());

        System.out.println("-------------------------------------------");


    }

    public void vitoria() {
        this.setVitoria(this.getVitoria() + 1);
    }

    public void empate() {
        this.setEmpate(this.getEmpate() + 1);
    }

    public void derrota() {
        this.setDerrota(this.getDerrota() + 1);
    }


    //metodos especiais


    // construtor


    public Jogador(int num, String no, int id, int vit, int der, int emp) {
        this.nome = no;
        this.idade = id;
        this.vitoria = vit;
        this.derrota = der;
        this.numero = num;
        this.empate = emp;
    }

    //Getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }


    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
