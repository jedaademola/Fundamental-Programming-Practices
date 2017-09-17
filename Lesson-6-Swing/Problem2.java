package com.fpp.lesson6;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Problem2 {
	/*
	 	Red– This is the first color of the rainbow from top. Red signifies passion, vitality, enthusiasm and security. It is the light with the longest wavelength.
		Orange– This light or color is a combination of yellow and red. It is a dynamic color representing creativity, practicality, playfulness as well as equilibrium or control.
		Yellow– This is the color of the sunshine itself. It represents clarity of thought, wisdom, orderliness and energy.
		Green– This is the middle color of the rainbow and denotes fertility, growth, balance, health and wealth.
		Blue– This the fifth color of the rainbow which makes us think of the Unknown. The sky and the wide oceans are in this color and hence it has been associated with Spirituality and Divinity.
		Indigo– It is believed that where Blue is calming, Indigo is sedating. Indigo is mystical as it bridges the Gap between Finite and Infinite. Indigo colored gem stones are often used for spiritual attainment, psychic abilities, self awareness and enhancement of Intuition.
		Violet– The last color of the rainbow is a mix of red and blue. It is considered the highest element of spirituality. It can ignite one’s imagination and be an inspiration to artists. Dark tones of violet are associated with sorrow. Deeper shades of violet or purple denote high spiritual mastery.
	
	   http://cloford.com/resources/colours/namedcol.htm
	 */
	
	
	private static JButton redButton;
	private static JButton orangeButton;
	private static JButton yellowButton;
	private static JButton greenButton;
	private static JButton blueButton;
	private static JButton indigoButton;
	private static JButton violetButton;
	private static  JFrame frame ;
	
	public static void main(String[] args) {
		
		frame = new JFrame("Rainbow Color Frame");
		frame.setSize(2000, 2000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		placeComponents(frame);
		frame.setVisible(true);
	}
	
	private static void placeComponents(JFrame frame) {
		frame.setLayout(null);
		
		redButton = new JButton();
		redButton.setBounds(10, 0, 160, 100);
		redButton.setBackground(Color.RED);
		frame.add(redButton);
		
		
		orangeButton = new JButton();
		orangeButton.setBounds(165, 0, 160, 100);
		orangeButton.setBackground(Color.ORANGE);
		frame.add(orangeButton);
		
		
		yellowButton = new JButton();
		yellowButton.setBounds(320, 0, 160, 100);
		yellowButton.setBackground(Color.YELLOW);
		frame.add(yellowButton);
		
		
		
		greenButton = new JButton();
		greenButton.setBounds(480, 0, 160, 100);
		greenButton.setBackground(Color.GREEN);
		frame.add(greenButton);
		
		
		blueButton = new JButton();
		blueButton.setBounds(640, 0, 160, 100);
		blueButton.setBackground(Color.BLUE);
		frame.add(blueButton);
		
		
		indigoButton = new JButton();
		indigoButton.setBounds(800, 0, 160, 100);
		indigoButton.setBackground(new Color(75,0,130));//INDIGO
		frame.add(indigoButton);
		
		violetButton = new JButton();
		violetButton.setBounds(960, 0, 160, 100);
		violetButton.setBackground(new Color(238,130,238));//VIOLET
		frame.add(violetButton);
		
		
		
		//Event handling for Button
		ButtonHandler btnHandler = new ButtonHandler();
		redButton.addActionListener(btnHandler);
		orangeButton.addActionListener(btnHandler);
		yellowButton.addActionListener(btnHandler);
		greenButton.addActionListener(btnHandler);
		blueButton.addActionListener(btnHandler);
		indigoButton.addActionListener(btnHandler);
		violetButton.addActionListener(btnHandler);
		
	}
	

	//define event handling for button handler
	public static class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){
			
			String msgText ="";
			if(event.getSource() == redButton){
				
				msgText ="Red signifies passion, vitality, enthusiasm and security";
			}
			else if (event.getSource() == orangeButton)
			{
				msgText ="Orange is a dynamic color representing creativity, practicality, playfulness as well as equilibrium or control";
			}
			else if (event.getSource() == yellowButton)
			{
				msgText ="Yellow represents clarity of thought, wisdom, orderliness and energy";
			}
			
			else if (event.getSource() == greenButton)
			{
				msgText ="Green denotes fertility, growth, balance, health and wealth";
			}
			else if (event.getSource() == blueButton)
			{
				msgText ="Blue is associated with Spirituality and Divinity";
			}
			else if (event.getSource() == indigoButton)
			{
				msgText ="Indigo is mystical as it bridges the Gap between Finite and Infinite.";
			}
			else 
			{
				msgText ="Violet is considered the highest element of spirituality";
			}
						
			JOptionPane.showMessageDialog(frame,
					msgText,
					"Color Meaning",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
