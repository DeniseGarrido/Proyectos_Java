/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import baralla.Baralla;
import baralla.Carta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DeniseGT
 */
public class Juego {

    private List<Jugador> jugadors;
    private Baralla baralla;

    public Juego(int nJugadors) {
        baralla = new Baralla("8", "9");
        jugadors = new ArrayList<>();

        for (int i = 0; i < nJugadors; i++) {
            if (i != nJugadors - 1) {
                Jugador j = new Jugador(Noms.getNomComplet());
                if (!jugadors.contains(j)) {
                    jugadors.add(j);
                }
            } else {
                jugadors.add(new Banca(Noms.getNomComplet(), baralla.trauCarta()));
            }
        }
    } 

    public List<Jugador> getJugadors() {
        return jugadors;
    }

    public Banca getBanca() {
        Jugador j = null;
        for (Jugador jugador : jugadors) {
            if (jugador instanceof Banca) {
                j = jugador;
            }
        }
        return (Banca) j;
    }

    public Carta getCarta() {
        return this.baralla.trauCarta();
    }

    public String mostraLlista() {
        String cad = "";
        for (Jugador jugador : jugadors) {
            cad+= "hola";
        }
        return cad;
    }
}
