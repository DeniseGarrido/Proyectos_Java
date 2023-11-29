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

    private static String[] dadesArticles = {
        "11594", "pinchos de cerdo estilo andaluz / moruno", "2.99", "340", "33", "21/5/2022", "29/5/2022", "#",
        "12594", "Nectarina", "2.79", "1000", "30", "6/5/2022", "31/5/2022", "#",
        "13334", "Fideos ChowMein", "0.89", "250", "33", "6/5/2022", "9/5/2022", "#",
        "11111", "Filete de lomo de cerdo", "4.29", "600", "10", "21/5/2022", "23/5/2022", "#",
        "19995", "Medallón de merluza", "3.59", "475", "25", "6/5/2022", "9/5/2022", "#",
        "16664", "Mix de frutos secos al natural", "2.59", "200", "30", "6/5/2022", "9/5/2022", "#",
        "1", "Longaniza blanca de cerdo", "1,89", "375gr", "25", "21/5/2022", "29/5/2022", "#",
        "18484", "Picada de vacuno Frisona y cerdo Duroc", "3.39", "400", "#",
        "19499", "Hamburguesa de vacuno Frisona", "2.69", "300", "#",
        "10594", "Picada de vacuno Frisona", "3.49", "400", "10", "21/5/2022", "23/5/2022", "#",
        "15194", "Hamburguesa de vacuno Frisona y cerdo Duroc", "2.59", "300", "20", "21/5/2022", "23/5/2022", "#",
        "15924", "Jamoncitos de pollo", "3.29", "800", "#",
        "15943", "Pechuga de pollo entera", "3.99", "600", "#",
        "14594", "Contramuslo de pollo sin piel ", "2.19", "550", "#",
        "21594", "Solomillo de pollo", "3.19", "400", "#",
        "15964", "Brochetas de pollo con verduras", "2.99", "350", "22", "21/5/2022", "29/5/2022", "#",
        "15947", "Pinchos de pollo adobados", "3.19", "330", "22", "21/5/2022", "29/5/2022", "#",
        "18594", "Pinchos de cerdo", "2.99", "340", "33", "21/5/2022", "29/5/2022", "#",
        "15999", "Brochetas de pavo con verduras", "2.99", "350", "22", "21/5/2022", "29/5/2022", "#",
        "15904", "Especias para barbacoa", "1.69", "#",
        "15941", "Carbón vegetal", "5.49", "5000", "45", "26/5/2022", "6/6/2022", "#",
        "11111", "Filete de lomo de cerdo", "4.29", "600", "#",
        "7", "Alitas de pollo adobadas", "2.39", "5  00", "#",
        "21554", "Chorizo oreado de cerdo", "2.59", "430", "#",
        "15945", "Panceta de cerdo", "3.49", "560", "#",
        "16594", "Butifarra de cerdo familiar", "3.19", "700", "#",
        "15794", "Pepino Almería", "0.69", "33", "26/5/2022", "31/5/2022", "#",
        "15984", "Kiwi Gold", "3.19", "500", "33", "26/5/2022", "31/5/2022", "#",
        "15969", "Kiwi ecológico", "2.29", "500", "23", "26/5/2022", "31/5/2022", "#",
        "15094", "Zanahoria ecológica", "1.29", "500", "23", "26/5/2022", "31/5/2022", "#",
        "15914", "Dorada limpia", "4.79", "500", "#",
        "15942", "Salpicón de marisco", "3.79", "400", "20", "26/5/2022", "29/5/2022", "#",
        "13594", "Rodajas de salmón", "6.99", "450", "#",
        "15494", "filetes de lubina", "5.69", "300", "#",
        "15974", "Gamba salvaje cocida", "2.99", "250", "33", "26/5/2022", "29/5/2022", "#",
        "31946", "Gazpacho suave", "1.29", "10", "26/5/2022", "13/6/2022", "#",
        "17594", "Salmorejo", "1.59", "#",
        "15894", "Gazpacho tradicional", "1.29", "#",
        "11111", "Gazpacho tradicional Pack 3", "1.99", "#",
        "15940", "Virutas serranas gran reserva", "2.79", "80", "20", "26/5/2022", "29/5/2022", "#",
        "15555", "Pan para bocadillo integral", "0.29", "125", "#",
        "11114", "Gazpacho con sandía", "1.29", "#",
        "15444", "Gazpacho ecológico", "1.99", "#",
        "41555", "Gazpacho fresco", "2.39", "#",
        "55194", "Salmorejo fresco", "2.69", "#",
        "15954", "Mollete Pack 4", "0.99", "340", "25", "26/5/2022", "29/5/2022", "#",
        "15946", "Donuts bombón / glacé", "1.59", "37", "26/5/2022", "29/5/2022", "#",
        "31694", "Salmón ahumado", "3.49", "100", "#",
        "15694", "Vinagre de arroz", "2.39", "#",
        "31596", "Salsa de soja", "1.29", "#",
        "94594", "Wasabi", "3.19", "33", "26/5/2022", "29/5/2022", "#",
        "91694", "Especias asiáticas", "0.79", "#",
        "91564", "Semillas de sésamo peladas", "0.59", "50", "#",
        "91596", "Palillos de bambú", "0.79", "#",
        "97594", "Curry en polvo", "1.99", "#",
        "91794", "Arroz para sushi", "1.39", "500", "25", "26/5/2022", "29/5/2022", "#",
        "91574", "Salsa chili dulce", "1.49", "#",
        "11597", "Aguacate", "4.29", "1000", "#",
        "31597", "Fideos de cristal", "0.69", "100", "#",
        "31894", "Fideos instantáneos al estilo asiático", "1.49", "#",
        "31584", "Salsa con chili", "1.19", "#",
        "31598", "Salsa Teriyaki", "1.49", "#",
        "31774", "Curry", "1.49", "#",
        "31994", "Platos asiáticos preparados", "0.99", "#",
        "15994", "Fideos Wok de huevo", "0.99", "250", "#",
        "31599", "Fideos de arroz", "0.99", "200", "#",
        "31059", "Fideos soba", "1.99", "300", "#",
        "2", "Gouda especiado", "2.79", "250", "10", "xx/5/2022", "29/5/2022", "#",
        "91590", "Samosas", "1.99", "#",
        "91194", "Tortilla chip asiáticas", "0.99", "#",
        "91514", "Barrita de sésamo", "0.89", "#",
        "91591", "Cerveza Kirin Ichiban", "1.49", "25", "26/5/2022", "29/5/2022", "#",
        "21794", "Cerveza Chang", "0.99", "#",
        "91294", "Helado de pitahaya de dragón", "1.99", "#",
        "91524", "Lassi yogur bebible", "0.89", "#",
        "91592", "Tarrina de helado asiático", "2.49", "#",
        "31594", "Mango en rodajas", "1.49", "20", "26/5/2022", "29/5/2022", "#",
        "81394", "Lirio asiático", "3.99", "#",
        "81534", "Lucky bamboo", "1.29", "#",
        "81593", "Ficus Microcarpa", "7.99", "#",
        "14597", "Vino blanco Libertario", "1.19", "31", "26/5/2022", "29/5/2022", "#",
        "6", "Vino rosado Mezquiriz", "1.79", "-28", "26/5/2022", "29/5/2022", "#",
        "14544", "Vino tino Oristan", "3.99", "37", "26/5/2022", "29/5/2022", "#",
        "15944", "Patatas fritas", "2.09", "750", "#",
        "51594", "Nocilla galletas", "1.99", "#",
        "44194", "Nesquik Cacao instantáneo", "12.99", "2850", "#",
        "21555", "Frutos secos con pasas / fruta deshidratada", "1.69", "200", "#",
        "21595", "Galletas Capitán Rondo", "0.99", "500", "21", "12/5/2022", "29/5/2022", "#",
        "61594", "Cápsulas de café Orígenes", "1.99", "#",
        "16954", "Gaseosa", "0.59", "#",
        "15654", "Pringles", "1.29", "#",
        "15956", "Espaguetis", "1.79", "675", "#",
        "81594", "Autobronceador en crema", "1.99", "25", "26/5/2022", "29/5/2022", "#",
        "81574", "Leche autobronceadora", "3.49", "22", "26/5/2022", "29/5/2022", "#",
        "81575", "Aceite solar en spray", "4.99", "#",
        "81507", "Loción after sun", "7.99", "22", "26/5/2022", "29/5/2022", "#",
        "81504", "Protector solar para niños", "12.99", "22", "26/5/2022", "29/5/2022", "#",
        "81894", "Spray sol Protege & Hidrata", "12.99", "22", "26/5/2022", "29/5/2022", "#",
        "81584", "Lavanda", "3.99", "#",
        "81598", "Cathranthus", "1.99", "#",
        "81595", "Planta verde", "2.49", "#",
        "81994", "Mini Kalanchoe", "0.99", "#",
        "80599", "Dipladenia", "5.99", "#",
        "80594", "Yucca", "8.99", "#",
        "0", "", "8.99", "#",
        "15594", "Espárrago verde", "1.99", "250", "35", "28/5/2022", "31/5/2022", "#",
        "15554", "Arándano", "4.99", "500", "40", "28/5/2022", "31/5/2022", "#",
        "55554", "Tomate pera", "1.79", "1000", "33", "28/5/2022", "31/5/2022", "#",
        "55550", "Croissant de chocolate", "0.49", "35", "28/5/2022", "29/5/2022", "#",
        "32154", "Pan de la abuela", "0.89", "400", "33", "28/5/2022", "29/5/2022", "#",
        "3", "Langostino cocido", "-4.59", "500", "21", "28/5/2022", "29/5/2022", "#",
        "5", "Longaniza de payés extra", "1.79", "150", "244", "26/5/2022", "29/5/2022", "#",
        "15324", "Tortilla fresca", "2.29", "19", "28/5/2022", "29/5/2022", "#",
        "15664", "Pizza de atún y bacón", "2.29", "26", "12/5/2022", "29/5/2022", "#",
        "15884", "Vino blanco La Bien Pinta", "3.99", "37", "28/5/2022", "29/5/2022", "#",
        "15004", "Vino blanco Blume", "4.99", "34", "28/5/2022", "29/5/2022", "#",
        "10094", "Pepinillos agridulces", "1.29", "20", "28/5/2022", "29/5/2022", "#",
        "15900", "Cerveza negra Argus", "0.49", "25", "28/5/2022", "29/5/2022", "#",
        "15961", "Naranja malla 2kg", "2.29", "2000", "36", "30/5/2022", "1/6/2022", "#",
        "15814", "Plátano de canarias", "2.99", "1000", "33", "30/5/2022", "1/6/2022", "#",
        "17194", "Berenjena", "1.89", "1000", "#",
        "59094", "Mini rústico", "0.09", "45", "#",
        "11111", "Barra de pan Pack 3", "1.29", "20", "30/5/2022", "1/6/2022", "#",
        "21194", "Burguer de pavo y pollo con espinacas", "3.99", "27", "30/5/2022", "1/6/2022", "#",
        "59140", "Burguer de pollo con zanahoria", "3.99", "27", "30/5/2022", "1/6/2022", "#",
        "59241", "Burguer de merluza y camarones", "1.99", "#",
        "15144", "Burguer de salmón i merluza", "1.99", "#",
        "4", "Aceitunas hojiblanca con mojo picón", "1.89", "-350", "#",
        "10994", "Aceituna negra con hueso", "0.89", "350", "#",
        "41544", "Aceituna negra sin hueso", "0.99", "350", "31", "6/5/2022", "9/5/2022", "#",
        "15449", "Aceituna gazpachada con hueso", "2.29", "950", "#",
        "15443", "Cóctel de aceitunas", "1.79", "720", "20", "6/5/2022", "9/5/2022", "#",
        "41394", "Aceitunas verdes partidas", "0.99", "350", "#",
        "15395", "Aceitunas verdes rellenas de anchoa", "0.89", "350", "20", "3/5/2022", "3/6/2022", "#",
        "15948", "Aceitunas verdes rellenas de pimiento asado", "0.99", "350", "#",
        "", "Aceitunas verdes rellenas de anchoa Pack 3", "1.99", "22", "30/5/2022", "8/6/2022", "#"
    };

    private static void creaBotiga(Botiga botiga) {
        String nom = dadesBotigues[0];
        botiga.setNom(nom);

        String adreça = dadesBotigues[1] + dadesBotigues[2] + dadesBotigues[3];
        botiga.setAdreça(adreça);
    }

    private static void creaArticles(Botiga botiga) {
        for (int i = 0; i < dadesArticles.length;) {
            int index = 0;
            for (int j = i; !dadesArticles[j].equals("#"); j++) {
                index = j - i;
            }

            if (index == 6) {
                try {
                    String[] data1 = dadesArticles[i + 5].split("/");
                    String[] data2 = dadesArticles[i + 6].split("/");
                    String id = dadesArticles[i];
                    String concepte = dadesArticles[i + 1];
                    double preu = Double.parseDouble(dadesArticles[i + 2]);
                    double peso = Double.parseDouble(dadesArticles[i + 3]);
                    int desc = Integer.parseInt(dadesArticles[i + 4]);
                    LocalDate ini = LocalDate.of(Integer.parseInt(data1[2]), Integer.parseInt(data1[1]), Integer.parseInt(data1[0]));
                    LocalDate fin = LocalDate.of(Integer.parseInt(data2[2]), Integer.parseInt(data2[1]), Integer.parseInt(data2[0]));
                    ArticleDescPes adp = new ArticleDescPes(id, concepte, preu, peso, desc, ini, fin);
                    botiga.afegeixArticle(adp);
                } catch (RepetitEX | NumberFormatException | Maex | Rango0y100Ex | PositiuEx ex) {
                    System.out.println(dadesArticles[i] + "__" + ex.getMessage());
                }
            }
            if (index == 5) {
                try {
                    String[] data1 = dadesArticles[i + 4].split("/");
                    String[] data2 = dadesArticles[i + 5].split("/");
                    String id = dadesArticles[i];
                    String concepte = dadesArticles[i + 1];
                    double preu = Double.parseDouble(dadesArticles[i + 2]);
                    int desc = Integer.parseInt(dadesArticles[i + 3]);
                    LocalDate ini = LocalDate.of(Integer.parseInt(data1[2]), Integer.parseInt(data1[1]), Integer.parseInt(data1[0]));
                    LocalDate fin = LocalDate.of(Integer.parseInt(data2[2]), Integer.parseInt(data2[1]), Integer.parseInt(data2[0]));
                    ArticleDescompte ad = new ArticleDescompte(id, concepte, preu, desc, ini, fin);
                    botiga.afegeixArticle(ad);
                } catch (RepetitEX | NumberFormatException | Maex | Rango0y100Ex | PositiuEx ex) {
                    System.out.println(dadesArticles[i] + "__" + ex.getMessage());
                }
            }

            if (index == 3) {
                try {
                    String id = dadesArticles[i];
                    String concepte = dadesArticles[i + 1];
                    double preu = Double.parseDouble(dadesArticles[i + 2]);
                    double peso = Double.parseDouble(dadesArticles[i + 3]);
                    ArticlePes ap = new ArticlePes(id, concepte, peso, preu);
                    botiga.afegeixArticle(ap);

                } catch (RepetitEX | NumberFormatException | Maex | PositiuEx ex) {
                    System.out.println(dadesArticles[i] + "__" + ex.getMessage());
                }
            }

            if (index == 2) {
                try {
                    String id = dadesArticles[i];
                    String concepte = dadesArticles[i + 1];
                    double preu = Double.parseDouble(dadesArticles[i + 2]);
                    Article a = new Article(id, concepte, preu);
                    botiga.afegeixArticle(a);
                } catch (RepetitEX | NumberFormatException | Maex | PositiuEx ex) {
                    System.out.println(dadesArticles[i] + "__" + ex.getMessage());
                }
            }
            i += index + 1;
        }
    }
}
