/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjat.p11;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author Administrador
 */
public class Penjat {

    private final int MAX_FALLADES = 11; // nombre de fallades màximes
    private final String NOM_IMG = "penjat11.jpg"; // nom del fitxer, ha d’estar en el mateix paquet que Penjat.java
    private final int AMPLE = 500; // amplada d’una imatge
    private final int ALT = 568; // alçada d’una imatge
    private final BufferedImage img; // referència per a la imatge completa
    
    private int numFallades; // nombre de fallades del jugador

    public Penjat() { // crea la imatge completa
        ImageIcon ima = (new ImageIcon(getClass().getResource(NOM_IMG)));
        img = new BufferedImage(ima.getIconWidth(), ima.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics g = img.createGraphics();
        g.drawImage(ima.getImage(), 0, 0, null);
    }

    public ImageIcon getIcon() { // retalla un tros de la imatge completa
        BufferedImage tros = new BufferedImage(AMPLE, ALT, BufferedImage.TYPE_INT_ARGB);
        tros.createGraphics().drawImage(img.getSubimage(AMPLE * numFallades, 0, AMPLE, ALT), 0, 0, null);
        return new ImageIcon(tros);
    }
    
    public void incrementaFallades(){
        numFallades++;
    }
    
    public boolean estaMort(){
        return numFallades == MAX_FALLADES;
    }
}
