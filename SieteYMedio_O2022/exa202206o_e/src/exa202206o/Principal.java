/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exa202206o;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import logica.LFPrincipal;
import vista.FPrincipal;

/**
 *
 * @author Eduardo Silvestre
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }
        FPrincipal fp = new FPrincipal();
        LFPrincipal lfp = new LFPrincipal(fp);
        fp.setOidor(lfp);
        fp.setVisible(true);
        
    }

}
