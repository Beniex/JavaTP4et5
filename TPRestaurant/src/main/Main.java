/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import etablissement.Restaurant;
import menu.Boisson;
import menu.Vin;

/**
 *
 * @author bexbrayat
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Début de main");
        Restaurant resto1 = new Restaurant(); 
        Restaurant resto2 = new Restaurant("Chez Léon");
        Boisson b= new Boisson("Coca");
        Vin v = new Vin("Saint-Joseph","Cotes du Rhone", "Rouge"); 
        System.out.println(resto1);
        System.out.println(resto2);
        System.out.println(b);
        System.out.println(v); 
        System.out.println("Fin de main");


    }
    
}
