/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alix
 */
public enum Categorie
{
    ALIM(1, "Alimentation"), LIT(2, "Litières"), SOIN (3, "Soin"), JEU(4, "Jeux");
    
    private final int idCat;
    private final String libelleCat;
    private static int cpt = 4;
    private List<String> listeCat;
    public static String[] tabCategories;

    private Categorie(int idCat, String libelleCat) 
    {
        this.idCat = idCat;
        this.libelleCat = libelleCat;
    }
    
    public String getLibelleCat() {return  libelleCat;}
    
    public List<String> getLesCat()
    { 
        for(Categorie cat : Categorie.values())
        {
            listeCat.add(getLibelleCat());
        }
        tabCategories = (String[]) listeCat.toArray();
        return listeCat;
    }
    
    
}
