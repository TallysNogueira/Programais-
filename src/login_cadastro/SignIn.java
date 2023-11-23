package login_cadastro;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Toolkit;




public class SignIn extends JFrame {

	/**
	 * Launch the application.
	 */
	private static final long serialVersionUID = 1L;
	//private final JPanel tela3HUD = new JPanel();
	//Log log = new Log();
	JTextField NomeUsuario;
	private JTextField EmailouCelular;
	private JTextField senhaTELA1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
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
	public SignIn() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SignIn.class.getResource("/imagens/python_104451.png")));
		getContentPane().setBackground(SystemColor.textHighlight);
		
	
		
		
		
		setTitle("Cadastro");
		setBounds(0, 0, 772, 467);
		setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
	
		
		JLabel lblInfo = new JLabel("Para começar seu cadastro insira as seguintes informações");
		lblInfo.setForeground(new Color(255, 255, 0));
		lblInfo.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblInfo.setBounds(29, 35, 580, 27);
		getContentPane().add(lblInfo);
		
		JLabel LblUsuario = new JLabel("Nome de usuário");
		LblUsuario.setForeground(new Color(255, 255, 0));
		LblUsuario.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		LblUsuario.setBounds(554, 91, 127, 20);
		getContentPane().add(LblUsuario);
		
		NomeUsuario = new JTextField();
		NomeUsuario.setBounds(553, 113, 180, 26);
		getContentPane().add(NomeUsuario);
		NomeUsuario.setColumns(10);
		
		
		
		JLabel LabelEouC = new JLabel("Email ou Celular");
		LabelEouC.setForeground(new Color(255, 255, 0));
		LabelEouC.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		LabelEouC.setBounds(554, 164, 139, 14);
		getContentPane().add(LabelEouC);
		
		EmailouCelular = new JTextField();
		EmailouCelular.setColumns(10);
		EmailouCelular.setBounds(554, 182, 180, 27);
		getContentPane().add(EmailouCelular);
		
		JButton SenhaTELA1 = new JButton("Cadastrar");
		SenhaTELA1.setOpaque(false);
		SenhaTELA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(NomeUsuario.getText().equals("") && EmailouCelular.getText().equals("") && senhaTELA1.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"Preencha os dados");

				
			}else if(NomeUsuario.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"É necessário nome de usuário");
			
			}else if(EmailouCelular.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"email ou telefone incorretos");
				
			}else if(senhaTELA1.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"senha não preenchida");
				
			}else if(NomeUsuario.getText().equals("") && EmailouCelular.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"senha não foi preenchida");
				
			}else if(EmailouCelular.getText().equals("") && senhaTELA1.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"e obrigatorio criar nome de usuario");
				;
			}
			if(NomeUsuario.getText() != null && EmailouCelular.getText() != null && senhaTELA1.getText() != null) {
				
				try {
					String nom = NomeUsuario.getText();
					String emc = EmailouCelular.getText();
					String senha = senhaTELA1.getText();

					if(nom.isBlank() == false && emc.isBlank() == false && senha.isBlank() == false) {
					Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/LoginProgramais", "postgres", "1234");
					Statement stm = connection.createStatement();
					stm.executeUpdate("INSERT INTO usuario(nome_usuario,email,senha) VALUES ('"+nom+"','"+emc+"','"+senha+"')");
					JOptionPane.showMessageDialog(null,"Conta criada");
					connection.close();
					}
					
				} catch (SQLException e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null,e1);

				}
			
			}
			}
			
		});
		SenhaTELA1.setBounds(639, 389, 109, 23);
		getContentPane().add(SenhaTELA1);
		
		JButton ButtonLogin = new JButton("Login");
		ButtonLogin.setOpaque(false);
		ButtonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			Log log = new Log();
			log.setVisible(true);
			}	
		});
		ButtonLogin.setForeground(new Color(0, 0, 255));
		ButtonLogin.setBounds(659, 15, 89, 23);
		getContentPane().add(ButtonLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(new Color(255, 255, 0));
		lblSenha.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblSenha.setBounds(553, 219, 80, 25);
		getContentPane().add(lblSenha);
		
		
		
		JCheckBox chckbxRobo = new JCheckBox("Não sou um robô");
		chckbxRobo.setOpaque(false);
		chckbxRobo.setBackground(new Color(255, 255, 255));
		chckbxRobo.setForeground(new Color(0, 0, 255));
		chckbxRobo.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		chckbxRobo.setBounds(568, 333, 165, 23);
		getContentPane().add(chckbxRobo);
	
///////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		JTextPane textPaneTela1 = new JTextPane();
		textPaneTela1.setForeground(SystemColor.textHighlight);
		textPaneTela1.setOpaque(false);
		textPaneTela1.setBackground(new Color(240, 240, 240));
		textPaneTela1.setEditable(false);
		textPaneTela1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		textPaneTela1.setText("Fale conosco: programais+@gmail.com");
		textPaneTela1.setBounds(10, 385, 317, 27);
		getContentPane().add(textPaneTela1);
		
		JTextPane texttela1_1 = new JTextPane();
		texttela1_1.setForeground(SystemColor.textHighlight);
		texttela1_1.setOpaque(false);
		texttela1_1.setBorder(null);
		texttela1_1.setBackground(new Color(255, 255, 255));
		texttela1_1.setText("Nesta plataforma voce irá dar seus primeiros passos na linguagem de programação em Python, treinando seu pensamento computacional e aprendendo estruturas básicas de programação.\r\n");
		texttela1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		texttela1_1.setEditable(false);
		texttela1_1.setBounds(29, 102, 446, 159);
		getContentPane().add(texttela1_1);
		
		senhaTELA1 = new JPasswordField();
		senhaTELA1.setBounds(554, 245, 179, 27);
		getContentPane().add(senhaTELA1);
		senhaTELA1.setColumns(10);
		
		JLabel lblWallpaper = new JLabel("");
		lblWallpaper.setIcon(new ImageIcon("C:\\Users\\tally\\Downloads\\teste.jpg"));
		lblWallpaper.setBounds(-103, -23, 1652, 572);
		getContentPane().add(lblWallpaper);
		


	
		
		
	}
}
