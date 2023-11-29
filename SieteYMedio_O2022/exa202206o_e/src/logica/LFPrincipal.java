/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import oovv.Juego;
import oovv.Jugador;
import vista.DJugada;
import vista.FPrincipal;

/**
 *
 * @author Eduardo Silvestre
 */
public class LFPrincipal implements ActionListener {

    private FPrincipal finestra;
    private Juego model;

    public LFPrincipal(FPrincipal finestra) {
        this.finestra = finestra;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Nou Joc":
                int nJugadores = 0;
                while (nJugadores < 4 || nJugadores > 8) {
                    try {
                        nJugadores = Integer.parseInt(JOptionPane.showInputDialog("Num de jugadores entre 4 y 8"));
                    } catch (HeadlessException headlessException) {
                    }
                }
                this.model = new Juego(nJugadores);
                finestra.activaNouJoc(false);
                finestra.mostraNomBanca(model.getBanca().getNom());
                finestra.mostraCarta1Banca(model.getBanca().getPrimeraCarta().getIcona());

                List<Jugador> jugadores = model.getJugadors();
                for (Jugador jugador : jugadores) {
                    DJugada dj = new DJugada(finestra, true);
                    LDJugada ldj = new LDJugada(dj, model, jugador, finestra);
                    dj.setOidor(ldj);
                    dj.setVisible(true);
                }

                break;
        }
    }

}
