/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpbase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author bexbrayat
 */
public class TPbase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Démarrage de l'application...");

        try {
                Class.forName("org.hsqldb.jdbc.JDBCDriver");
                System.out.println("Driver chargé avec succès!");
        } catch (ClassNotFoundException f) {
                System.out.println("Driver pas trouvé");
        }
        
        try{
            Connection connection = DriverManager.getConnection("jdbc:hsqldb:file:personnes","SA","");
            System.out.println("Connexion à la base de données réussie!");  
        } catch (SQLException e) {
	System.out.println("Base pas bon");
}


    }
    
}
