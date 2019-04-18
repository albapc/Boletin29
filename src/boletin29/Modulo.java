package boletin29;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Modulo {

    public ArrayList<Integer> listaB;

    public Modulo() {
    }

    public Modulo(ArrayList<Integer> listaB) {
        this.listaB = listaB;
    }

    public void añadirVelero(ArrayList<Barcos> listaB) {
        listaB.add(new Veleros(this.crearMatricula(), this.pedirEslora(), this.pedirDias(), this.pedirMastil()));
    }

    public void añadirDeportivo(ArrayList<Barcos> listaB) {
        listaB.add(new Deportivos(this.crearMatricula(), this.pedirEslora(), this.pedirDias(), this.pedirPotencia()));
    }

    public void añadirYate(ArrayList<Barcos> listaB) {
        listaB.add(new Yates(this.crearMatricula(), this.pedirEslora(), this.pedirDias(), this.pedirPotencia(), this.pedirCam()));
    }

    public void amosar(Barcos b) {
        if (b instanceof Veleros) {
            JOptionPane.showMessageDialog(null, "Velero:\nMatrícula: " + b.getMatricula()
                    + "\nEslora: " + b.getEslora()
                    + "\nNumero de días: " + b.getNdias()
                    + "\nNúmero de mástiles: " + ((Veleros) b).getMastiles()
                    + "\nPrecio de alquiler: " + b.calcularAlq(b.calcularModulo(b)) + " €");
        }
        if (b instanceof Deportivos) {
            JOptionPane.showMessageDialog(null, "Deportivo:\nMatrícula: " + b.getMatricula()
                    + "\nEslora: " + b.getEslora()
                    + "\nNúmero de días: " + b.getNdias()
                    + "\nPotencia (CV): " + ((Deportivos) b).getDeporCV()
                    + "\nPrecio de alquiler: " + b.calcularAlq(b.calcularModulo(b)) + " €");
        }
        if (b instanceof Yates) {
            JOptionPane.showMessageDialog(null, "Yate:\nMatrícula: " + b.getMatricula()
                    + "\nEslora: " + b.getEslora()
                    + "\nNúmero de días: " + b.getNdias()
                    + "\nPotencia (CV): " + ((Yates) b).getPotencia()
                    + "\nNúmero de camarotes: " + ((Yates) b).getNumcamarotes()
                    + "\nPrecio del alquiler: " + b.calcularAlq(b.calcularModulo(b)) + " €");
        }
    }

    public String crearMatricula() {
        String matricula = "";
        int[] nMat = new int[4];
        for (int i = 0; i < nMat.length; i++) {
            nMat[i] = (int) (Math.random() * 9);

        }
        for (int i = 0; i < nMat.length; i++) {
            matricula += nMat[i];
        }
        return matricula;

    }

    public int pedirEslora() {
        int eslora = 0;
        do {
            eslora = Integer.parseInt(JOptionPane.showInputDialog("Introduzca eslora:"));
            if (eslora <= 0) {
                JOptionPane.showMessageDialog(null, "Eslora no válida");
            }
        } while (eslora <= 0);
        return eslora;
    }

    public int pedirDias() {
        int ndias = 0;
        do {
            ndias = Integer.parseInt(JOptionPane.showInputDialog("Número de días:"));
            if (ndias <= 0) {
                JOptionPane.showInputDialog("Número de días no válido");
            }
        } while (ndias <= 0);
        return ndias;
    }

    public int pedirPotencia() {
        int potencia = 0;
        do {
            potencia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca potencia (en CVs):"));
            if (potencia <= 0) {
                JOptionPane.showMessageDialog(null, "Potencia no válida");
            }
        } while (potencia <= 0);
        return potencia;
    }

    public int pedirCam() {
        int numcam = 0;
        do {
            numcam = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número de camarotes"));
            if (numcam <= 0) {
                JOptionPane.showMessageDialog(null, "Número de camarotes no válido");
            }
        } while (numcam <= 0);
        return numcam;
    }

    public int pedirMastil() {
        int mastiles = 0;
        do {
            mastiles = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número de mástiles:"));
            if (mastiles <= 0) {
                JOptionPane.showInputDialog("Número de mástiles no válido");
            }
        } while (mastiles <= 0);
        return mastiles;
    }

    public void amosar() {
        for (int i = 0; i < listaB.size(); i++) {
            JOptionPane.showMessageDialog(null, "Barco: " + i + "tipo:" + listaB.get(i));
        }
    }
}
