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
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;




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
		setTitle("Cadastro");
		setBounds(0, 0, 772, 467);
		setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JLabel Label1TELA1 = new JLabel("Seja bem vindo ao programais+");
		Label1TELA1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		Label1TELA1.setBounds(203, 11, 232, 27);
		getContentPane().add(Label1TELA1);
		
		JLabel label2TELA1 = new JLabel("Para começar seu cadastro insira as seguintes informações");
		label2TELA1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		label2TELA1.setBounds(101, 38, 472, 27);
		getContentPane().add(label2TELA1);
		
		JLabel LabelN = new JLabel("Nome de usuario");
		LabelN.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		LabelN.setBounds(554, 91, 103, 20);
		getContentPane().add(LabelN);
		
		NomeUsuario = new JTextField();
		NomeUsuario.setBounds(553, 113, 180, 26);
		getContentPane().add(NomeUsuario);
		NomeUsuario.setColumns(10);
		
		JLabel LabelEouC = new JLabel("Email ou Celular:");
		LabelEouC.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		LabelEouC.setBounds(548, 162, 109, 14);
		getContentPane().add(LabelEouC);
		
		EmailouCelular = new JTextField();
		EmailouCelular.setColumns(10);
		EmailouCelular.setBounds(554, 182, 180, 27);
		getContentPane().add(EmailouCelular);
		
		JButton SenhaTELA1 = new JButton("Prosseguir");
		SenhaTELA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(NomeUsuario.getText().equals("") && EmailouCelular.getText().equals("") && senhaTELA1.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"Preencha os dados");
				
				SignIn signin = new SignIn();

				
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
			if(NomeUsuario.getText().equals("nome") && EmailouCelular.getText().equals("email") && senhaTELA1.getText().equals("senha")) {
				JOptionPane.showMessageDialog(null,"Seja Bem Vindo");
				 
				 Log tela2Login = new Log();
				 setVisible(false);
				 tela2Login.setVisible(true);
			
			}
			}
			
		});
		SenhaTELA1.setBounds(639, 389, 109, 23);
		getContentPane().add(SenhaTELA1);
		
		JButton ButtonTELA1 = new JButton("Login");
		ButtonTELA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			Log log = new Log();
			log.setVisible(true);
			}	
		});
		ButtonTELA1.setForeground(new Color(0, 0, 255));
		ButtonTELA1.setBounds(659, 15, 89, 23);
		getContentPane().add(ButtonTELA1);
		
		JLabel lblNewLabel_4 = new JLabel("Senha:");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		lblNewLabel_4.setBounds(554, 220, 46, 14);
		getContentPane().add(lblNewLabel_4);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 283, 745, 2);
		getContentPane().add(separator_1);
		
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Não sou um robô");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setForeground(new Color(0, 0, 255));
		chckbxNewCheckBox.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		chckbxNewCheckBox.setBounds(568, 333, 133, 23);
		getContentPane().add(chckbxNewCheckBox);
	
///////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		JTextPane textPaneTela1 = new JTextPane();
		textPaneTela1.setBackground(new Color(240, 240, 240));
		textPaneTela1.setEditable(false);
		textPaneTela1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		textPaneTela1.setText("Fale conosco: programais+@gmail.com");
		textPaneTela1.setBounds(10, 385, 317, 27);
		getContentPane().add(textPaneTela1);
		
		JTextPane texttela1_1 = new JTextPane();
		texttela1_1.setBackground(new Color(240, 240, 240));
		texttela1_1.setText("Nesta plataforma voce ira da seus primeiros passos na linguagem de programção em python,treinando seu pensamento computacional e aprendendo estruturas basicas de programção.\r\n");
		texttela1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		texttela1_1.setEditable(false);
		texttela1_1.setBounds(89, 108, 425, 101);
		getContentPane().add(texttela1_1);
		
		senhaTELA1 = new JTextField();
		senhaTELA1.setBounds(554, 245, 179, 27);
		getContentPane().add(senhaTELA1);
		senhaTELA1.setColumns(10);
	
		
		
	}
}
