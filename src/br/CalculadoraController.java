package br;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraController extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	
	

	/**
	 * Create the frame.
	 */
	public CalculadoraController () {
		setTitle("Calculator");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 257, 289);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 229, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Utilsoperacoes.preenche(textField, "8");
			}
		});
		button_8.setBounds(90, 99, 63, 23);
		contentPane.add(button_8);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Utilsoperacoes.preenche(textField, "3");
			}
		});
		button_3.setBounds(176, 167, 63, 23);
		contentPane.add(button_3);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Utilsoperacoes.preenche(textField, "2");
			}
		});
		button_2.setBounds(90, 167, 63, 23);
		contentPane.add(button_2);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Utilsoperacoes.preenche(textField, "4");
			}
		});
		button_4.setBounds(10, 133, 63, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Utilsoperacoes.preenche(textField, "5");
			}
		});
		button_5.setBounds(90, 133, 63, 23);
		contentPane.add(button_5);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Utilsoperacoes.preenche(textField, "1");
			}
		});
		button_1.setBounds(10, 167, 63, 23);
		contentPane.add(button_1);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Utilsoperacoes.preenche(textField, "6");
			}
		});
		button_6.setBounds(176, 133, 63, 23);
		contentPane.add(button_6);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Utilsoperacoes.preenche(textField, "9");
			}
		});
		button_9.setBounds(176, 99, 63, 23);
		contentPane.add(button_9);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Utilsoperacoes.preenche(textField, "7");
			}
		});
		button_7.setBounds(10, 99, 63, 23);
		contentPane.add(button_7);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = UtilsNumero.stringToDouble(textField.getText());
				Utilsoperacoes.setA(a);
				Utilsoperacoes calcula = new  Utilsoperacoes();
				calcula.setOperacao(1);
				Utilsoperacoes.setStatus(true);
				
				
			}
		});
		btnNewButton.setBounds(10, 65, 48, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = UtilsNumero.stringToDouble(textField.getText());
				Utilsoperacoes.setA(a);
				Utilsoperacoes calcula = new  Utilsoperacoes();
				calcula.setOperacao(2);
				Utilsoperacoes.setStatus(true);
			}
		});
		button.setBounds(68, 65, 48, 23);
		contentPane.add(button);
		
		JButton button_10 = new JButton("*");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = UtilsNumero.stringToDouble(textField.getText());
				Utilsoperacoes.setA(a);
				Utilsoperacoes calcula = new  Utilsoperacoes();
				calcula.setOperacao(3);
				Utilsoperacoes.setStatus(true);
			}
		});
		button_10.setBounds(134, 65, 48, 23);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("/");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=UtilsNumero.stringToDouble(textField.getText());
				Utilsoperacoes.setA(a) ;
				Utilsoperacoes calcula = new  Utilsoperacoes();
				calcula.setOperacao(4);
				Utilsoperacoes.setStatus(true);
			}
		});
		button_11.setBounds(191, 65, 48, 23);
		contentPane.add(button_11);
		
		JButton btnNewButton_1 = new JButton("=");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double b = UtilsNumero.stringToDouble(textField.getText());
				Utilsoperacoes.setB(b);
				Utilsoperacoes.setC(Utilsoperacoes.calcula(Utilsoperacoes.getOperacao(), Utilsoperacoes.getA(), Utilsoperacoes.getB()));
				textField.setText(UtilsNumero.doubleToString(Utilsoperacoes.getC()));
				Utilsoperacoes.setStatus(true);
				
				
			}
		});
		btnNewButton_1.setBounds(10, 221, 229, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Utilsoperacoes.limpaCampo(textField);
			}
		});
		btnCe.setBounds(10, 31, 89, 23);
		contentPane.add(btnCe);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Utilsoperacoes.preenche(textField, "0");
			}
		});
		button_0.setBounds(90, 197, 63, 23);
		contentPane.add(button_0);
	}
}
