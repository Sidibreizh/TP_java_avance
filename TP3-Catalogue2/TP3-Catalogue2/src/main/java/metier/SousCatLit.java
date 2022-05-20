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
public enum SousCatLit
{
    AGGLO (1, "Agglomérante"), NORM (2, "Normale");
    
    private final int idSousCatLit;
    private final String libelleSousCatLit;
    private static int cpt = 2;
    private List<String> listeSousCatAlim;


    private SousCatLit(int idSousCatLit, String libelleSousCatLit) 
    {
        this.idSousCatLit = idSousCatLit;
        this.libelleSousCatLit = libelleSousCatLit;
    }
    
    public String getLibelleSousCatLit() {return  libelleSousCatLit;}
    
    public List<String> getLesSousCatLit()
    { 
        for(SousCatLit cat : SousCatLit.values())
        {
            listeSousCatAlim.add(libelleSousCatLit);
        }
        return listeSousCatAlim;
    }
}
