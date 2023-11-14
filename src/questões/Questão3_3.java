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

public class Questão3_3 extends JFrame {
boolean prox = false;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questão3_3 frame = new Questão3_3();
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
	public Questão3_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(new Dimension(1084, 684));
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQuesto_1 = new JLabel("Questão 3");
		lblQuesto_1.setForeground(new Color(255, 204, 0));
		lblQuesto_1.setFont(new Font("Consolas", Font.PLAIN, 50));
		lblQuesto_1.setBounds(401, 0, 268, 66);
		contentPane.add(lblQuesto_1);
		
		JTextPane txtpnForIIn = new JTextPane();
		txtpnForIIn.setForeground(new Color(255, 204, 0));
		txtpnForIIn.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtpnForIIn.setBackground(new Color(0, 102, 204));
		txtpnForIIn.setText("Qual será a saída no console após a execução do comando abaixo?\r\n\r\nfor i in range(-2,-5,-2):\r\n    print(i)\r\n");
		txtpnForIIn.setFont(new Font("Consolas", Font.PLAIN, 40));
		txtpnForIIn.setEditable(false);
		txtpnForIIn.setBounds(134, 96, 801, 259);
		contentPane.add(txtpnForIIn);
		
		JRadioButton rdbtnA = new JRadioButton("-2,-5");
		rdbtnA.setForeground(new Color(255, 204, 0));
		rdbtnA.setBackground(new Color(0, 102, 204));
		rdbtnA.setFont(new Font("Consolas", Font.PLAIN, 35));
		rdbtnA.setBounds(71, 423, 193, 49);
		contentPane.add(rdbtnA);
		
		JRadioButton rdbtnB = new JRadioButton("-2,-4");
		rdbtnB.setForeground(new Color(255, 204, 0));
		rdbtnB.setBackground(new Color(0, 102, 204));
		rdbtnB.setFont(new Font("Consolas", Font.PLAIN, 35));
		rdbtnB.setBounds(71, 474, 193, 49);
		contentPane.add(rdbtnB);
		
		JRadioButton rdbtnC = new JRadioButton("-2,-7");
		rdbtnC.setForeground(new Color(255, 204, 0));
		rdbtnC.setBackground(new Color(0, 102, 204));
		rdbtnC.setFont(new Font("Consolas", Font.PLAIN, 35));
		rdbtnC.setBounds(71, 525, 193, 49);
		contentPane.add(rdbtnC);
		
		JRadioButton rdbtnD = new JRadioButton("-2");
		rdbtnD.setForeground(new Color(255, 204, 0));
		rdbtnD.setBackground(new Color(0, 102, 204));
		rdbtnD.setFont(new Font("Consolas", Font.PLAIN, 35));
		rdbtnD.setBounds(71, 576, 193, 49);
		contentPane.add(rdbtnD);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnVerificar.setBounds(419, 578, 185, 49);
		contentPane.add(btnVerificar);
		
		JButton btnProximo = new JButton("Próximo");
		btnProximo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnProximo.setEnabled(false);
		btnProximo.setBounds(916, 580, 144, 49);
		contentPane.add(btnProximo);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblResposta.setBounds(383, 442, 315, 41);
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
				if( rdbtnB.isSelected()) {
					lblResposta.setText("Correto!");
					lblResposta.setForeground(new Color(0, 255, 0));
					rdbtnA.setEnabled(false);
					rdbtnB.setEnabled(false);
					rdbtnC.setEnabled(false);
					rdbtnD.setEnabled(false);
					btnVerificar.setEnabled(false);
					btnProximo.setEnabled(true);
					
				}
				if( rdbtnD.isSelected() ||  rdbtnA.isSelected() ||  rdbtnC.isSelected()) {
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
		
		btnProximo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(prox == true) {
					dispose();
					Questão3_4 q4 = new Questão3_4();
					q4.setVisible(true);
				}
			}
		});
	}

}