package com.mohamad.vue;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;

public class JeuChiffre  extends Container{
	
	private JButton bouton[];
	
	public JeuChiffre(Dimension dim) {
		super(dim);
		// TODO Auto-generated constructor stub
	}
	
	public void initPanel() {
		JLabel titre = new JLabel("Découvrir la combinaison à x chiffres de l'adversaire \n");
		titre.setHorizontalAlignment(JLabel.CENTER);
		titre.setFont(comics30);
		this.panel.add(titre, BorderLayout.NORTH);
		
		// Creation de tableau de chiffer
		int tabChiffre [] = {1,2,3,4,5,6,7,8,9};
		
		// un bouton pour chaque chiffre
		Dimension buttonDimension = new Dimension(50,30);
		this.bouton = new JButton[26];
		
		int i = 0;
		for(int tab : tabChiffre){
			this.panel.add(bouton[i], BorderLayout.CENTER);
		}
		
	}

}
