package login_cadastro;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import hud.HUD;
import hud.HUD;

public class Log extends JFrame {

	/**
	 * Launch the application.
	 */
	private JTextField NomeTELA2;
	private JPasswordField SenhaTELA2;
	private JTextField NomeUsuario;
	private JTextField EmailouCelular;
	private JTextField senhaTELA1;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Log frame = new Log();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Log() {
		setTitle("Login");
		setBounds(0, 0, 751, 438);
		setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);

		
		JLabel labelS = new JLabel("Insira sua senha:");
		labelS.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		labelS.setBounds(145, 166, 108, 26);
		getContentPane().add(labelS);
		
		JLabel labelE = new JLabel("Insira seu nome:");
		labelE.setForeground(Color.BLACK);
		labelE.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		labelE.setBounds(145, 121, 103, 14);
		getContentPane().add(labelE);
		
		NomeTELA2 = new JTextField();
		NomeTELA2.setColumns(10);
		NomeTELA2.setBackground(Color.WHITE);
		NomeTELA2.setBounds(263, 119, 176, 20);
		getContentPane().add(NomeTELA2);
		
		
		
		JButton buttonTELA2 = new JButton("Prosseguir");
		buttonTELA2.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
			if(NomeTELA2.getText().equals("") && SenhaTELA2.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"nome e senha não preenchidos");
			}else if(NomeTELA2.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"nome não preenchido");
			}else if(SenhaTELA2.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"senha não preenchido");
			}else if(NomeTELA2.getText().equals("nome") && SenhaTELA2.getText().equals("senha")) {
				JOptionPane.showMessageDialog(null,"acesso concedido");
				dispose();
				HUD hud = new HUD();
				hud.setVisible(true);
				hud.setLocationRelativeTo(null);

			}
			
				
			}
		});
		buttonTELA2.setBackground(Color.WHITE);
		buttonTELA2.setBounds(605, 368, 103, 23);
		getContentPane().add(buttonTELA2);
		
		JLabel lblNewLabel_2 = new JLabel("Seja bem vindo ao programais+");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setBounds(219, 11, 245, 20);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Por favor");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_3.setBounds(304, 43, 81, 14);
		getContentPane().add(lblNewLabel_3);
		
		SenhaTELA2 = new JPasswordField();
		SenhaTELA2.setBounds(263, 170, 176, 20);
		getContentPane().add(SenhaTELA2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 217, 723, 2);
		getContentPane().add(separator);
		
		JCheckBox Checagem = new JCheckBox("Não sou um robô");
		Checagem.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		Checagem.setForeground(new Color(0, 0, 255));
		Checagem.setBounds(257, 320, 150, 23);
		getContentPane().add(Checagem);

	}
}
