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

public class Questão2_3 extends JFrame {
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
					Questão2_3 frame = new Questão2_3();
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
	public Questão2_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1094, 555);
		setSize(new Dimension(1134, 597));
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Questão 3");
		lblNewLabel.setForeground(new Color(0, 102, 255));
		lblNewLabel.setFont(new Font("Consolas", Font.PLAIN, 45));
		lblNewLabel.setBounds(432, 11, 245, 49);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnIf = new JTextPane();
		txtpnIf.setForeground(new Color(0, 102, 255));
		txtpnIf.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtpnIf.setBackground(new Color(255, 204, 0));
		txtpnIf.setEditable(false);
		txtpnIf.setFont(new Font("Consolas", Font.PLAIN, 35));
		txtpnIf.setText("if 5 > 2 \r\n{\r\n    print(\"TRUE!\")\r\n}\r\n\r\nNa saída de dados irá aparecer uma mensagem na tela escrito TRUE! ?");
		txtpnIf.setBounds(66, 82, 986, 319);
		contentPane.add(txtpnIf);
		
		JRadioButton rdbtnA = new JRadioButton("Certo");
		rdbtnA.setBackground(new Color(255, 204, 0));
		rdbtnA.setForeground(new Color(0, 102, 255));
		rdbtnA.setFont(new Font("Consolas", Font.PLAIN, 35));
		rdbtnA.setBounds(52, 422, 137, 49);
		contentPane.add(rdbtnA);
		
		JRadioButton rdbtnB = new JRadioButton("Errado");
		rdbtnB.setBackground(new Color(255, 204, 0));
		rdbtnB.setForeground(new Color(0, 102, 255));
		rdbtnB.setFont(new Font("Consolas", Font.PLAIN, 35));
		rdbtnB.setBounds(52, 492, 144, 49);
		contentPane.add(rdbtnB);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnVerificar.setBounds(403, 494, 185, 49);
		contentPane.add(btnVerificar);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblResposta.setBounds(324, 426, 411, 58);
		contentPane.add(lblResposta);
		
		JButton btnProximo = new JButton("Próximo");
		btnProximo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnProximo.setEnabled(false);
		btnProximo.setBounds(966, 496, 144, 49);
		contentPane.add(btnProximo);
		
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
					btnProximo.setEnabled(true);
					btnVerificar.setEnabled(false);
					rdbtnA.setEnabled(false);
					rdbtnB.setEnabled(false);
					
				}
				if( rdbtnB.isSelected() ) {
					lblResposta.setText("Resposta Incorreta");
					lblResposta.setForeground(new Color(255,0,0));
					btnProximo.setEnabled(true);
					btnVerificar.setEnabled(false);
					rdbtnA.setEnabled(false);
					rdbtnB.setEnabled(false);

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
				Questão2_4 q4 = new Questão2_4();
				q4.setVisible(true);
				}
			}
		});
	}

}