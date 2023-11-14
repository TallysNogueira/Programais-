package questões;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class Questão1_3 extends JFrame {
	boolean prox = false;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questão1_3 frame = new Questão1_3();
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
	public Questão1_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1073, 572);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setMaximumSize(getMaximumSize());

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnSelecioneAOpo = new JTextPane();
		txtpnSelecioneAOpo.setForeground(new Color(255, 215, 0));
		txtpnSelecioneAOpo.setBackground(new Color(0, 128, 192));
		txtpnSelecioneAOpo.setEditable(false);
		txtpnSelecioneAOpo.setFont(new Font("Consolas", Font.PLAIN, 35));
		txtpnSelecioneAOpo.setText("Selecione a opção que represente uma string e um inteiro respectivamente\r\n");
		txtpnSelecioneAOpo.setBounds(49, 69, 961, 90);
		contentPane.add(txtpnSelecioneAOpo);
		
		JRadioButton rdbtnA = new JRadioButton("a)'string', 3.0");
		rdbtnA.setForeground(new Color(255, 215, 0));
		rdbtnA.setBackground(new Color(0, 128, 192));
			rdbtnA.setFont(new Font("Consolas", Font.PLAIN, 30));
		rdbtnA.setBounds(69, 193, 285, 51);
		contentPane.add(rdbtnA);
		
		JRadioButton rdbtnB = new JRadioButton("b)3.0, 'maçã'");
		rdbtnB.setForeground(new Color(255, 215, 0));
		rdbtnB.setBackground(new Color(0, 128, 192));
		rdbtnB.setFont(new Font("Consolas", Font.PLAIN, 30));
		rdbtnB.setBounds(69, 246, 284, 41);
		contentPane.add(rdbtnB);
		
		JRadioButton rdbtnC = new JRadioButton("c)'banana', 'uva'");
		rdbtnC.setForeground(new Color(255, 215, 0));
		rdbtnC.setBackground(new Color(0, 128, 192));
		rdbtnC.setFont(new Font("Consolas", Font.PLAIN, 30));
		rdbtnC.setBounds(70, 277, 333, 48);
		contentPane.add(rdbtnC);
		
		JRadioButton rdbtnD = new JRadioButton("d)'olá',3");
		rdbtnD.setForeground(new Color(255, 215, 0));
		rdbtnD.setBackground(new Color(0, 128, 192));
		rdbtnD.setFont(new Font("Consolas", Font.PLAIN, 30));
		rdbtnD.setBounds(70, 322, 284, 51);
		contentPane.add(rdbtnD);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnVerificar.setBounds(31, 463, 185, 49);
		contentPane.add(btnVerificar);
		
		JButton btnProximo = new JButton("Próximo");

		btnProximo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnProximo.setEnabled(false);
		btnProximo.setBounds(887, 465, 144, 49);
		contentPane.add(btnProximo);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setFont(new Font("Tahoma", Font.PLAIN, 45));
		lblResposta.setBounds(351, 387, 357, 41);
		contentPane.add(lblResposta);
		
		JLabel lblTitulo = new JLabel("Questão 3");
		lblTitulo.setForeground(new Color(255, 215, 0));
		lblTitulo.setFont(new Font("Consolas", Font.PLAIN, 40));
		lblTitulo.setBounds(414, 10, 230, 49);
		contentPane.add(lblTitulo);
		
		
		
		
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
					btnVerificar.setEnabled(false);
					btnProximo.setEnabled(true);
					rdbtnA.setEnabled(false);
					rdbtnB.setEnabled(false);
					rdbtnC.setEnabled(false);
					rdbtnD.setEnabled(false);

					
				}
				if( rdbtnA.isSelected() ||  rdbtnB.isSelected() ||  rdbtnC.isSelected()) {
					lblResposta.setText("Errado!!");
					lblResposta.setForeground(new Color(255,0,0));
					btnVerificar.setEnabled(false);
					btnProximo.setEnabled(true);
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
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				dispose();
				Questão1_4 q4 = new Questão1_4();
				q4.setVisible(true);
				}
			}
		});
	
		
	}
}