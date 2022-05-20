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
public enum SousCatSoin
{
    GRIF (1, "Soin des griffes"), ORE (2, "Soin des oreilles"), YE (3, "Soin des yeux");
    
    private final int idSousCatSoin;
    private final String libelleSousCatSoin;
    private static int cpt = 3;
    private List<String> listeSousCatSoin;


    private SousCatSoin(int idSousCatSoin, String libelleSousCatSoin) 
    {
        this.idSousCatSoin = idSousCatSoin;
        this.libelleSousCatSoin = libelleSousCatSoin;
    }
    
    public String getLibelleSousCatSoin() {return  libelleSousCatSoin;}
    
    public List<String> getLesSousCatSoin()
    { 
        for(SousCatSoin cat : SousCatSoin.values())
        {
            listeSousCatSoin.add(libelleSousCatSoin);
        }
        return listeSousCatSoin;
    }
}
