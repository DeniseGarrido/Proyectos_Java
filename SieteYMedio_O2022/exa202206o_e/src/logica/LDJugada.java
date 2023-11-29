/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import baralla.Carta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import oovv.Banca;
import oovv.Juego;
import oovv.Jugador;
import vista.DJugada;
import vista.FPrincipal;

/**
 *
 * @author Eduardo Silvestre
 */
public class LDJugada implements ActionListener {

    private DJugada finestra;
    private Juego model;
    private Jugador jugador;
    private FPrincipal f1;

    public LDJugada(DJugada finestra, Juego model, Jugador jugador, FPrincipal f1) {
        this.finestra = finestra;
        this.model = model;
        this.jugador = jugador;
        this.f1 = f1;

        if (!(jugador instanceof Banca)) {
            Carta carta = model.getCarta();
            this.jugador.añadeCarta(carta);
            finestra.afegeixCarta(carta);
            
            finestra.mostraInfoJugador(this.jugador.getNom(), this.jugador.getDiners());
        } else {
            finestra.mostraInfoBanca(model.getBanca());
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Puja l'aposta":
                int aposta = this.jugador.getAposta();
                aposta = jugador.pujaAposta();
                if (aposta == 25) {
                    finestra.desactivaAposta();
                }
                finestra.mostraAposta(aposta + "");
                break;

            case "Vol Carta":
                Carta carta = model.getCarta();
                jugador.añadeCarta(carta);
                finestra.afegeixCarta(carta);
                double valor = this.jugador.getSumaCartas();
                if (valor > 7.5) {
                    JOptionPane.showMessageDialog(finestra, "Te has pasado");
                    finestra.dispose();
                }

                break;
            case "Passa":
                finestra.dispose();
                if (jugador instanceof Banca) {
                    finestra.dispose();
                    f1.mostra(model.mostraLlista());
                }
                break;

            default:
                throw new AssertionError();
        }
    }

}
