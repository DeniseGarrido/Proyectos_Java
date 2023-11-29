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
public class ArticleDescPes extends ArticleDescompte {

    private double pes;

    public ArticleDescPes(String id, String concepte, Double preu, Double pes, int descompte, LocalDate fechaIni, LocalDate fechaFin) throws Maex, PositiuEx, Rango0y100Ex {
        super(id, concepte, preu, descompte, fechaIni, fechaFin);
        if (pes <= 0) {
            throw new PositiuEx("el pes és major que zero");
        }
        this.pes = pes;
    }

    @Override
    public String toString() {
        return super.toString() + "/Kg " + pes + "gr " + getPreu()+"preu kilo sense €/kg"+ getPreu() * pes / descompte + " Preu Amb €";
    }

    public double getPes() {
        return pes;
    }
    
}
