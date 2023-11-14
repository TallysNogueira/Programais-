package questões;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import hud.HUD;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextPane;
import javax.swing.JRadioButton;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.border.BevelBorder;

public class Questão2_5 extends JFrame {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
boolean prox = false;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questão2_5 frame = new Questão2_5();
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
	public Questão2_5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(new Dimension(1154, 727));
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQuesto = new JLabel("Questão 4");
		lblQuesto.setForeground(new Color(0, 102, 255));
		lblQuesto.setBackground(new Color(255, 204, 0));
		lblQuesto.setBounds(420, 0, 257, 61);
		lblQuesto.setFont(new Font("Consolas", Font.PLAIN, 50));
		contentPane.add(lblQuesto);
		
		JTextPane txtpnA = new JTextPane();
		txtpnA.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtpnA.setForeground(new Color(0, 102, 255));
		txtpnA.setBackground(new Color(255, 204, 0));
		txtpnA.setText("a = 3\r\nb = 4\r\nc = 8\r\n\r\nsp = (a +b + c)/2\r\nar = sp * (sp - a) * (sp - b) * (sp - c)\r\n\r\nif ar < 0:\r\n    print(\"Não é possível obter o resultado\")\r\nelse:\r\n    print( ar ** (1/2) ) #Função que mostra a raiz quadrada de ar\r\n\r\nApós a execução do programa irá aparecer o resultado 10.986?\r\n");
		txtpnA.setFont(new Font("Consolas", Font.PLAIN, 26));
		txtpnA.setEditable(false);
		txtpnA.setBounds(121, 66, 898, 461);
		contentPane.add(txtpnA);
		
		JRadioButton rdbtnA = new JRadioButton("Certo");
		rdbtnA.setForeground(new Color(0, 102, 255));
		rdbtnA.setBackground(new Color(255, 204, 0));
		rdbtnA.setFont(new Font("Consolas", Font.PLAIN, 35));
		rdbtnA.setBounds(115, 533, 193, 49);
		contentPane.add(rdbtnA);
		
		JRadioButton rdbtnB = new JRadioButton("Errado");
		rdbtnB.setForeground(new Color(0, 102, 255));
		rdbtnB.setBackground(new Color(255, 204, 0));
		rdbtnB.setFont(new Font("Consolas", Font.PLAIN, 35));
		rdbtnB.setBounds(310, 533, 193, 49);
		contentPane.add(rdbtnB);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnVerificar.setBounds(10, 631, 185, 49);
		contentPane.add(btnVerificar);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblResposta.setBounds(332, 588, 411, 58);
		contentPane.add(lblResposta);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnFinalizar.setEnabled(false);
		btnFinalizar.setBounds(969, 631, 161, 49);
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
				if( rdbtnB.isSelected()) {
					lblResposta.setText("Resposta Certa!");
					lblResposta.setForeground(new Color(0, 255, 0));
					btnFinalizar.setEnabled(true);
					btnVerificar.setEnabled(false);
					rdbtnA.setEnabled(false);
					rdbtnB.setEnabled(false);
					
				}
				if( rdbtnA.isSelected() ) {
					lblResposta.setText("Resposta Incorreta");
					lblResposta.setForeground(new Color(255,0,0));
					btnFinalizar.setEnabled(true);
					btnVerificar.setEnabled(false);
					rdbtnA.setEnabled(false);
					rdbtnB.setEnabled(false);

				}
				prox = true;
			}
		});
		
		btnFinalizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(prox == true) {
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();
				HUD tela = new HUD();
				tela.setVisible(true);
			
				}
			}
		});
		
	}
	}

