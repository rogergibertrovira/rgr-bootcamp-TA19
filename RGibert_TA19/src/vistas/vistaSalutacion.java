package vistas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class vistaSalutacion extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	public vistaSalutacion(String text) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 250, 150);
		setTitle("Mensaje");

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label1 = new JLabel("Hola " + text + "!");
		label1.setBounds(63, 48, 108, 14);
		contentPane.add(label1);

		setVisible(true);
	}

}
