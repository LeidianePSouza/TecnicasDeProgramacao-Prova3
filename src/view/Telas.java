package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.ActiveEvent;

public class Telas extends JFrame{

	public Telas() {
		this.setSize(600, 650);
		this.setResizable(false);
		this.setTitle("Jogo");		
		
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			UIManager.put("nimbusBase", Color.BLACK);
		} catch(Exception e) {
			e.printStackTrace();
		}
		

		JPanel painelNome = new JPanel();
		painelNome.setBackground(Color.GRAY);		
		JLabel nomeJogador = new JLabel("Nome: ");
		nomeJogador.setFont(new Font ("Calibri", Font.CENTER_BASELINE, 20));
		
		JTextField caixaNome = new JTextField(10);
		JButton salvar = new JButton("Salvar");
		salvar.setFont(new Font ("Times New Roman", Font.CENTER_BASELINE, 16));
		salvar.setPreferredSize(new Dimension(90,30));
		salvar.setBackground(Color.green);
		
		painelNome.add(nomeJogador);
		painelNome.add(caixaNome);
		painelNome.add(salvar);
		
		JPanel painelBotoes = new JPanel();
		painelBotoes.setBackground(Color.gray);
		
		JButton proximo = new JButton("Próximo");
		proximo.setFont(new Font ("Times New Roman", Font.CENTER_BASELINE, 16));
		proximo.setPreferredSize(new Dimension(90,30));
		proximo.setBackground(Color.green);
		
		JButton sair = new JButton("Sair");
		sair.setFont(new Font ("Times New Roman", Font.CENTER_BASELINE, 16));
		sair.setPreferredSize(new Dimension(90,30));
		sair.setBackground(Color.green);

		painelBotoes.add(proximo);
		painelBotoes.add(sair);
		
		JPanel painelCartas = new JPanel();
		painelCartas.setBackground(Color.WHITE);
		
		ImageIcon imagem = new ImageIcon("C:\\Users\\LEIDIANE\\Documents\\LEID\\EngComp\\Técnicas de Programação\\workspace\\Prova03\\imagens\\interrogacao.jpg");
		Image image = imagem.getImage();
		this.setIconImage(image);
		
		
//		JLabel label = new JLabel(imagem);
//		label.setPreferredSize(new Dimension(350,350));
//		painelCartas.add(label);
		 
		this.add(painelBotoes, BorderLayout.PAGE_END);
		this.add(painelNome, BorderLayout.PAGE_START);
		this.add(painelCartas, BorderLayout.CENTER);
		
		this.setState(JFrame.ICONIFIED);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
