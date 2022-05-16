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
public enum SousCatJeu
{
    BAL (1, "Balles"), SOU (2, "Souris");
    
    private final int idSousCatJeu;
    private final String libelleSousCatJeu;
    private static int cpt = 3;
    private List<String> listeSousCatJeu;


    private SousCatJeu(int idSousCatJeu, String libelleSousCatJeu) 
    {
        this.idSousCatJeu = idSousCatJeu;
        this.libelleSousCatJeu = libelleSousCatJeu;
    }
    
    public String getLibelleSousCatJeu() {return  libelleSousCatJeu;}
    
    public List<String> getLesSousCatJeu()
    { 
        for(SousCatJeu cat : SousCatJeu.values())
        {
            listeSousCatJeu.add(libelleSousCatJeu);
        }
        return listeSousCatJeu;
    }
}
