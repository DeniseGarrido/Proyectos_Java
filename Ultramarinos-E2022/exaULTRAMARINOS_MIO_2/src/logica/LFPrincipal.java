/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import Excepciones.Maex;
import Excepciones.PositiuEx;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oovv.Botiga;
import oovv.Dades;
import vista.DAssignar;
import vista.FPrincipal;

/**
 *
 * @author Eduardo Silvestre
 */
public class LFPrincipal implements ActionListener {

    private FPrincipal finestra;
    private Botiga model;

    public LFPrincipal(FPrincipal finestra, Botiga model) {
        this.finestra = finestra;
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Assignar Descompte":
                DAssignar da = new DAssignar(finestra, true);
                LDAsignar lda = new LDAsignar(da, model);
                da.mostraArticles(model.getArtSenseDesc());
                da.setOidor(lda);
                da.setVisible(true);
                break;
            case "Eliminar Descomptes":
                LocalDate data = LocalDate.parse(JOptionPane.showInputDialog("Introduce la fecha - d/M/yyyy - "), Dades.dtf);
                 {
                    try {
                        model.eliminarDescuento(data);
                    } catch (Maex | PositiuEx ex) {
                        JOptionPane.showMessageDialog(finestra, ex.getMessage());
                    }
                    break;
                }
            case "Llistar Articles":
                finestra.mostra(model.llistaArticles());
                break;
        }
    }
}
