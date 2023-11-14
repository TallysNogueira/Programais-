package questões;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.BorderFactory;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;

import hud.HUD;

public class Questão1_5 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questão1_5 frame = new Questão1_5();
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
	public Questão1_5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1093, 555);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Questão 5");
		lblNewLabel.setForeground(new Color(255, 204, 0));
		lblNewLabel.setBackground(new Color(0, 128, 192));
		lblNewLabel.setFont(new Font("Consolas", Font.PLAIN, 40));
		lblNewLabel.setBounds(422, 0, 234, 49);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnPergunta = new JTextPane();
		txtpnPergunta.setForeground(new Color(255, 204, 0));
		txtpnPergunta.setEditable(false);
		txtpnPergunta.setFont(new Font("Consolas", Font.PLAIN, 25));
		txtpnPergunta.setText("O código a seguir está sintaticamente correto e atende à necessidade do usuário?");
		txtpnPergunta.setBounds(131, 43, 713, 66);
		contentPane.add(txtpnPergunta);
		txtpnPergunta.setBackground(new Color(0, 128, 192));
		
		JTextPane txtpncodigo = new JTextPane();
		txtpncodigo.setForeground(new Color(255, 204, 0));
		txtpncodigo.setEditable(false);
		txtpncodigo.setFont(new Font("Courier New", Font.PLAIN, 28));
		txtpncodigo.setText("PI = 3.14159\r\nraio = float(input('Digite o raio do círculo:'))\r\narea = PI * raio ** 2\r\nperimetro = 2 * PI * raio\r\nprint('A área do círculo é:', area)\r\nprint('O perímetro do círculo é:', perimetro)");
		txtpncodigo.setBounds(131, 113, 824, 234);
		contentPane.add(txtpncodigo);
		txtpncodigo.setBackground(new Color(0, 128, 192));
		txtpncodigo.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JRadioButton rdbtnA = new JRadioButton("Certo");
		rdbtnA.setForeground(new Color(255, 204, 0));
		rdbtnA.setBackground(new Color(0, 128, 192));
		rdbtnA.setFont(new Font("Consolas", Font.PLAIN, 35));
		rdbtnA.setBounds(119, 357, 234, 49);
		contentPane.add(rdbtnA);
		
		JRadioButton rdbtnB = new JRadioButton("Errado");
		rdbtnB.setForeground(new Color(255, 204, 0));
		rdbtnB.setBackground(new Color(0, 128, 192));
		rdbtnB.setFont(new Font("Consolas", Font.PLAIN, 35));
		rdbtnB.setBounds(119, 408, 163, 48);
		contentPane.add(rdbtnB);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnVerificar.setBounds(10, 459, 185, 49);
		contentPane.add(btnVerificar);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setBackground(new Color(0, 128, 192));
		lblResposta.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblResposta.setBounds(356, 384, 499, 58);
		contentPane.add(lblResposta);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				HUD tela = new HUD();
				tela.setVisible(true);
			}
		});
		btnFinalizar.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnFinalizar.setEnabled(false);
		btnFinalizar.setBounds(925, 459, 144, 49);
		contentPane.add(btnFinalizar);
		
		rdbtnA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				rdbtnB.setSelected(false);
		
			
			}
		});
		rdbtnB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnA.setSelected(false);
			

			}
	
		});
		
		btnVerificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if( rdbtnA.isSelected()) {
					lblResposta.setText("Resposta Certa!");
					lblResposta.setForeground(new Color(0, 255, 0));
					btnFinalizar.setEnabled(true);
					btnVerificar.setEnabled(false);
					rdbtnA.setEnabled(false);
					rdbtnB.setEnabled(false);
					
				}
				if( rdbtnB.isSelected() ) {
					lblResposta.setText("Resposta Incorreta");
					lblResposta.setForeground(new Color(255,0,0));
					btnVerificar.setEnabled(false);
					rdbtnA.setEnabled(false);
					rdbtnB.setEnabled(false);
					btnFinalizar.setEnabled(true);

				}
			}
		});
	}
}