/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import Excepciones.Maex;
import Excepciones.PositiuEx;
import Excepciones.Rango0y100Ex;
import Excepciones.RepetitEX;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Silvestre
 */
public class Dades {

    public static Botiga creaBotiga() {
        Botiga botiga = new Botiga();
        creaBotiga(botiga);
        creaArticles(botiga);
        return botiga;
    }

    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");

    private static String[] dadesBotigues = {"Ultramarinos LaMari", "C/ Russafa", "34", "València"};

    private static String[] dades = {
        "11594 / pinchos de cerdo estilo andaluz/moruno / 2.99 /  340 / 34 / 21/5/2022 / 29/5/2022 / #",
        "12594 / Nectarina / 2.79 / 1000 / 30 / 6/5/2022 / 31/5/2022 / #",
        "13334 / Fideos ChowMein / 0.89 / 250 / 33 / 6/5/2022 / 9/5/2022 / #",
        "31946 / Gazpacho suave / 1.29 / 10 / 26/5/2022 / 13/6/2022 / #"};

    private static void creaBotiga(Botiga botiga) {
        String nom = dadesBotigues[0];
        botiga.setNom(nom);

        String adreça = dadesBotigues[1] + dadesBotigues[2] + dadesBotigues[3];
        botiga.setAdreça(adreça);
    }

    private static void creaArticles(Botiga botiga) {

        int index = 0;

        for (String dadesBotigue : dades) {
            String[] dadess = dadesBotigue.split(" / ");

            for (int i = 0; i < dadess.length;) {
                for (int j = i; !dadess[j].equals("#"); j++) {
                    index = j - i;
                }

                if (index == 6) {
                    try {
                        String[] data1 = dadess[i + 5].split("/");
                        String[] data2 = dadess[i + 6].split("/");
                        String id = dadess[i];
                        String concepte = dadess[i + 1];
                        double preu = Double.parseDouble(dadess[i + 2]);
                        double peso = Double.parseDouble(dadess[i + 3]);
                        int desc = Integer.parseInt(dadess[i + 4]);
                        LocalDate ini = LocalDate.of(Integer.parseInt(data1[2]), Integer.parseInt(data1[1]), Integer.parseInt(data1[0]));
                        LocalDate fin = LocalDate.of(Integer.parseInt(data2[2]), Integer.parseInt(data2[1]), Integer.parseInt(data2[0]));
                        ArticleDescPes adp = new ArticleDescPes(id, concepte, preu, peso, desc, ini, fin);
                        botiga.afegeixArticle(adp);
                    } catch (RepetitEX | NumberFormatException | Maex | Rango0y100Ex | PositiuEx ex) {
                        System.out.println(dadess[i] + "__" + ex.getMessage());
                    }
                }
                if (index == 5) {
                    try {
                        String[] data1 = dadess[i + 4].split("/");
                        String[] data2 = dadess[i + 5].split("/");
                        String id = dadess[i];
                        String concepte = dadess[i + 1];
                        double preu = Double.parseDouble(dadess[i + 2]);
                        int desc = Integer.parseInt(dadess[i + 3]);
                        LocalDate ini = LocalDate.of(Integer.parseInt(data1[2]), Integer.parseInt(data1[1]), Integer.parseInt(data1[0]));
                        LocalDate fin = LocalDate.of(Integer.parseInt(data2[2]), Integer.parseInt(data2[1]), Integer.parseInt(data2[0]));
                        ArticleDescompte ad = new ArticleDescompte(id, concepte, preu, desc, ini, fin);
                        botiga.afegeixArticle(ad);
                    } catch (RepetitEX | NumberFormatException | Maex | Rango0y100Ex | PositiuEx ex) {
                        System.out.println(dadess[i] + "__" + ex.getMessage());
                    }
                }

                if (index == 3) {
                    try {
                        String id = dadess[i];
                        String concepte = dadess[i + 1];
                        double preu = Double.parseDouble(dadess[i + 2]);
                        double peso = Double.parseDouble(dadess[i + 3]);
                        ArticlePes ap = new ArticlePes(id, concepte, peso, preu);
                        botiga.afegeixArticle(ap);

                    } catch (RepetitEX | NumberFormatException | Maex | PositiuEx ex) {
                        System.out.println(dadess[i] + "__" + ex.getMessage());
                    }
                }

                if (index == 2) {
                    try {
                        String id = dadess[i];
                        String concepte = dadess[i + 1];
                        double preu = Double.parseDouble(dadess[i + 2]);
                        Article a = new Article(id, concepte, preu);
                        botiga.afegeixArticle(a);
                    } catch (RepetitEX | NumberFormatException | Maex | PositiuEx ex) {
                        System.out.println(dadess[i] + "__" + ex.getMessage());
                    }
                }
                index++;
                i += index + 1;
            }
        }
    }
}

