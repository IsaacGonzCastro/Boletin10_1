package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author igonzalezcastro
 */
public class Numero {

    int num;
    int numIntentos, numAdivinar;
    int acertaches = 0; //non acerta

    public int numeroCorrecto() {
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Introducir numero : "));
        } while (num < 1 || num > 50);
        return num;
    }

    public int numeroIntentos() {
        do {
            numIntentos = Integer.parseInt(JOptionPane.showInputDialog("Introducir numero intentos : "));
        } while (num <= 0);
        return numIntentos;
    }

    public void xogar() {
        numAdivinar = numeroCorrecto();
        numIntentos = numeroIntentos();
        JOptionPane.showMessageDialog(null, "empeza o xogo");
        for (int i = 0; i < numIntentos; i++) {

            num = numeroCorrecto();
            if (num < numAdivinar) {
                JOptionPane.showMessageDialog(null, "é maior, " + "Numero Intentos = " + (i + 1));
            } else if (num > numAdivinar) {
                JOptionPane.showMessageDialog(null, "é menor, " +  "Numero Intentos = " + (i + 1));
            } else {
                JOptionPane.showMessageDialog(null, "!Enhorabuena! é o número correcto");
                acertaches = 1;
                break;
            }
        }
        if (acertaches == 0) {
            JOptionPane.showMessageDialog(null, "!Lo siento! perdiches ");
        }

    }

}
