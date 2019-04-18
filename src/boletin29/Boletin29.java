package boletin29;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Boletin29 {

    public void precioAlquiler() {

    }

    public static void main(String[] args) {

        ArrayList<Barcos> listaB = new ArrayList();
        Modulo obj = new Modulo();
        int opc;

        do {
            opc = JOptionPane.showOptionDialog(
                    null, "¿Qué barco desea alquilar?", "Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                        "Velero",
                        "Deportivo",
                        "Yate",
                        "Mostrar lista de barcos",
                        "Salir"},
                    "Exit") + 1;

            switch (opc) {
                case 1:
                    obj.añadirVelero(listaB);
                    break;
                case 2:
                    obj.añadirDeportivo(listaB);
                    break;
                case 3:
                    obj.añadirYate(listaB);
                    break;
                case 4:
                    for (Barcos bar : listaB) {
                        obj.amosar(bar);
                    }
                    break;
                case 5:
                    System.exit(0);
            }
        } while (opc != 0 && opc != 5);
    }
}
