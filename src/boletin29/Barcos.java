package boletin29;

public abstract class Barcos {

    private String matricula;
    private int eslora;
    private int ndias;

    public Barcos() {
    }

    public Barcos(String matricula, int eslora, int ndias) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.ndias = ndias;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getNdias() {
        return ndias;
    }

    public void setNdias(int ndias) {
        this.ndias = ndias;
    }

    public int calcularAlq(int modulo) {
        return ndias * modulo;
    }

    public abstract int calcularModulo(Barcos barco);

}
