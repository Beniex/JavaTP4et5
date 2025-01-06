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
public class Vin extends Boisson{

    @Override
    public String toString() {
        return "Vin{nom= "+ super.toString() + ",Couleur=" + Couleur + ", Type=" + Type + '}';
    }

    public Vin(String Couleur) {
        this.Couleur = Couleur;
    }

    public Vin(String nom, String Type, String Couleur) {
        super(nom);
        this.Type = Type; 
        this.Couleur = Couleur;
    }
    
    private String Couleur;

    /**
     * Get the value of Couleur
     *
     * @return the value of Couleur
     */
    public String getCouleur() {
        return Couleur;
    }

    /**
     * Set the value of Couleur
     *
     * @param Couleur new value of Couleur
     */
    public void setCouleur(String Couleur) {
        this.Couleur = Couleur;
    }

    private String Type = "Bourgogne";

    /**
     * Get the value of Type
     *
     * @return the value of Type
     */
    public String getType() {
        return Type;
    }

    /**
     * Set the value of Type
     *
     * @param Type new value of Type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

}
