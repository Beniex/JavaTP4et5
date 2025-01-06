/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fenetre;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author bexbrayat
 */
public class OldFenetre extends JFrame{

    public OldFenetre(String string){
        super(string);
        this.setSize(800, 800);
	this.setResizable(true);
        JPanel panel = new JPanel(); 
        this.add(panel); 


        JButton bouton1 = new JButton("Rouge");
        bouton1.addActionListener(e -> panel.setBackground(Color.RED));
  
        JButton bouton3 = new JButton("Bleu");
        bouton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.BLUE);  
            }
        });

	panel.setLayout(new BorderLayout());
        panel.add(bouton1, BorderLayout.WEST); 
        panel.add(bouton3, BorderLayout.EAST);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        
        
        
    }
    
}
