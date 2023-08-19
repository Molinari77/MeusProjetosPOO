package dev.molinari.aula02;

public class Caneta {

    // +
    public String cor;
    // #
    protected String modelo;
    // -
    private float esfera;

    public boolean isTampa;

    public Tinta tinta;

    public Caneta(boolean isTampa) {
        this.isTampa = isTampa;
        this.tinta = new Tinta();
    }

    public String getTintaDensidade() {
        return tinta.getDensidade();
    }

    void escrever(String texto) {
        if (isTampa) {
            System.out.println(texto);
        }
    }

    public void setEsfera(float esfera) {
        this.esfera = esfera;
    }

    public float getEsfera() {
        return esfera;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isTampa() {
        return isTampa;
    }

    public void setTampa(boolean tampa) {
        isTampa = tampa;
    }


    // SubClasse ou classe interna
    public class Tinta {

        private String densidade;
        private String cor;

        public Tinta() {
            setDensidade("default");
            setCor("default");
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public String getDensidade() {
            return densidade;
        }

        public void setDensidade(String densidade) {
            this.densidade = densidade;
        }
    }

}
