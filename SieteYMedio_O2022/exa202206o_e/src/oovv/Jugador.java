/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import baralla.Carta;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author DeniseGT
 */
public class Jugador {

    protected String nom;
    protected int diners;
    protected int aposta;
    protected List<Carta> cartes;

    public Jugador(String nom) {
        this.nom = Noms.getNomComplet();
        this.diners = 50;
        this.aposta = 5;
        this.cartes = new ArrayList();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.nom);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        return Objects.equals(this.nom, other.nom);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDiners() {
        return diners + "";
    }

    public void setDiners(int diners) {
        this.diners = diners;
    }

    public int getAposta() {
        return aposta;
    }

    public void setAposta(int aposta) {
        this.aposta = aposta;
    }

    public List<Carta> getCartes() {
        return cartes;
    }

    public void setCartes(List<Carta> cartes) {
        this.cartes = cartes;
    }

    public void añadeCarta(Carta carta) {
        this.cartes.add(carta);
    }

    public int pujaAposta() {
        return this.aposta += 5;
    }

    public double getSumaCartas() {
        double suma = 0.0;
        for (Carta carta : cartes) {
            suma += carta.getPunts();
        }
        return suma;
    }
}
