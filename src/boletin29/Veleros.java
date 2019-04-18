package boletin29;

/**
 *
 * @author Alba
 */
public class Veleros extends Barcos {

    private int mastiles;

    public Veleros() {
    }

    public Veleros(int mastiles) {
        this.mastiles = mastiles;
    }

    public Veleros(String matricula, int eslora, int ndias, int mastiles) {
        super(matricula, eslora, ndias);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public int calcularModulo(Barcos barco) {
        int mod;
        mod = barco.getEslora() * 10 + (8 * mastiles);
        return mod;
    }

}
