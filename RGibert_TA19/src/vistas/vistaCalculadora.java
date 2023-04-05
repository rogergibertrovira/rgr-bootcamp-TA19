package vistas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class vistaCalculadora extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField tfOperando1;
	private JTextField tfOperando2;
	private JTextField tfResultado;

	private double op1;
	private double op2;

	DecimalFormat d2 = new DecimalFormat("0.00000");

	public vistaCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 300);
		setTitle("Calculadora");

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Text fields para los operandos y el resultado
		tfOperando1 = new JTextField();
		tfOperando1.setBounds(51, 46, 86, 20);
		contentPane.add(tfOperando1);
		tfOperando1.setColumns(10);

		tfOperando2 = new JTextField();
		tfOperando2.setBounds(188, 46, 86, 20);
		contentPane.add(tfOperando2);
		tfOperando2.setColumns(10);

		tfResultado = new JTextField();
		tfResultado.setBackground(new Color(255, 255, 255));
		tfResultado.setEditable(false);
		tfResultado.setBounds(325, 46, 86, 20);
		contentPane.add(tfResultado);
		tfResultado.setColumns(10);

		// Labels para mostrar información
		JLabel label1 = new JLabel("OPERANDO 1");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(51, 21, 86, 14);
		contentPane.add(label1);

		JLabel label2 = new JLabel("OPERANDO 2");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setBounds(188, 21, 86, 14);
		contentPane.add(label2);

		JLabel label3 = new JLabel("RESULTADO");
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setBounds(325, 21, 86, 14);
		contentPane.add(label3);

		// Buttons de las diferentes operaciones y opciones
		JButton buttonSuma = new JButton("SUMA");
		buttonSuma.setBounds(58, 92, 145, 38);
		contentPane.add(buttonSuma);

		JButton buttonResta = new JButton("RESTA");
		buttonResta.setBounds(261, 92, 145, 38);
		contentPane.add(buttonResta);

		JButton buttonMulti = new JButton("MULTIPLICACIÓN");
		buttonMulti.setBounds(58, 149, 145, 38);
		contentPane.add(buttonMulti);

		JButton buttonDivision = new JButton("DIVISIÓN");
		buttonDivision.setBounds(261, 149, 145, 38);
		contentPane.add(buttonDivision);

		JButton buttonAbout = new JButton("ABOUT");
		buttonAbout.setBounds(86, 212, 89, 23);
		contentPane.add(buttonAbout);

		JButton buttonSalir = new JButton("SALIR");
		buttonSalir.setBounds(289, 212, 89, 23);
		contentPane.add(buttonSalir);

		// ActionListeners de los botones según operación
		buttonSuma.addActionListener(alSuma);
		buttonResta.addActionListener(alResta);
		buttonMulti.addActionListener(alMutli);
		buttonDivision.addActionListener(alDivision);
		buttonAbout.addActionListener(alAbout);
		buttonSalir.addActionListener(alSalir);

		setVisible(true);
	}

	// Se comprueba que el formato entrado para las operaciones es correcto
	ActionListener alSuma = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				op1 = Double.parseDouble(tfOperando1.getText());
				op2 = Double.parseDouble(tfOperando2.getText());
				tfResultado.setText(d2.format(op1 + op2));
			} catch (Exception ex) {
				System.out.println("Error de formato (" + ex + ")");
				vistaError ve = new vistaError();
			}
		}
	};

	ActionListener alResta = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				op1 = Double.parseDouble(tfOperando1.getText());
				op2 = Double.parseDouble(tfOperando2.getText());
				tfResultado.setText(d2.format(op1 - op2));
			} catch (Exception ex) {
				System.out.println("Error de formato (" + ex + ")");
				vistaError ve = new vistaError();
			}

		}
	};

	ActionListener alMutli = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				op1 = Double.parseDouble(tfOperando1.getText());
				op2 = Double.parseDouble(tfOperando2.getText());
				tfResultado.setText(d2.format(op1 * op2));
			} catch (Exception ex) {
				System.out.println("Error de formato (" + ex + ")");
				vistaError ve = new vistaError();
			}
		}
	};

	ActionListener alDivision = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				op1 = Double.parseDouble(tfOperando1.getText());
				op2 = Double.parseDouble(tfOperando2.getText());
				tfResultado.setText(d2.format(op1 / op2));
			} catch (Exception ex) {
				System.out.println("Error de formato (" + ex + ")");
				vistaError ve = new vistaError();
			}
		}
	};

	ActionListener alAbout = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			vistaAbout vAbout = new vistaAbout();
		}
	};

	ActionListener alSalir = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	};
}
