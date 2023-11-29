/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import baralla.Carta;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author DeniseGT
 */
public class Banca extends Jugador {

    public Banca(String nom, Carta carta) {
        super(nom);
        setPrimeraCarta(carta);
    }

    public void setPrimeraCarta(Carta carta) {
        cartes.add(carta);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Carta getPrimeraCarta() {
        return cartes.get(0);
    }
}
