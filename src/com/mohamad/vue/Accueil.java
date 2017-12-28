package com.mohamad.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Accueil extends Container {

	public Accueil(Dimension dim) {
		super(dim);
		initPanel();
	}

	public void initPanel() {
		JLabel titre = new JLabel("Bienvenue dans le jeu du MasterMind\n");
		titre.setHorizontalAlignment(JLabel.CENTER);
		titre.setFont(comics30);
		this.panel.add(titre, BorderLayout.NORTH);
		
		JButton buton = new JButton("test");
		buton.setFont(arial);
		//buton.setEditable(false);
		buton.setBackground(Color.cyan);
		
		this.panel.add(buton, BorderLayout.CENTER);

	}

}
