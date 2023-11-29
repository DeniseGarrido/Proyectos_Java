/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exa202206x;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import logica.LFPrincipal;
import oovv.Botiga;
import oovv.Dades;
import vista.FPrincipal;


/**
 *
 * @author Eduardo
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
        Botiga botiga = Dades.creaBotiga();
        fp.mostraNomBotiga(botiga.getNom());
        LFPrincipal lfp = new LFPrincipal(fp, botiga);
        fp.setOidor(lfp);
        fp.setVisible(true);       
        
    }
    
}
