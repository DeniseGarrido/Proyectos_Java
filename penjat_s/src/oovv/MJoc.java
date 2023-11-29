/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import java.text.Collator;
import javax.swing.ImageIcon;
import penjat.aho.Penjat;

/**
 *
 * @author Administrador
 */
public class MJoc {

    private String peli;
    private String guions;
    private Penjat penjat;
    private Incognites incog = new Incognites();

    public MJoc() {
        try {
            incog.mescla();
            peli = incog.getIncognita();
            creaGuions();
            penjat = new Penjat();
        } catch (EstaBuitEX ex) {
            System.exit(0);
        }
    }

    private void creaGuions() {
        guions = "";
        for (int i = 0; i < peli.length(); i++) {
            if (Character.isLetter(peli.charAt(i))) {
                guions += "-";
            } else {
                guions += peli.charAt(i);
            }
        }
    }

    public String getGuions() {
        return guions;
    }

    public String getPeli() {
        return peli;
    }

    public ImageIcon getIconPenjat() {
        return penjat.getIcon();
    }

    public void busca(String lletra) {
        Collator micolator = Collator.getInstance();
        micolator.setStrength(Collator.PRIMARY);
        boolean estaEnPeli = false;
        String nouGuions = "";
        for (int i = 0; i < peli.length(); i++) {
            if (micolator.equals(lletra, peli.substring(i, i + 1)))  {
                nouGuions += peli.charAt(i);
                estaEnPeli = true;
            } else {
                nouGuions += guions.charAt(i);
            }
        }
        if (!estaEnPeli) {
            penjat.incrementaFallades();
        }
        guions = nouGuions;
    }

    public boolean haGuanyat() {
        return guions.equals(peli);
    }

    public boolean estasMort() {
        return penjat.estaMort();
    }

}
