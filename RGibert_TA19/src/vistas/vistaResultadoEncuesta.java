package vistas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class vistaResultadoEncuesta extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;

	public vistaResultadoEncuesta(String opcion1, String opcion2, int opcion3) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 525, 200);
		setTitle("Resultados encuesta");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("1. Elije un sistema operativo: " + opcion1);
		label1.setBounds(51, 29, 336, 14);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("2. Elije tu especialidad: " + opcion2);
		label2.setBounds(51, 72, 431, 14);
		contentPane.add(label2);
		
		JLabel label3 = new JLabel("3. Horas dedicadas en el ordenador: " + opcion3);
		label3.setBounds(51, 115, 336, 14);
		contentPane.add(label3);
		
		setVisible(true);
	}
}
