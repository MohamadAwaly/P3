package com.mohamad.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Rules extends Container {

	public Rules(Dimension dim) {
		super(dim);
		initPanel();
	}
	
	public void initPanel() {
		JLabel titre = new JLabel("Bienvenue dans le jeu du MasterMind\n");
		titre.setHorizontalAlignment(JLabel.CENTER);
		titre.setFont(comics30);
		this.panel.add(titre);

		JTextArea texte = new JTextArea("\n\n\n"
				+"1 - D�couvrir la combinaison � x chiffres de l'adversaire (le d�fenseur) !\n"
				+ "	1. L�attaquant fait une proposition. !\n"
				+ "	2. Le d�fenseur indique pour chaque chiffre de la combinaison propos�e. !\n"
				+ "	3. Si le chiffre de sa combinaison est plus grand (+), plus petit (-) ou si c'est le bon chiffre (=).\n"
				+ "2 - d�couvrir la combinaison � x chiffres/couleurs de l'adversaire (le d�fenseur)\n"
				+ "	1.  L�attaquant fait une proposition.\n"
				+ "	2.  Le d�fenseur indique pour chaque proposition le nombre de chiffre/couleur de la proposition\n"
				+ " 	qui apparaissent � la bonne place et � la mauvaise place dans la combinaison secr�te.\n"
				+ "	3.  L'attaquant doit deviner la combinaison secr�te en un nombre limit� d'essais.\n");
		
		texte.setFont(arial);
		texte.setEditable(false);
		texte.setBackground(Color.white);
		
		this.panel.add(texte, BorderLayout.SOUTH);
	}

}
