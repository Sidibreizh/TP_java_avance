/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metier;

import java.util.List;

/**
 *
 * @author Alix
 */
public enum SousCatAlim
{
    SEC (1, "Croquettes"), HUM (2, "Pâtée");
    
    private final int idSousCatAlim;
    private final String libelleSousCatAlim;
    private static int cpt = 2;
    private List<String> listeSousCatAlim;


    private SousCatAlim(int idSousCatAlim, String libelleSousCatAlim) 
    {
        this.idSousCatAlim = idSousCatAlim;
        this.libelleSousCatAlim = libelleSousCatAlim;
    }
    
    public String getLibelleSousCatAlim() {return  libelleSousCatAlim;}
    
    public List<String> getLesSousCatAlim()
    { 
        for(Categorie cat : Categorie.values())
        {
            listeSousCatAlim.add(libelleSousCatAlim);
        }
        return listeSousCatAlim;
    }
}
