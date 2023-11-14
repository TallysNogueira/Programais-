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
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class Questão1_4 extends JFrame {
boolean prox = false;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questão1_4 frame = new Questão1_4();
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
	public Questão1_4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1151, 576);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setMaximumSize(getMaximumSize());

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltitulo = new JLabel("Questão 4");
		lbltitulo.setForeground(new Color(255, 204, 0));
		lbltitulo.setFont(new Font("Consolas", Font.PLAIN, 40));
		lbltitulo.setBounds(449, 10, 238, 49);
		contentPane.add(lbltitulo);
		
		JTextPane txtpnNFloatinputnota = new JTextPane();
		txtpnNFloatinputnota.setForeground(new Color(255, 204, 0));
		txtpnNFloatinputnota.setEditable(false);
		txtpnNFloatinputnota.setFont(new Font("Consolas", Font.PLAIN, 27));
		txtpnNFloatinputnota.setText("n1 = float(input(\"nota 1:\")\r\nn2=float(input(\"nota 2\")\r\nx = n1 + n2/ 2\r\nprint(x)\r\n\r\nSe n1 for igual a 3 e n2 igual a 7,qual será a saída da \r\noperação(x) no console?");
		txtpnNFloatinputnota.setBounds(133, 58, 897, 245);
		contentPane.add(txtpnNFloatinputnota);
		txtpnNFloatinputnota.setBackground(new Color(0, 128, 192));
		txtpnNFloatinputnota.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		
		JRadioButton rdbtnA = new JRadioButton("a)6.5");
		rdbtnA.setForeground(new Color(255, 204, 0));
		rdbtnA.setBackground(new Color(0, 128, 192));
		rdbtnA.setFont(new Font("Consolas", Font.PLAIN, 32));
		rdbtnA.setBounds(176, 410, 144, 37);
		contentPane.add(rdbtnA);
		
		JRadioButton rdbtnB = new JRadioButton("b)5");
		rdbtnB.setForeground(new Color(255, 204, 0));
		rdbtnB.setBackground(new Color(0, 128, 192));
		rdbtnB.setFont(new Font("Consolas", Font.PLAIN, 32));
		rdbtnB.setBounds(396, 411, 103, 35);
		contentPane.add(rdbtnB);
		
		JRadioButton rdbtnC = new JRadioButton("c)3.5");
		rdbtnC.setForeground(new Color(255, 204, 0));
		rdbtnC.setBackground(new Color(0, 128, 192));
		rdbtnC.setFont(new Font("Consolas", Font.PLAIN, 32));
		rdbtnC.setBounds(596, 409, 144, 38);
		contentPane.add(rdbtnC);
		
		JRadioButton rdbtnD = new JRadioButton("d)4");
		rdbtnD.setForeground(new Color(255, 204, 0));
		rdbtnD.setBackground(new Color(0, 128, 192));
		rdbtnD.setFont(new Font("Consolas", Font.PLAIN, 32));
		rdbtnD.setBounds(828, 409, 103, 39);
		contentPane.add(rdbtnD);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnVerificar.setBounds(10, 480, 185, 49);
		contentPane.add(btnVerificar);
		
		JButton btnProximo = new JButton("Próximo");
		btnProximo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnProximo.setEnabled(false);
		btnProximo.setBounds(983, 480, 144, 49);
		contentPane.add(btnProximo);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblResposta.setBounds(431, 313, 275, 41);
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
					btnProximo.setEnabled(true);
					btnVerificar.setEnabled(false);
					rdbtnA.setEnabled(false);
					rdbtnB.setEnabled(false);
					rdbtnC.setEnabled(false);
					rdbtnD.setEnabled(false);
					
				}
				if( rdbtnD.isSelected() ||  rdbtnB.isSelected() ||  rdbtnC.isSelected()) {
					lblResposta.setText("Errado!!");
					lblResposta.setForeground(new Color(255,0,0));
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
				Questão1_5 q5 = new Questão1_5();
				q5.setVisible(true);
				}
			}
		});
	}
}