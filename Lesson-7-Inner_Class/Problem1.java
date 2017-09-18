package com.fpp.lesson7;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;

public class Problem1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Metric Conversion Assistant");
		frame.setSize(600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		placeComponents(frame);
		frame.setVisible(true);
	}

	private static void placeComponents(JFrame frame) {
		frame.setLayout(null);

		JLabel mileLabel = new JLabel("Mile:");
		mileLabel.setBounds(10, 10, 80, 25);
		frame.add(mileLabel);

		JTextField mileText = new JTextField(20);
		mileText.setBounds(100, 10, 160, 25);
		frame.add(mileText);

		JLabel kiloMeterLabel = new JLabel("Kilometer:");
		kiloMeterLabel.setBounds(300, 10, 80, 25);
		frame.add(kiloMeterLabel);

		JTextField kiloMeterText = new JTextField(20);
		kiloMeterText.setBounds(380, 10, 160, 25);
		frame.add(kiloMeterText);

		JLabel poundLabel = new JLabel("Pound:");
		poundLabel.setBounds(10, 40, 80, 25);
		frame.add(poundLabel);

		JTextField poundText = new JTextField(20);
		poundText.setBounds(100, 40, 160, 25);
		frame.add(poundText);

		JLabel kiloGramLabel = new JLabel("Kilogram:");
		kiloGramLabel.setBounds(300, 40, 80, 25);
		frame.add(kiloGramLabel);

		JTextField kiloGramText = new JTextField(20);
		kiloGramText.setBounds(380, 40, 160, 25);
		frame.add(kiloGramText);

		JLabel gallonLabel = new JLabel("Gallon:");
		gallonLabel.setBounds(10, 70, 80, 25);
		frame.add(gallonLabel);

		JTextField gallonText = new JTextField(20);
		gallonText.setBounds(100, 70, 160, 25);
		frame.add(gallonText);

		JLabel litersLabel = new JLabel("Liters:");
		litersLabel.setBounds(300, 70, 80, 25);
		frame.add(litersLabel);

		JTextField litersText = new JTextField(20);
		litersText.setBounds(380, 70, 160, 25);
		frame.add(litersText);

		JLabel fahrenheitLabel = new JLabel("Fahrenheit:");
		fahrenheitLabel.setBounds(10, 100, 80, 25);
		frame.add(fahrenheitLabel);

		JTextField fahrenheitText = new JTextField(20);
		fahrenheitText.setBounds(100, 100, 160, 25);
		frame.add(fahrenheitText);

		JLabel centrigradeLabel = new JLabel("Centrigrade:");
		centrigradeLabel.setBounds(300, 100, 80, 25);
		frame.add(centrigradeLabel);

		JTextField centrigradeText = new JTextField(20);
		centrigradeText.setBounds(380, 100, 160, 25);
		frame.add(centrigradeText);

		mileText.setText("0");
		kiloMeterText.setText("0");

		poundText.setText("0");
		kiloGramText.setText("0");

		gallonText.setText("0");
		litersText.setText("0");

		fahrenheitText.setText("0");
		centrigradeText.setText("0");

		JButton registerButton = new JButton("Convert");
		registerButton.setBounds(180, 200, 80, 25);
		frame.add(registerButton);
		// Anonymous class
		registerButton.addActionListener(evt -> {

			// (distance in kilometers) ≈ 1.6 * (distance in miles)
			// The mass m in kilograms (kg) is equal to the mass m in pounds (lb) times
			// 0.45359237:
			// liters = gallons × 3.785412
			// To convert temperatures in degrees Fahrenheit to Celsius, subtract 32 and
			// multiply by .5556 (or 5/9).

			String kiloMeterConvert = String.valueOf(1.6 * Double.valueOf(mileText.getText()));
			kiloMeterText.setText(kiloMeterConvert);

			String poundTextConvert = String.valueOf(0.45359237 * Double.valueOf(poundText.getText()));
			kiloGramText.setText(poundTextConvert);

			String gallonTextConvert = String.valueOf(3.785412 * Double.valueOf(gallonText.getText()));
			litersText.setText(gallonTextConvert);

			String fahrenheitTextConvert = String.valueOf(.5556 * (Double.valueOf(fahrenheitText.getText()) - 32));
			centrigradeText.setText(fahrenheitTextConvert);

		});

	}

}
