/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import Excepciones.Maex;
import Excepciones.PositiuEx;
import java.util.Objects;

/**
 *
 * @author DeniseGT
 */
public class Article {

    private String id;
    private String concepte;
    double preu;

    public Article(String id, String concepte, double preu) throws Maex, PositiuEx {
        if (id.isBlank() || concepte.isBlank()) {
            throw new Maex("falta l'identificador o el concepte");
        }
        this.id = id;
        this.concepte = concepte;
        if (preu < 0) {
            throw new PositiuEx("el preu és zero o positiu");
        }
        this.preu = preu;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Article)) {
            return false;
        }
        final Article other = (Article) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return id + " __ " + concepte +  " __ " + preu + "€"+"\n";
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConcepte() {
        return concepte;
    }

    public void setConcepte(String concepte) {
        this.concepte = concepte;
    }
    

}
