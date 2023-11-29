/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import Excepciones.Maex;
import Excepciones.PositiuEx;
import Excepciones.RepetitEX;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 *
 * @author DeniseGT
 */
public class Botiga {

    private String nom;
    private String adreça;
    private List<Article> articles;

    public Botiga() {
        this.nom = nom;
        this.adreça = adreça;
        this.articles = new ArrayList();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdreça() {
        return adreça;
    }

    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }

    public void afegeixArticle(Article article) throws RepetitEX {
        if (articles.contains(article)) {
            throw new RepetitEX("ja esta en la lista");
        }
        articles.add(article);
    }

    public String llistaArticles() {
        String cad = """
                   Llista Articles
                   ----------------------------
                   """;
        for (Article article : articles) {
            cad += article;
        }
        return cad;
    }

    public String getArtSenseDesc() {
        String cad = "";
        for (Article article : articles) {
            if (!(article instanceof ArticleDescompte || article instanceof ArticleDescPes)) {
                cad += article;
            }
        }
        return cad;
    }

    public void asignaDescuento(String[] id, int descuento, LocalDate ini, LocalDate fin) {
        for (Article article : articles) {
            for (int i = 0; i < id.length; i++) {
                if (article.getId().equals((id[i]))) {
                    article.setPreu(article.getPreu() * descuento / 100);
                }
            }
        }
    }

    public void eliminarDescuento(LocalDate fecha) throws Maex, PositiuEx {
        for (int i = 0; i < articles.size(); i++) {
            Article article = articles.get(i);
            if (article instanceof ArticleDescompte && fecha.isAfter(((ArticleDescompte) article).getFechaIni())) {
                Article newArticle = new Article(article.getId(), article.getConcepte(), article.getPreu());
                articles.set(i, newArticle);
            }
        }
    }
}
