/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstappli;
import Etablissement.Restaurant; 
/**
 *
 * @author bexbrayat
 */
public class FirstAppli {

    /**
     * @param args the command line arguments
     */
    private String message ="Bom dia" ; 
    public void Afficher(){
    System.out.println(message);
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        Restaurant restau = new Restaurant(); 
        restau.Afficher();
    }
    
}
