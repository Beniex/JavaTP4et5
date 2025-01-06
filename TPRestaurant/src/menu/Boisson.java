/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

/**
 *
 * @author bexbrayat
 */
public class Boisson {

    public String getNom_boisson() {
        return nom_boisson;
    }

    public void setNom_boisson(String nom_boisson) {
        this.nom_boisson = nom_boisson;
    }
    
    protected String nom_boisson="nom de boisson par défaut"; 
    
    public Boisson(){        
    }
    
    public Boisson(String nom){
        nom_boisson=nom; 
    }
    
    public String toString(){
        return("boisson: " + nom_boisson); 
    }
}
