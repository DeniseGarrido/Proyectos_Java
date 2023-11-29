/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class Incognites {

    private List<String> lPelis;

    public Incognites() {
        lPelis = new ArrayList<>(Arrays.asList(pelis));
    }

    public void mescla() {
        Collections.shuffle(lPelis);
    }
    
    public String getIncognita() throws EstaBuitEX{
        if (lPelis.isEmpty()) {
            throw new EstaBuitEX();
        }
        String incognita = lPelis.get(0);
        lPelis.remove(0);
        return incognita;
    }

    private String[] pelis = {
        "Thor: Love and Thunder", "Crímenes del futuro", "Macbeth", "Blonde", "Vaca", "Cerdita",
        "La isla de Bergman", "Todo a la vez en todas partes", "Red", "Ninjababy", "Elvis",
        "Un pequeño mundo", "¡NOP!", "Flee", "Un año, una noche", "La peor persona del mundo",
        "Great Freedom", "Licorice Pizza", "Belle?", "Alcarràs", "As bestias", "Drive my car",
        "Moonfall", "Ali & Ava", "Morbius", "Juno", "Capitana Marvel", "Lost in translation",
        "Colosal", "Los tres mosqueteros", "Vengadores: Endgame", "El rey león", "El protegido",
        "La favorita", "Creed", "Green book", "Caras y lugares", "Vengadores: Infinity War",
        "Casi 40", "The Florida Project", "Con amor, Simon", "Hereditary", "Amante por un día", "La cámara de Claire", "Disobedience", "Lean on Pete", "Tres anuncios en las afueras", "Tully",
        "El hilo invisible", "Misión Imposible: Fallout", "Un lugar tranquilo", "Lady Bird", "Noche de juegos", "Campeones", "El taller de escritura", "Jurassic World 2: El reino caído", "Lucky",
        "Isla de perros", "Un sol interior", "Custodia compartida", "Call me by your name",
        "Thelma", "Spider-Man: Un nuevo universo", "La forma del agua", "Black Panther", "Roma",
        "Airforce one", "A Todo Gas 7", "Amor y amistad", "Anomalisa", "Ahora sí, antes no",
        "Aniquilación", "Animales Fantásticos: Los crímenes de Grindelwald", "Bone Tomahawk",
        "Breve encuentro", "Blade Runner 2049", "Black Panther", "Carol", "Capitán América: Civil war", "Calle Cloverfield 10", "Centauros del desierto", "Carta de una desconocida",
        "Corazón gigante", "Cars 3", "Cenicienta", "Todo a la vez en todas partes", "Cleopatra",
        "C'est la vie!", "Cincuenta sombras de Grey", "Cincuenta sombras más oscuras", "Cincuenta sombras liberadas", "Deadpool", "Dos buenos tipos", "Doctor Strange", "Dos Policías Rebeldes 3",
        "Dunkerque", "E.T.", "El hijo de Saúl", "El cuento de la princesa Kaguya", "Esa sensación",
        "El hombre de las mil caras", "El porvenir", "Elle", "Expediente Warren: El caso Enfield",
        "El gran Lebowski", "El principito", "El renacido", "El porvenir", "El hilo invisible",
        "Experimenter: La historia de Stanley Milgram", "El instante más oscuro",
        "Entre ellas", "El extranjero", "El joven Karl Marx", "El mar nos mira de lejos",
        "El Libro de la Selva", "El corredor del laberinto: La cura mortal", "El gorrión rojo",
        "El pasajero", "Fast and Furious 8", "Green room", "Guardianes de la galaxia",
        "Guerra Mundial Z", "Guerra por el Planeta de los Simios", "Ghost in the Shell",
        "Gru: mi villano favorito 3", "Historia de una pasión",
        "High-Rise", "Insidious: La última llave", "Julieta", "Juno", "Kubo y las dos cuerdas mágicas",
        "Kiki, el amor se hace", "Los odiosos ocho", "La juventud", "La habitación", "La bruja",
        "La reconquista", "La fiesta de las salchichas", "La próxima piel", "La llegada",
        "La novia cadáver", "Los mundos de Caroline", "Los Boxtrolls", "La rebelión de los cuentos",
        "La doncella", "Los Minions", "La Torre Oscura", "La Bella y la Bestia", "La Liga de la Justicia",
        "Loving Vincent", "Los archivos del Pentágono", "La Momia", "Loving Pablo",
        "La muerte de Stalin", "Las heridas del viento", "Los Increíbles 2",
        "La ciudad de las estrellas", "La Bella y la Bestia", "Mustang", "Molly's Game",
        "María Magdalena", "Mazinger Z Infinity", "Maléfica",
        "Pelham 1 2 3", "Puro vicio", "Paterson", "Plan de chicas", "Petzi y la mar salada",
        "Piratas del Caribe 5: La Venganza de Salazar", "Pacific Rim: Insurrección", "Que Dios nos perdone",
        "Que baje Dios y lo vea", "Resident Evil: El Capítulo Final", "Red", "Ready Player One",
        "Spotlight", "Sólo el cielo lo sabe", "Star Trek: Más allá", "Sin amor",
        "Salvando al Reino de Oz", "Sola en casa", "Star Wars: el Despertar de la Fuerza",
        "Star Wars: Los últimos Jedi",
        "Todos queremos algo", "Tarde para la ira", "The Neon Demon", "Toro", "Tomb Raider",
        "Transformers: El Último Caballero", "Thor: Ragnarok", "Tres anuncios en las afueras",
        "The Florida Project", "Todo el dinero del mundo", "Thi Mai, rumbo a Vietnam",
        "The Belko Experiment", "Un monstruo viene a verme", "Up", "Vengadores: Infinity War",
        "Wonderstruck. El museo de las maravillas", "Wonder Woman", "Yo, Tonya", "Zootrópolis",
        "Zama", "15:17 Tren a París", "Zama", "Sin tiempo para morir", "El sustituto",
        "No mires arriba", "La Casa Gucci", "Godzilla vs Kong", "Supernova", "Cruella",
        "Cazafantasmas: Más allá", "Venom: Habrá Matanza", "Las leyes de la frontera", "Malmkrog", "Maixabel",
        "Tiempo", "El buen patrón", "Dune", "El agente topo", "Madres paralelas", "Libertad"
    };
}
