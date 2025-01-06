/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etablissement;

/**
 *
 * @author bexbrayat
 */
public class Restaurant {
    private String nom="nom par defaut"; 
    
    public Restaurant(){
    }
    
    public Restaurant(String enseigne){
        nom=enseigne; 
    }
    
    public String toString(){
        return("Restaurant " + nom); 
    }
}
