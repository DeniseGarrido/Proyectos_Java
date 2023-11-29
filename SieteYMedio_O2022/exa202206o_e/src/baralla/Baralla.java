/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baralla;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;

/**
 *
 * @author Eduardo Silvestre
 */
public class Baralla {

    private LinkedList<Carta> baralla; // les cartes de la baralla

    /**
     * constructor. crea una baralla amb les 48 cartes del mapa i les mescla
     */
    public Baralla() {
        if (cartes == null) {
            creaLesCartes();
        }
        baralla = new LinkedList<>(cartes.values());
        Collections.shuffle(baralla);
    }

    /**
     * constructor. crea una baralla amb les 48 cartes del mapa i les mescla
     * després elimina els valors no desijats
     *
     * @param valors són els valors a eliminar de la baralla
     */
    public Baralla(String... valors) {
        this();
        List<String> valorsAeliminar = Arrays.asList(valors);
        for (Iterator<Carta> iterator = baralla.iterator(); iterator.hasNext();) {
            Carta carta = iterator.next();
            if (valorsAeliminar.contains(carta.getValor())) {
                iterator.remove();
            }
        }
    }

    /**
     * @return ImageIcon la imatge del dorso de les cartes
     */
    public ImageIcon getDorso() {
        return retallaUnaCarta(4, 1);
    }

    /**
     * torna la primera carta de la baralla. aquesta carta s'elimina de la
     * baralla
     *
     * @return Carta la primera carta de la barralla<br><code>null</code> si no
     * queden cartes en la baralla
     */
    public Carta trauCarta() {
        return baralla.pollFirst();
    }

    private static final int AMPLE = 80; //ample d’una carta
    private static final int ALÇADA = 122; // alçada d’una carta
    private static final ImageIcon imatgeCompleta = new javax.swing.ImageIcon(Baralla.class.getResource("baraja2.jpg"));
    private static Map<String, Carta> cartes; // mapa amb les cartes

    /**
     * Crea el mapa de cartes. les matrius pals i valors proporcionen les dades
     * per a la clau del mapa i la carta, els índexs indexP i indexV corresponen
     * a la fila i la columna de la carta a retallar dins de la imatge completa
     */
    private static void creaLesCartes() {
        cartes = new HashMap<>();
        String[] pals = {"oros", "copes", "espases", "bastos"};
        String[] valors = {"as", "2", "3", "4", "5", "6", "7", "8", "9", "sota", "cavall", "rei"};
        for (int indexP = 0; indexP < pals.length; indexP++) {
            for (int indexV = 0; indexV < valors.length; indexV++) {
                Carta carta = new Carta(pals[indexP], valors[indexV], retallaUnaCarta(indexP, indexV));
                cartes.put(pals[indexP] + valors[indexV], carta);
            }
        }
    }

    /**
     * retalla una carta. les cartes en la imatge completa estan distribuides en
     * files i columnes que corresponen al pal i el valor respectivament
     *
     * @param fila de la carta (pal)
     * @param columna de la carta (valor)
     * @return ImageIcon amb la imatge de la carta
     */
    private static ImageIcon retallaUnaCarta(int fila, int columna) {
        Image img = imatgeCompleta.getImage();
        BufferedImage bimg = new BufferedImage(imatgeCompleta.getIconWidth(),
                imatgeCompleta.getIconHeight(),
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D bGr = bimg.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        return new ImageIcon(bimg.getSubimage(columna * AMPLE, fila * ALÇADA, AMPLE, ALÇADA));
    }

}
