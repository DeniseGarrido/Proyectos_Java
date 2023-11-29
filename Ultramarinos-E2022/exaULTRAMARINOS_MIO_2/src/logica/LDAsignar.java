/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import Excepciones.Rango0y100Ex;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oovv.Article;
import oovv.Botiga;
import vista.DAssignar;

/**
 *
 * @author Eduardo Silvestre
 */
public class LDAsignar implements ActionListener {

    private DAssignar finestra;
    private Botiga model;

    public LDAsignar(DAssignar finestra, Botiga model) {
        this.finestra = finestra;
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "valida": {
                int descuento = 0;
                try {
                    descuento = finestra.agafaDesc();
                } catch (Rango0y100Ex ex) {
                    JOptionPane.showMessageDialog(finestra, ex);
                }

                LocalDate ini = finestra.agafaDataIni();
                LocalDate fin = finestra.agafaDataFin();
                String[] id = finestra.agafaArticles();
                
                model.asignaDescuento(id, descuento, ini, fin);
                finestra.dispose();
                break;
            }

        }
    }

}
