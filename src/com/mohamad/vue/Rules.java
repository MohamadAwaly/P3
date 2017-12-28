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
				+"1 - Découvrir la combinaison à x chiffres de l'adversaire (le défenseur) !\n"
				+ "	1. L’attaquant fait une proposition. !\n"
				+ "	2. Le défenseur indique pour chaque chiffre de la combinaison proposée. !\n"
				+ "	3. Si le chiffre de sa combinaison est plus grand (+), plus petit (-) ou si c'est le bon chiffre (=).\n"
				+ "2 - découvrir la combinaison à x chiffres/couleurs de l'adversaire (le défenseur)\n"
				+ "	1.  L’attaquant fait une proposition.\n"
				+ "	2.  Le défenseur indique pour chaque proposition le nombre de chiffre/couleur de la proposition\n"
				+ " 	qui apparaissent à la bonne place et à la mauvaise place dans la combinaison secrète.\n"
				+ "	3.  L'attaquant doit deviner la combinaison secrète en un nombre limité d'essais.\n");
		
		texte.setFont(arial);
		texte.setEditable(false);
		texte.setBackground(Color.white);
		
		this.panel.add(texte, BorderLayout.SOUTH);
	}

}
