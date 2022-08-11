package entities;

public class Quadrado {

    private String cor;
    private int tamanho;

    public Quadrado(int tamanho) {
        this.cor = "Qualquer";
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Quadrado { " +
                "cor='" + cor + '\'' +
                ", tamanho=" + tamanho +
                '}';
    }

}
