/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import Excepciones.Maex;
import Excepciones.PositiuEx;

/**
 *
 * @author DeniseGT
 */
public class ArticlePes extends Article {

    private double pes;

    public ArticlePes(String id, String concepte, double pes, double preu) throws Maex, PositiuEx {
        super(id, concepte, preu);
        if (pes <= 0) {
            throw new PositiuEx("el pes és major que zero");
        }
        this.pes = pes;
    }
    @Override
    public String toString() {
        return super.toString() + "€/KG" + pes +"\tgr" + getPreu()*pes + "€/Kg_preu"+"\n"; 
    }

    public double getPes() {
        return pes;
    }
    
}
