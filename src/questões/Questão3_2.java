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

public class Questão3_2 extends JFrame {
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
					Questão3_2 frame = new Questão3_2();
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
	public Questão3_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(new Dimension(1175, 696));
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQuesto_1 = new JLabel("Questão 2");
		lblQuesto_1.setForeground(new Color(255, 204, 0));
		lblQuesto_1.setFont(new Font("Consolas", Font.PLAIN, 50));
		lblQuesto_1.setBounds(429, 0, 284, 66);
		contentPane.add(lblQuesto_1);
		
		JTextPane txtpnI = new JTextPane();
		txtpnI.setForeground(new Color(255, 204, 0));
		txtpnI.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtpnI.setBackground(new Color(0, 102, 204));
		txtpnI.setText("i = 0\r\n    while i < 3:\r\n    i = i + 1\r\n    print(i)\r\n\r\nAssinale a opção que apresenta o resultado do código acima, após a sua execução. ");
		txtpnI.setFont(new Font("Consolas", Font.PLAIN, 35));
		txtpnI.setEditable(false);
		txtpnI.setBounds(40, 90, 1076, 304);
		contentPane.add(txtpnI);
		
		JRadioButton rdbtnA = new JRadioButton("3");
		rdbtnA.setForeground(new Color(255, 204, 0));
		rdbtnA.setBackground(new Color(0, 102, 204));
		rdbtnA.setFont(new Font("Consolas", Font.PLAIN, 35));
		rdbtnA.setBounds(22, 405, 193, 49);
		contentPane.add(rdbtnA);
		
		JRadioButton rdbtnB = new JRadioButton("5");
		rdbtnB.setForeground(new Color(255, 204, 0));
		rdbtnB.setBackground(new Color(0, 102, 204));
		rdbtnB.setFont(new Font("Consolas", Font.PLAIN, 35));
		rdbtnB.setBounds(22, 458, 193, 49);
		contentPane.add(rdbtnB);
		
		JRadioButton rdbtnC = new JRadioButton("0 1 2");
		rdbtnC.setForeground(new Color(255, 204, 0));
		rdbtnC.setBackground(new Color(0, 102, 204));
		rdbtnC.setFont(new Font("Consolas", Font.PLAIN, 35));
		rdbtnC.setBounds(22, 509, 193, 49);
		contentPane.add(rdbtnC);
		
		JRadioButton rdbtnD = new JRadioButton("0 1 2 3");
		rdbtnD.setForeground(new Color(255, 204, 0));
		rdbtnD.setBackground(new Color(0, 102, 204));
		rdbtnD.setFont(new Font("Consolas", Font.PLAIN, 35));
		rdbtnD.setBounds(22, 560, 193, 49);
		contentPane.add(rdbtnD);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnVerificar.setBounds(488, 590, 185, 49);
		contentPane.add(btnVerificar);
		
		JButton btnProximo = new JButton("Próximo");
		btnProximo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnProximo.setEnabled(false);
		btnProximo.setBounds(995, 586, 144, 49);
		contentPane.add(btnProximo);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblResposta.setBounds(436, 466, 277, 41);
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
				if( rdbtnA.isSelected()) {
					lblResposta.setText("Correto!");
					lblResposta.setForeground(new Color(0, 255, 0));

					rdbtnA.setEnabled(false);
					rdbtnB.setEnabled(false);
					rdbtnC.setEnabled(false);
					rdbtnD.setEnabled(false);
					btnVerificar.setEnabled(false);
					btnProximo.setEnabled(true);
					
				}
				if( rdbtnD.isSelected() ||  rdbtnB.isSelected() ||  rdbtnC.isSelected()) {
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
					Questão3_3 q3 = new Questão3_3();
					q3.setVisible(true);
				}
			}
		});
	}

}