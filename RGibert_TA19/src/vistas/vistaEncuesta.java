package vistas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class vistaEncuesta extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private ButtonGroup radioButtonGroup = new ButtonGroup();
	private ArrayList<JCheckBox> checkBoxGroup = new ArrayList<>();
	JSlider slider = new JSlider();

	public vistaEncuesta() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 430);
		setTitle("Encuesta");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Labels
		JLabel label1 = new JLabel("1. Elije un sistema operativo");
		label1.setBounds(35, 21, 182, 14);
		contentPane.add(label1);

		JLabel label2 = new JLabel("2. Elije tu especialidad");
		label2.setBounds(35, 135, 182, 14);
		contentPane.add(label2);

		JLabel label3 = new JLabel("3. Horas dedicadas en el ordenador");
		label3.setBounds(35, 258, 239, 14);
		contentPane.add(label3);

		// Radio buttons
		JRadioButton rb1 = new JRadioButton("Windows");
		rb1.setBounds(57, 42, 109, 23);
		contentPane.add(rb1);
		rb1.setActionCommand("Windows");
		radioButtonGroup.add(rb1);

		JRadioButton rb2 = new JRadioButton("Linux");
		rb2.setBounds(57, 68, 109, 23);
		contentPane.add(rb2);
		rb2.setActionCommand("Linux");
		radioButtonGroup.add(rb2);

		JRadioButton rb3 = new JRadioButton("Mac");
		rb3.setBounds(57, 94, 109, 23);
		contentPane.add(rb3);
		rb3.setActionCommand("Mac");
		radioButtonGroup.add(rb3);

		// Checkboxes
		JCheckBox cb1 = new JCheckBox("Programación");
		cb1.setBounds(57, 156, 160, 23);
		contentPane.add(cb1);
		checkBoxGroup.add(cb1);

		JCheckBox cb2 = new JCheckBox("Diseño gráfico");
		cb2.setBounds(57, 182, 120, 23);
		contentPane.add(cb2);
		checkBoxGroup.add(cb2);

		JCheckBox cb3 = new JCheckBox("Administración");
		cb3.setBounds(57, 208, 160, 23);
		contentPane.add(cb3);
		checkBoxGroup.add(cb3);

		// Slider
		slider.setPaintLabels(true);
		slider.setValue(5);
		slider.setSnapToTicks(true);
		slider.setMaximum(10);
		slider.setBounds(42, 279, 200, 26);
		contentPane.add(slider);

		// Labels para valores del slider
		JLabel label4 = new JLabel("0");
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setBounds(21, 305, 46, 14);
		contentPane.add(label4);

		JLabel label5 = new JLabel("5");
		label5.setHorizontalAlignment(SwingConstants.CENTER);
		label5.setBounds(126, 305, 31, 14);
		contentPane.add(label5);

		JLabel label6 = new JLabel("10");
		label6.setHorizontalAlignment(SwingConstants.CENTER);
		label6.setBounds(205, 305, 46, 14);
		contentPane.add(label6);

		// Button para acabar
		JButton submitButton = new JButton("Acabar");
		submitButton.setBounds(97, 342, 89, 23);
		contentPane.add(submitButton);

		submitButton.addActionListener(alSubmit);

		setVisible(true);
	}

	ActionListener alSubmit = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String respuesta2 = "";
			boolean hasBefore = false; // Para gestionar si necessita añadir "/" entre respuesta

			for (JCheckBox checkBox : checkBoxGroup) {
				if (checkBox.isSelected()) {
					if (hasBefore) {
						respuesta2 += " / ";
					}
					respuesta2 += checkBox.getActionCommand();
					hasBefore = true;
				}
			}
			vistaResultadoEncuesta v2 = new vistaResultadoEncuesta(radioButtonGroup.getSelection().getActionCommand(),
					respuesta2, slider.getValue());
		}
	};
}
