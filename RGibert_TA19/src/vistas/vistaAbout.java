package vistas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class vistaAbout extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	public vistaAbout() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 350, 180);
		setTitle("About");

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label1 = new JLabel();
		label1.setVerticalAlignment(SwingConstants.TOP);
		label1.setBounds(58, 16, 218, 97);
		label1.setText("<html>Calculadora <br><br> " + "Autor: Roger Gibert Rovira <br><br>" + "Abril 2023</html>");
		contentPane.add(label1);

		setVisible(true);
	}

}
