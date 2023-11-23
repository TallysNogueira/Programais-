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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import hud.HUD;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;


public class Log extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	private JTextField NomeTELA2;
	private JPasswordField SenhaTELA2;
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
		getContentPane().setBackground(new Color(0, 0, 0));
		setTitle("Login");
		setBounds(0, 0, 751, 438);
		setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);

		
		JLabel labelS = new JLabel();
		labelS.setForeground(new Color(0, 255, 0));
		labelS.setText("Senha:");
		labelS.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		labelS.setBounds(219, 195, 45, 26);
		getContentPane().add(labelS);
		
		JLabel labelE = new JLabel("Nome de usuário:\r\n");
		labelE.setForeground(new Color(0, 255, 0));
		labelE.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		labelE.setBounds(156, 171, 108, 14);
		getContentPane().add(labelE);
		
		NomeTELA2 = new JTextField();
		NomeTELA2.setColumns(10);
		NomeTELA2.setBackground(Color.WHITE);
		NomeTELA2.setBounds(263, 170, 176, 20);
		getContentPane().add(NomeTELA2);
		
		
		
		JButton buttonTELA2 = new JButton("Prosseguir");
		buttonTELA2.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try {
					Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/LoginProgramais", "postgres", "1234");
					
				
					
					Statement stm = connection.createStatement();
					String sql = "select * from usuario where nome_usuario='"+NomeTELA2.getText()+"' and senha='"+SenhaTELA2.getText()+"'";
					ResultSet rs = stm.executeQuery(sql);
					
					if(rs.next()) {
						JOptionPane.showMessageDialog(null,"acesso concedido");
						dispose();
						HUD hud = new HUD();
						hud.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null,"nome ou senha inválidos");

					}
					connection.close();

					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
			}
		});
		buttonTELA2.setBackground(Color.WHITE);
		buttonTELA2.setBounds(624, 368, 103, 23);
		getContentPane().add(buttonTELA2);
		
		JLabel lblNewLabel_2 = new JLabel("Seja bem-vindo ao Programais+");
		lblNewLabel_2.setForeground(new Color(0, 255, 0));
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setBounds(219, 11, 245, 20);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Por favor preencha os campos abaixo");
		lblNewLabel_3.setForeground(new Color(0, 255, 0));
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_3.setBounds(196, 118, 300, 31);
		getContentPane().add(lblNewLabel_3);
		
		SenhaTELA2 = new JPasswordField();
		SenhaTELA2.setBounds(263, 200, 176, 20);
		getContentPane().add(SenhaTELA2);
		
		JCheckBox Checagem = new JCheckBox("Não sou um robô");
		Checagem.setBackground(new Color(0, 0, 0));
		Checagem.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		Checagem.setForeground(new Color(0, 0, 255));
		Checagem.setBounds(257, 320, 150, 23);
		getContentPane().add(Checagem);
		
		JButton btnCadastrarse = new JButton("Cadastre-se");
		btnCadastrarse.setOpaque(false);
		btnCadastrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				SignIn signin = new SignIn();
				signin.setVisible(true);
			}
		});
		btnCadastrarse.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCadastrarse.setForeground(Color.BLUE);
		btnCadastrarse.setBounds(624, 13, 103, 23);
		getContentPane().add(btnCadastrarse);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 255, 0)));
		lblNewLabel.setIcon(new ImageIcon(Log.class.getResource("/imagens/preview2.gif")));
		lblNewLabel.setBounds(0, -15, 737, 416);
		getContentPane().add(lblNewLabel);

	}
}
