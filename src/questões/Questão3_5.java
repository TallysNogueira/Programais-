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
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class Questão3_5 extends JFrame {
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
					Questão3_5 frame = new Questão3_5();
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
	public Questão3_5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(new Dimension(1234, 597));
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQuesto_1 = new JLabel("Questão 5");
		lblQuesto_1.setForeground(new Color(255, 204, 0));
		lblQuesto_1.setFont(new Font("Consolas", Font.PLAIN, 50));
		lblQuesto_1.setBounds(488, 10, 262, 66);
		contentPane.add(lblQuesto_1);
		
		JTextPane txtpnAEstruturaDe = new JTextPane();
		txtpnAEstruturaDe.setForeground(new Color(255, 204, 0));
		txtpnAEstruturaDe.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtpnAEstruturaDe.setBackground(new Color(0, 102, 204));
		txtpnAEstruturaDe.setText("A Estrutura de repetição que é usada para execuções com final não determinado recebe o nome de:");
		txtpnAEstruturaDe.setFont(new Font("Consolas", Font.PLAIN, 35));
		txtpnAEstruturaDe.setEditable(false);
		txtpnAEstruturaDe.setBounds(41, 98, 1137, 101);
		contentPane.add(txtpnAEstruturaDe);
		
		JRadioButton rdbtnA = new JRadioButton("for");
		rdbtnA.setForeground(new Color(255, 204, 0));
		rdbtnA.setBackground(new Color(0, 102, 204));
		rdbtnA.setFont(new Font("Consolas", Font.PLAIN, 35));
		rdbtnA.setBounds(28, 218, 193, 49);
		contentPane.add(rdbtnA);
		
		JRadioButton rdbtnB = new JRadioButton("range");
		rdbtnB.setForeground(new Color(255, 204, 0));
		rdbtnB.setBackground(new Color(0, 102, 204));
		rdbtnB.setFont(new Font("Consolas", Font.PLAIN, 35));
		rdbtnB.setBounds(28, 279, 193, 49);
		contentPane.add(rdbtnB);
		
		JRadioButton rdbtnC = new JRadioButton("while");
		rdbtnC.setForeground(new Color(255, 204, 0));
		rdbtnC.setBackground(new Color(0, 102, 204));
		rdbtnC.setFont(new Font("Consolas", Font.PLAIN, 35));
		rdbtnC.setBounds(28, 330, 193, 49);
		contentPane.add(rdbtnC);
		
		JRadioButton rdbtnD = new JRadioButton("do-while");
		rdbtnD.setForeground(new Color(255, 204, 0));
		rdbtnD.setBackground(new Color(0, 102, 204));
		rdbtnD.setFont(new Font("Consolas", Font.PLAIN, 35));
		rdbtnD.setBounds(28, 384, 193, 49);
		contentPane.add(rdbtnD);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnVerificar.setBounds(10, 503, 185, 49);
		contentPane.add(btnVerificar);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(prox == true) {
					dispose();
					HUD tela = new HUD();
					tela.setVisible(true);
					tela.setLocationRelativeTo(null);
				}
			}
		});
		btnFinalizar.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnFinalizar.setEnabled(false);
		btnFinalizar.setBounds(1066, 505, 144, 49);
		contentPane.add(btnFinalizar);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblResposta.setBounds(453, 314, 221, 41);
		contentPane.add(lblResposta);
		
		
		
		
		rdbtnA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				rdbtnB.setSelected(false);
				rdbtnC.setSelected(false);
				rdbtnD.setSelected(false);
			
			}
		});
		rdbtnB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnA.setSelected(false);
				rdbtnC.setSelected(false);
				rdbtnD.setSelected(false);

			}
		});
		rdbtnC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnA.setSelected(false);
				rdbtnB.setSelected(false);
				rdbtnD.setSelected(false);

			}
		});
		rdbtnD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnA.setSelected(false);
				rdbtnB.setSelected(false);
				rdbtnC.setSelected(false);

			}
		});
		
		
		btnVerificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if( rdbtnC.isSelected()) {
					lblResposta.setText("Correto!");
					lblResposta.setForeground(new Color(0, 255, 0));
					rdbtnA.setEnabled(false);
					rdbtnB.setEnabled(false);
					rdbtnC.setEnabled(false);
					rdbtnD.setEnabled(false);
					btnVerificar.setEnabled(false);
					btnFinalizar.setEnabled(true);
				}
				if( rdbtnD.isSelected() ||  rdbtnA.isSelected() ||  rdbtnB.isSelected()) {
					lblResposta.setText("Errado!!");
					lblResposta.setForeground(new Color(255,0,0));
					rdbtnA.setEnabled(false);
					rdbtnB.setEnabled(false);
					rdbtnC.setEnabled(false);
					rdbtnD.setEnabled(false);
					btnVerificar.setEnabled(false);
					btnFinalizar.setEnabled(true);
				}
				prox = true;
			}
		});
	}

}