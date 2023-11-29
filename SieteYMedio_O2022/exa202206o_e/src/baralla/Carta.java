/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baralla;

import javax.swing.ImageIcon;

/**
 *
 * @author Eduardo Silvestre
 */
public class Carta {

    private String pal;
    private String valor;
    private ImageIcon icona;

    /**
     * constructor de Carta. no es fa cap tipus de control dels paràmetres, ja
     * que el constructor sols es crida des del mètode creaLesCartes de Baralla
     * que defineix els valors correctes per a les cartes
     *
     * @param pal pal de la carta
     * @param valor valor de la carta
     * @param icona imatge de la carta
     */
    public Carta(String pal, String valor, ImageIcon icona) {
        this.pal = pal;
        this.valor = valor;
        this.icona = icona;
    }

    /**
     * torna els punts de la carta. les cartes valen el seu valor o mig si és
     * una figura. el valor de l'as és 1
     *
     * @return double els punts de la carta
     */
    public double getPunts() {
        try {
            return Integer.parseInt(valor);
        } catch (NumberFormatException ex) {
            if (valor.equals("as")) {
                return 1;
            }
        }
        return 0.5;
    }

    /**
     * @return String el pal de la carta
     */
    public String getPal() {
        return pal;
    }

    /**
     * @return String el valor de la carta
     */
    public String getValor() {
        return valor;
    }

    /**
     * @return ImageIcon la imatge de la carta
     */
    public ImageIcon getIcona() {
        return icona;
    }

    @Override
    public String toString() {
        return valor + " de " + pal;
    }

}
