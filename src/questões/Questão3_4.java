package questões;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class Questão3_4 extends JFrame {
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
					Questão3_4 frame = new Questão3_4();
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
	public Questão3_4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(new Dimension(1116, 645));
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQuesto_1 = new JLabel("Questão 4");
		lblQuesto_1.setForeground(new Color(255, 204, 0));
		lblQuesto_1.setFont(new Font("Consolas", Font.PLAIN, 50));
		lblQuesto_1.setBounds(429, 2, 278, 66);
		contentPane.add(lblQuesto_1);
		
		JTextPane txtpnLetrasp = new JTextPane();
		txtpnLetrasp.setForeground(new Color(255, 204, 0));
		txtpnLetrasp.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtpnLetrasp.setBackground(new Color(0, 102, 204));
		txtpnLetrasp.setText("letras == \"P\" , \"F\"\r\nfor x in letras:\r\n    print(x)\r\n\r\nA Saída no console será:");
		txtpnLetrasp.setFont(new Font("Consolas", Font.PLAIN, 35));
		txtpnLetrasp.setEditable(false);
		txtpnLetrasp.setBounds(259, 78, 584, 229);
		contentPane.add(txtpnLetrasp);
		
		JRadioButton rdbtnA = new JRadioButton("PF");
		rdbtnA.setForeground(new Color(255, 204, 0));
		rdbtnA.setBackground(new Color(0, 102, 204));
		rdbtnA.setFont(new Font("Consolas", Font.PLAIN, 30));
		rdbtnA.setBounds(142, 412, 97, 49);
		contentPane.add(rdbtnA);
		
		JRadioButton rdbtnB = new JRadioButton("X");
		rdbtnB.setForeground(new Color(255, 204, 0));
		rdbtnB.setBackground(new Color(0, 102, 204));
		rdbtnB.setFont(new Font("Consolas", Font.PLAIN, 30));
		rdbtnB.setBounds(276, 412, 103, 49);
		contentPane.add(rdbtnB);
		
		JRadioButton rdbtnC = new JRadioButton("Não será executado");
		rdbtnC.setForeground(new Color(255, 204, 0));
		rdbtnC.setBackground(new Color(0, 102, 204));
		rdbtnC.setFont(new Font("Consolas", Font.PLAIN, 30));
		rdbtnC.setBounds(403, 412, 333, 49);
		contentPane.add(rdbtnC);
		
		JRadioButton rdbtnD = new JRadioButton("\"P\" \"F\"");
		rdbtnD.setForeground(new Color(255, 204, 0));
		rdbtnD.setBackground(new Color(0, 102, 204));
		rdbtnD.setFont(new Font("Consolas", Font.PLAIN, 30));
		rdbtnD.setBounds(783, 412, 144, 49);
		contentPane.add(rdbtnD);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnVerificar.setBounds(448, 546, 185, 49);
		contentPane.add(btnVerificar);
		
		JButton btnProximo = new JButton("Próximo");
		btnProximo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(prox == true) {
					dispose();
					Questão3_5 q5 = new Questão3_5();
					q5.setVisible(true);
				}
			}
		});
		btnProximo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnProximo.setEnabled(false);
		btnProximo.setBounds(931, 548, 144, 49);
		contentPane.add(btnProximo);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblResposta.setBounds(403, 336, 278, 41);
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
					btnProximo.setEnabled(true);
					
				}
				if( rdbtnD.isSelected() ||  rdbtnA.isSelected() ||  rdbtnB.isSelected()) {
					lblResposta.setText("Errado!!");
					lblResposta.setForeground(new Color(255,0,0));
					rdbtnA.setEnabled(false);
					rdbtnB.setEnabled(false);
					rdbtnC.setEnabled(false);
					rdbtnD.setEnabled(false);
					btnVerificar.setEnabled(false);
					btnProximo.setEnabled(true);

				}
				prox = true;
			}
		});
	}

}