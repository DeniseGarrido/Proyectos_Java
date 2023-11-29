/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import oovv.EsUnaCadenaEX;
import oovv.EstaBuitEX;
import oovv.MJoc;
import oovv.NoEsUnaLLetraEX;
import vista.FPrincipal;

/**
 *
 * @author Administrador
 */
public class CFPrincipal implements ActionListener {

    private FPrincipal finestra;
    private MJoc joc;

    public CFPrincipal(FPrincipal finestra) {
        this.finestra = finestra;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            switch (e.getActionCommand()) {
                case "AltraJugada":
                    joc = new MJoc();
                    finestra.activaJoc(true);
                    finestra.mostraPenjat(joc.getIconPenjat());
                    finestra.mostraGuions(joc.getGuions());
                    break;
                case "EntraLaLletra":
                    String lletra = finestra.getLLetra();
                    joc.busca(lletra);
                    finestra.mostraPenjat(joc.getIconPenjat());
                    finestra.mostraGuions(joc.getGuions());
                    if (joc.haGuanyat()) {
                        JOptionPane.showMessageDialog(finestra, "BRAVO!!!!");
                        finestra.activaJoc(false);
                    }else if (joc.estasMort()) {
                        JOptionPane.showMessageDialog(finestra, "Estas mort\nla película és\n"+joc.getPeli());
                        finestra.activaJoc(false);
                    }
            }
        } catch (EstaBuitEX | EsUnaCadenaEX | NoEsUnaLLetraEX ex) {
            JOptionPane.showMessageDialog(finestra, ex.getMessage());
        }
    }

}
