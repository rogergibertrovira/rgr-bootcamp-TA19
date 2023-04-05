package vistas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class vistaPeliculas extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField textField;
	private JLabel label2;
	private JComboBox<Object> comboBox;

	public vistaPeliculas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 200);
		setTitle("Peliculas");

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Labels
		JLabel label1 = new JLabel("Escribe un titulo");
		label1.setBounds(45, 26, 201, 14);
		contentPane.add(label1);

		label2 = new JLabel("Peliculas");
		label2.setBounds(291, 26, 88, 14);
		contentPane.add(label2);

		//ComboBox de las peliculas
		comboBox = new JComboBox<Object>();
		comboBox.addItem("Star Wars: Episode 3");
		comboBox.addItem("Mad Max: Fury Road");
		comboBox.setBounds(291, 65, 207, 22);
		contentPane.add(comboBox);

		//Button para añadir una pelicula
		JButton buttonAnadir = new JButton("Añadir");
		buttonAnadir.setBounds(45, 112, 76, 23);
		contentPane.add(buttonAnadir);

		//Textfield para introducir el nombre de la nueva pelicula
		textField = new JTextField();
		textField.setBounds(45, 66, 201, 20);
		contentPane.add(textField);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setColumns(10);

		//ActionListener del botón
		buttonAnadir.addActionListener(aListener);
		
		setVisible(true);
	}
	
	ActionListener aListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			comboBox.addItem(textField.getText());
			textField.setText("");
		}
	};
}