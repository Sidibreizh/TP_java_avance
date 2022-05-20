/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alix
 */
public class Produit
{
    private int idProduit;
    private String libelleProduit;
    private String descriptionProduit;
    private double prixProduit;
    private int soldeProduit;
    private boolean nouveauProduit = true;
    private String imageProduit;
    private static int cpt;
    private static List<Produit> listeDesProduits;
    
    public Produit(String libelleProduit, String descriptionProduit, double prixProduit, String imageProduit)
    {
        this.idProduit = ++cpt;
        this.libelleProduit = libelleProduit;
        this.descriptionProduit = descriptionProduit;
        this.prixProduit = prixProduit;
        this.imageProduit = imageProduit;
        listeDesProduits.add(this);
    }
    
    public Produit(String libelleProduit, String descriptionProduit, double prixProduit, int soldeProduit,
           String imageProduit)
    {
        this(libelleProduit, descriptionProduit, prixProduit, imageProduit);
        this.soldeProduit = soldeProduit;
    }
    
    public int getIdProduit(){return idProduit;}
    public String getDescriptionProduit(){return descriptionProduit;}
    public String getLibelleProduit() {return  libelleProduit;}
    public double getPrixProduit() {return prixProduit;}
    public int getSoldeProduit() {return soldeProduit;}
    public boolean getNouveauProduit() {return nouveauProduit;}
    public String getImageProduit() {return  imageProduit;}
    public static List<Produit> getListeDesProduits() {return listeDesProduits;}
    
    public void setNouveauProduit(boolean nouveauProduit) { this.nouveauProduit = nouveauProduit;}
    
    
}
