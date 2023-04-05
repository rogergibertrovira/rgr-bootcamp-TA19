package vistas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaSaludador extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField textField1;
	private JLabel label1;

	public vistaSaludador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 400, 200);
		setTitle("Saludador");

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		label1 = new JLabel("Escribe un nombre para saludar");
		label1.setBounds(86, 25, 212, 14);
		contentPane.add(label1);

		JButton button1 = new JButton("Saludar!");
		button1.setBounds(150, 112, 84, 23);
		contentPane.add(button1);

		textField1 = new JTextField();
		textField1.setBounds(108, 64, 167, 23);
		contentPane.add(textField1);
		textField1.setColumns(10);

		button1.addActionListener(aListener);

		setVisible(true);
	}

	ActionListener aListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			vistaSalutacion v = new vistaSalutacion(textField1.getText());
			setVisible(false);
		}
	};

}
