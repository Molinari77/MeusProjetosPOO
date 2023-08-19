package dev.molinari.aula01;


// Modelo -> Forma de bolo
public class Copo {

    int Altura;
    int diamentro;
    String cor;

    String tipo;


    public void armazenarAgua() {
        System.out.println("Armazenando Agua");
    }

    public void tacarNaCabeca() {
        if (tipo.equals("vidro")){
            System.out.println("Copo quebrou por que foi jogado na cabeça");
        } else {
            System.out.println("Não fez nada");
        }

    }

}
