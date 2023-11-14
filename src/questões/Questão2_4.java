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

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.border.BevelBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Questão2_4 extends JFrame {
boolean prox = true;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questão2_4 frame = new Questão2_4();
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
	public Questão2_4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(new Dimension(1156, 692));
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblQuesto = new JLabel("Questão 4");
		lblQuesto.setForeground(new Color(0, 102, 255));
		lblQuesto.setBounds(437, 5, 289, 66);
		lblQuesto.setFont(new Font("Consolas", Font.PLAIN, 50));
		
		JTextPane txtpnN = new JTextPane();
		txtpnN.setForeground(new Color(0, 102, 255));
		txtpnN.setBounds(71, 81, 980, 367);
		txtpnN.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtpnN.setBackground(new Color(255, 204, 0));
		txtpnN.setText("n = 10\r\n\r\nif n < 3:\r\n    print(n-1)\r\nelse:\r\n    print (n * 9 * 8 * 7 / 3 % 4)\r\n\r\nQual será o resultado após a execução do programa acima?");
		txtpnN.setFont(new Font("Consolas", Font.PLAIN, 35));
		txtpnN.setEditable(false);
		
		JRadioButton rdbtnA = new JRadioButton("Erro");
		rdbtnA.setForeground(new Color(0, 102, 255));
		rdbtnA.setBounds(133, 482, 176, 49);
		rdbtnA.setBackground(new Color(255, 204, 0));
		rdbtnA.setFont(new Font("Consolas", Font.PLAIN, 40));
		
		JRadioButton rdbtnB = new JRadioButton("1680");
		rdbtnB.setForeground(new Color(0, 102, 255));
		rdbtnB.setBounds(361, 482, 193, 49);
		rdbtnB.setBackground(new Color(255, 204, 0));
		rdbtnB.setFont(new Font("Consolas", Font.PLAIN, 40));
		
		JRadioButton rdbtnC = new JRadioButton("5040");
		rdbtnC.setForeground(new Color(0, 102, 255));
		rdbtnC.setBounds(620, 482, 193, 49);
		rdbtnC.setBackground(new Color(255, 204, 0));
		rdbtnC.setFont(new Font("Consolas", Font.PLAIN, 40));
		
		JRadioButton rdbtnD = new JRadioButton("0");
		rdbtnD.setForeground(new Color(0, 102, 255));
		rdbtnD.setBounds(880, 482, 154, 49);
		rdbtnD.setBackground(new Color(255, 204, 0));
		rdbtnD.setFont(new Font("Consolas", Font.PLAIN, 40));
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setBounds(10, 601, 185, 49);
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JButton btnProximo = new JButton("Próximo");
		btnProximo.setBounds(988, 603, 144, 49);
		btnProximo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnProximo.setEnabled(false);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setBounds(423, 551, 168, 41);
		lblResposta.setFont(new Font("Tahoma", Font.PLAIN, 40));
		contentPane.setLayout(null);
		contentPane.add(lblQuesto);
		contentPane.add(txtpnN);
		contentPane.add(rdbtnA);
		contentPane.add(rdbtnB);
		contentPane.add(rdbtnC);
		contentPane.add(rdbtnD);
		contentPane.add(btnVerificar);
		contentPane.add(btnProximo);
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
				if( rdbtnD.isSelected()) {
					lblResposta.setText("Correto!");
					lblResposta.setForeground(new Color(0, 255, 0));
					btnProximo.setEnabled(true);
					btnVerificar.setEnabled(false);
					rdbtnA.setEnabled(false);
					rdbtnB.setEnabled(false);
					rdbtnC.setEnabled(false);
					rdbtnD.setEnabled(false);

					
				}
				if( rdbtnA.isSelected() ||  rdbtnB.isSelected() ||  rdbtnC.isSelected()) {
					lblResposta.setText("Errado!!");
					lblResposta.setForeground(new Color(255,0,0));
					btnProximo.setEnabled(true);
					btnVerificar.setEnabled(false);
					rdbtnA.setEnabled(false);
					rdbtnB.setEnabled(false);
					rdbtnC.setEnabled(false);
					rdbtnD.setEnabled(false);

				}
				prox = true;
			}
		});
		btnProximo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(prox == true) {
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();
				Questão2_5 q5 = new Questão2_5();
				q5.setVisible(true);
				}
			}
		});
		
	}

}