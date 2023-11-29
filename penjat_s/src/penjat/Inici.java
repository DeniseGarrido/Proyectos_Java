/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjat;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Eduardo Silvestre
 */
public class Inici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try { // posa el LAF del sistema
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }

        java.awt.EventQueue.invokeLater(() -> {
            vista.FPrincipal f = new vista.FPrincipal();
            control.CFPrincipal c = new control.CFPrincipal(f);
            f.setOidor(c);
            f.setVisible(true);
        });

    }

}
