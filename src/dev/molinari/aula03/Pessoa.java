package dev.molinari.aula03;

import java.util.Random;

public class Pessoa {

    private String name;

    public String setName(String name) {
        this.name = name + " Outra coisa";
        return name;
    }

    public String getName() {
        return name;
    }

    public String saveNome(String name) {
        try {
            if (new Random().nextInt(2) == 1) {
                throw new Exception("Foi Mal");
            }
            this.name = name;
            return "Sucesso";
        } catch (Exception e) {
            return "Falha";
        } finally {
            System.out.println();
        }
    }
}
