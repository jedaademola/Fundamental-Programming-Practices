package com.fpp.lesson6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Problem1 {
	private static JTextField userText ;
	private static JTextField outputText ;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("String Utility");
		frame.setSize(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		placeComponents(frame);
		frame.setVisible(true);
	}
	private static void placeComponents(JFrame frame) {
		frame.setLayout(null);

		
		JButton countButton = new JButton("Count Letters");
		countButton.setBounds(10, 10, 160, 25);
		frame.add(countButton);

		userText = new JTextField(20);
		userText.setBounds(200, 30, 160, 25);
		frame.add(userText);

		JButton reverseButton = new JButton("Reverse Letters");
		reverseButton.setBounds(10, 40, 160, 25);
		frame.add(reverseButton);

		outputText = new JTextField(20);
		outputText.setBounds(200, 60, 160, 25);
		frame.add(outputText);
		
		JButton removeButton = new JButton("Remove Duplicates");
		removeButton.setBounds(10, 70, 160, 25);
		frame.add(removeButton);
				//Anonymous class
		countButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						String countText = String.valueOf(userText.getText().length());
						outputText.setText(countText);
					}
				});
				
		reverseButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String inpuText = String.valueOf(userText.getText());
					
					 StringBuilder strBuilder = new StringBuilder();
				        char[] strChars = inpuText.toCharArray();

				        for (int i = strChars.length - 1; i >= 0; i--) {
				            strBuilder.append(strChars[i]);
				        }

					outputText.setText( strBuilder.toString());
			}
		});
		
		removeButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				String inpuText = String.valueOf(userText.getText());
				char[] characters = inpuText.toCharArray();
				boolean[] found = new boolean[256];
				StringBuilder sb = new StringBuilder();
				
				for (char c : characters) {
					if (!found[c]) {
					    found[c] = true;
					    sb.append(c);
					}
				}
				outputText.setText( sb.toString());
		}
	});
			
	}

}
