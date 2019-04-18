package boletin29;

public class Deportivos extends Barcos {

    private int deporCV;

    public Deportivos() {
    }

    public Deportivos(int deporCV) {
        this.deporCV = deporCV;
    }

    public Deportivos(String matricula, int eslora, int ndias, int potencia) {
        super(matricula, eslora, ndias);
        this.deporCV = potencia;
    }

    public int getDeporCV() {
        return deporCV;
    }

    public void setDeporCV(int deporCV) {
        this.deporCV = deporCV;
    }

    @Override
    public int calcularModulo(Barcos barco) {
        int mod;
        mod = 10 * barco.getEslora() + (2 * deporCV);
        return mod;
    }
}
