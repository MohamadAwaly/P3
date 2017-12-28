package com.mohamad.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class Fenetre extends JFrame {

	private Dimension size;
	private JPanel conteneur = new JPanel();

	private JMenuBar menubar = null;

	private JMenu fichier = null;
	private JMenu apropos = null;

	private JMenuItem nouveau = null;
	private JMenuItem score = null;
	private JMenuItem quitter = null;
	private JMenuItem rules = null;
	private JMenuItem propo = null;

	// Creation de la fenetre
	public Fenetre() {

		this.setTitle("MasterMind");
		this.setSize(900, 600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.size = new Dimension(this.getWidth(), this.getHeight());
		this.setContentPane(this.conteneur);

		this.conteneur.setBackground(Color.white);

		// Menu Toolbar
		menubar = new JMenuBar();

		fichier = new JMenu("Fichier");
		fichier.setMnemonic('f');

		nouveau = new JMenuItem("Nouveau");
		nouveau.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		nouveau.addActionListener(new BoutonListenerNouveauJeu() );
		
		score = new JMenuItem("Score");
		score.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, KeyEvent.CTRL_MASK));
		
		quitter = new JMenuItem("Quitter");
		quitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, KeyEvent.CTRL_MASK));
		quitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		fichier.add(nouveau);
		fichier.add(score);
		fichier.addSeparator();
		fichier.add(quitter);

		apropos = new JMenu("propos");
		apropos.setMnemonic('o');

		rules = new JMenuItem("Règles du jeu");
		rules.addActionListener(new BoutonListenerRules());
		
		propo = new JMenuItem("   ?   ");
		propo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						"Créateur : Awaly Mohamad\nLicence : Freeware\nCopyright : mohamad.awaly@gmail.com",
						"Informations", JOptionPane.NO_OPTION);
				conteneur.removeAll();
				// conteneur.add(new AccueilPanel(size).getPanel());
				conteneur.revalidate();
				// model.reset();
			}
		});

		apropos.add(rules);
		apropos.add(propo);

		menubar.add(fichier);
		menubar.add(apropos);

		this.conteneur.setPreferredSize(this.size);
		this.conteneur.add(new Accueil(this.size).getPanel());
		this.setJMenuBar(menubar);
		this.setVisible(true);
	}
	class BoutonListenerNouveauJeu implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			conteneur.removeAll();
			conteneur.add(new JeuChiffre(size).getPanel(),BorderLayout.CENTER);
			conteneur.revalidate();
		}
		
	}
	class BoutonListenerScore implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}
	class BoutonListenerRules implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			conteneur.removeAll();
			conteneur.add(new Rules(size).getPanel(),BorderLayout.CENTER);
			conteneur.revalidate();
			
		}
		
	}

}
