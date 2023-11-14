package questões;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class Questão2_2 extends JFrame {
boolean prox = false;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questão2_2 frame = new Questão2_2();
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
	public Questão2_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1127, 559);
		setSize(new Dimension(1166, 584));
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Questão 2");
		lblNewLabel.setForeground(new Color(0, 153, 255));
		lblNewLabel.setFont(new Font("Consolas", Font.PLAIN, 45));
		lblNewLabel.setBounds(453, 10, 246, 49);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnAsEstruturasSe = new JTextPane();
		txtpnAsEstruturasSe.setForeground(new Color(0, 153, 255));
		txtpnAsEstruturasSe.setBackground(new Color(255, 204, 0));
		txtpnAsEstruturasSe.setEditable(false);
		txtpnAsEstruturasSe.setFont(new Font("Consolas", Font.PLAIN, 35));
		txtpnAsEstruturasSe.setText("As estruturas se e senão são estruturas de repetição utilizadas nas situações em que, caso determinada condição seja alcançada, um comando é realizado, caso contrário, outro comando é executado.");
		txtpnAsEstruturasSe.setBounds(57, 91, 1060, 178);
		txtpnAsEstruturasSe.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(txtpnAsEstruturasSe);
		
		JRadioButton rdbtnA = new JRadioButton("Certo");
		rdbtnA.setForeground(new Color(0, 153, 255));
		rdbtnA.setBackground(new Color(255, 204, 0));
		rdbtnA.setFont(new Font("Consolas", Font.PLAIN, 45));
		rdbtnA.setBounds(57, 300, 166, 49);
		contentPane.add(rdbtnA);
		
		JRadioButton rdbtnB = new JRadioButton("Errado");
		rdbtnB.setForeground(new Color(0, 153, 255));
		rdbtnB.setBackground(new Color(255, 204, 0));
		rdbtnB.setFont(new Font("Consolas", Font.PLAIN, 45));
		rdbtnB.setBounds(57, 364, 199, 49);
		contentPane.add(rdbtnB);
		setMaximumSize(getMaximumSize());
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnVerificar.setBounds(10, 477, 185, 51);
		contentPane.add(btnVerificar);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblResposta.setBounds(343, 300, 411, 58);
		contentPane.add(lblResposta);
		
		JButton btnProximo = new JButton("Próximo");
		btnProximo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnProximo.setEnabled(false);
		btnProximo.setBounds(957, 479, 185, 49);
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
				Questão2_3 q3 = new Questão2_3();
				q3.setVisible(true);
				}
			}
		});

	}
}