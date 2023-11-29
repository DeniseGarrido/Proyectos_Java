/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import Excepciones.Maex;
import Excepciones.PositiuEx;
import Excepciones.Rango0y100Ex;
import java.time.LocalDate;

/**
 *
 * @author DeniseGT
 */
public class ArticleDescompte extends Article {

    int descompte;
    private LocalDate fechaIni;
    private LocalDate fechaFin;

    public ArticleDescompte(String id, String concepte, Double preu, int descompte, LocalDate fechaIni, LocalDate fechaFin) throws Maex, PositiuEx, Rango0y100Ex {
        super(id, concepte, preu);
        if (descompte<0 || descompte>100) {
            throw new Rango0y100Ex("el descompte està entre 0 i 100");
        }
        this.descompte = descompte;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return super.toString() + getPreu()*descompte/100 + "€" ;
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }
    
}
