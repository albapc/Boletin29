package boletin29;

public class Yates extends Barcos {

    private int potencia;
    private int numcamarotes;

    public Yates(int potencia, int numcamarotes) {
        this.potencia = potencia;
        this.numcamarotes = numcamarotes;
    }

    public Yates(String matricula, int eslora, int ndias, int potencia, int numcamarotes) {
        super(matricula, eslora, ndias);
        this.potencia = potencia;
        this.numcamarotes = numcamarotes;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNumcamarotes() {
        return numcamarotes;
    }

    public void setNumcamarotes(int numcamarotes) {
        this.numcamarotes = numcamarotes;
    }

    @Override
    public int calcularModulo(Barcos barco) {
        int mod;
        mod = barco.getEslora() * 10 + (2 * potencia) + (25 * numcamarotes);
        return mod;
    }
}
