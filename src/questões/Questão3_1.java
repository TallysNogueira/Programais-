package questões;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Questão3_1 extends JFrame {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
boolean pos1,pos2,pos3,pos4,pos5,pos6,pos7,pos8,pos9,pos10,prox = false;
boolean r1,r2,r3,r4,r5,r6,r7 = true;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questão3_1 frame = new Questão3_1();
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
	public Questão3_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 603);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(0, 102, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setSize(new Dimension(991, 631));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Questão 1");
		lblTitulo.setForeground(new Color(255, 204, 0));
		lblTitulo.setFont(new Font("Consolas", Font.PLAIN, 50));
		lblTitulo.setBounds(355, 10, 267, 61);
		contentPane.add(lblTitulo);
		
		JLabel lbl1 = new JLabel("for");
		lbl1.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/border.png")));
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl1.setBounds(78, 115, 102, 52);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("contagem");
		lbl2.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/border.png")));
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl2.setBounds(190, 115, 102, 52);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("in");
		lbl3.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/border.png")));
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl3.setBounds(302, 115, 102, 52);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("range");
		lbl4.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/border.png")));
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl4.setBounds(414, 115, 102, 52);
		contentPane.add(lbl4);
		
		JLabel lbl5 = new JLabel("");
		lbl5.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/border.png")));
		lbl5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl5.setBounds(529, 111, 108, 61);
		contentPane.add(lbl5);
		
		JLabel lblcontagem = new JLabel("10,-1,-1");
		lblcontagem.setBackground(new Color(30, 144, 255));
		lblcontagem.setForeground(new Color(255, 204, 0));
		lblcontagem.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblcontagem.setBounds(635, 121, 102, 32);
		contentPane.add(lblcontagem);
		
		JLabel lbl7 = new JLabel("print");
		lbl7.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/border.png")));
		lbl7.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl7.setBounds(157, 184, 102, 52);
		contentPane.add(lbl7);
		
		JLabel lbl8 = new JLabel("(");
		lbl8.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/border.png")));
		lbl8.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl8.setBounds(269, 184, 102, 52);
		contentPane.add(lbl8);
		
		JLabel lbl9 = new JLabel("contagem");
		lbl9.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/border.png")));
		lbl9.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl9.setBounds(381, 184, 102, 52);
		contentPane.add(lbl9);
		
		JLabel lbl10 = new JLabel(")");
		lbl10.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/border.png")));
		lbl10.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl10.setBounds(493, 183, 102, 54);
		contentPane.add(lbl10);
		
		JLabel lbl6 = new JLabel("");
		lbl6.setIcon(new ImageIcon("C:\\Users\\tally\\Desktop\\buttons\\border.png"));
		lbl6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl6.setBounds(747, 111, 108, 61);
		contentPane.add(lbl6);
		
		JLabel lblponto = new JLabel(":");
		lblponto.setForeground(new Color(0, 0, 255));
		lblponto.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblponto.setBounds(857, 125, 45, 42);
		contentPane.add(lblponto);
		
		JLabel lblFor = new JLabel("for");
		lblFor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(pos1 == false) {lbl1.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_for1.png")));lblFor.setVisible(false);pos1=true;r1 = true;}
				else if(pos2 == false) {lbl2.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_for1.png")));lblFor.setVisible(false);pos2=true;}
				else if(pos3 == false) {lbl3.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_for1.png")));lblFor.setVisible(false);pos3=true;}
				else if(pos4 == false) {lbl4.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_for1.png")));lblFor.setVisible(false);pos4=true;}
				else if(pos5 == false) {lbl5.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_for1.png")));lblFor.setVisible(false);pos5=true;}
				else if(pos6 == false) {lbl6.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_for1.png")));lblFor.setVisible(false);pos6=true;}
				else if(pos7 == false) {lbl7.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_for1.png")));lblFor.setVisible(false);pos7=true;}
				else if(pos8 == false) {lbl8.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_for1.png")));lblFor.setVisible(false);pos8=true;}
				else if(pos9 == false) {lbl9.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_for1.png")));lblFor.setVisible(false);pos9=true;}
				else if(pos10 == false) {lbl10.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_for1.png")));lblFor.setVisible(false);pos10=true;}
			}
		});
		lblFor.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_for1.png")));
		lblFor.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblFor.setBounds(168, 455, 108, 66);
		contentPane.add(lblFor);
		
		JLabel lbl_i = new JLabel("for");
		lbl_i.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(pos1 == false) {lbl1.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_i.png")));pos1=true;}
				else if(pos2 == false) {lbl2.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_i.png")));pos2=true;r2 = true;}
				else if(pos3 == false) {lbl3.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_i.png")));pos3=true;}
				else if(pos4 == false) {lbl4.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_i.png")));pos4=true;}
				else if(pos5 == false) {lbl5.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_i.png")));pos5=true;}
				else if(pos6 == false) {lbl6.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_i.png")));pos6=true;}
				else if(pos7 == false) {lbl7.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_i.png")));pos7=true;}
				else if(pos8 == false) {lbl8.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_i.png")));pos8=true;}
				else if(pos9 == false) {lbl9.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_i.png")));lbl_i.setVisible(false);pos9=true;r2=true;}
				else if(pos10 == false) {lbl10.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_i.png")));pos10=true;}
			}
		});
		lbl_i.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_i.png")));
		lbl_i.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl_i.setBounds(453, 400, 102, 52);
		contentPane.add(lbl_i);
		
		JLabel lblIn = new JLabel("for");
		lblIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(pos1 == false) {lbl1.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_in.png")));lblIn.setVisible(false);pos1=true;}
				else if(pos2 == false) {lbl2.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_in.png")));lblIn.setVisible(false);pos2=true;}
				else if(pos3 == false) {lbl3.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_in.png")));lblIn.setVisible(false);pos3=true;r3=true;}
				else if(pos4 == false) {lbl4.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_in.png")));lblIn.setVisible(false);pos4=true;}
				else if(pos5 == false) {lbl5.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_in.png")));lblIn.setVisible(false);pos5=true;}
				else if(pos6 == false) {lbl6.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_in.png")));lblIn.setVisible(false);pos6=true;}
				else if(pos7 == false) {lbl7.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_in.png")));lblIn.setVisible(false);pos7=true;}
				else if(pos8 == false) {lbl8.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_in.png")));lblIn.setVisible(false);pos8=true;}
				else if(pos9 == false) {lbl9.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_in.png")));lblIn.setVisible(false);pos9=true;}
				else if(pos10 == false) {lbl10.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_in.png")));lblIn.setVisible(false);pos10=true;}
			}
		});
		lblIn.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_in.png")));
		lblIn.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblIn.setBounds(229, 400, 102, 52);
		contentPane.add(lblIn);
		
		JLabel lblRange = new JLabel("for");
		lblRange.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(pos1 == false) {lbl1.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_range.png")));lblRange.setVisible(false);pos1=true;}
				else if(pos2 == false) {lbl2.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_range.png")));lblRange.setVisible(false);pos2=true;}
				else if(pos3 == false) {lbl3.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_range.png")));lblRange.setVisible(false);pos3=true;}
				else if(pos4 == false) {lbl4.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_range.png")));lblRange.setVisible(false);pos4=true;r4=true;}
				else if(pos5 == false) {lbl5.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_range.png")));lblRange.setVisible(false);pos5=true;}
				else if(pos6 == false) {lbl6.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_range.png")));lblRange.setVisible(false);pos6=true;}
				else if(pos7 == false) {lbl7.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_range.png")));lblRange.setVisible(false);pos7=true;}
				else if(pos8 == false) {lbl8.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_range.png")));lblRange.setVisible(false);pos8=true;}
				else if(pos9 == false) {lbl9.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_range.png")));lblRange.setVisible(false);pos9=true;}
				else if(pos10 == false) {lbl10.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_range.png")));lblRange.setVisible(false);pos10=true;}
			}
		});
		lblRange.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_range.png")));
		lblRange.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblRange.setBounds(508, 462, 102, 52);
		contentPane.add(lblRange);
		
		JLabel lblPrint = new JLabel("for");
		lblPrint.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(pos1 == false) {lbl1.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_print.png")));lblPrint.setVisible(false);pos1=true;}
				else if(pos2 == false) {lbl2.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_print.png")));lblPrint.setVisible(false);pos2=true;}
				else if(pos3 == false) {lbl3.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_print.png")));lblPrint.setVisible(false);pos3=true;}
				else if(pos4 == false) {lbl4.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_print.png")));lblPrint.setVisible(false);pos4=true;}
				else if(pos5 == false) {lbl5.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_print.png")));lblPrint.setVisible(false);pos5=true;}
				else if(pos6 == false) {lbl6.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_print.png")));lblPrint.setVisible(false);pos6=true;}
				else if(pos7 == false) {lbl7.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_print.png")));lblPrint.setVisible(false);pos7=true;r7=true;}
				else if(pos8 == false) {lbl8.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_print.png")));lblPrint.setVisible(false);pos8=true;}
				else if(pos9 == false) {lbl9.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_print.png")));lblPrint.setVisible(false);pos9=true;}
				else if(pos10 == false) {lbl10.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_print.png")));lblPrint.setVisible(false);pos10=true;}
			}
		});
		lblPrint.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/button_print.png")));
		lblPrint.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPrint.setBounds(286, 462, 102, 52);
		contentPane.add(lblPrint);
		
		JLabel lblparenthesis1 = new JLabel("for");
		lblparenthesis1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(pos1 == false) {lbl1.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/parenthesis1_button.png")));pos1=true;}
				else if(pos2 == false) {lbl2.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/parenthesis1_button.png")));pos2=true;}
				else if(pos3 == false) {lbl3.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/parenthesis1_button.png")));pos3=true;}
				else if(pos4 == false) {lbl4.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/parenthesis1_button.png")));pos4=true;}
				else if(pos5 == false) {lbl5.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/parenthesis1_button.png")));pos5=true;r5=true;}
				else if(pos6 == false) {lbl6.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/parenthesis1_button.png")));pos6=true;}
				else if(pos7 == false) {lbl7.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/parenthesis1_button.png")));pos7=true;}
				else if(pos8 == false) {lbl8.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/parenthesis1_button.png")));lblparenthesis1.setVisible(false);pos8=true;r5=true;}
				else if(pos9 == false) {lbl9.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/parenthesis1_button.png")));pos9=true;}
				else if(pos10 == false) {lbl10.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/parenthesis1_button.png")));pos10=true;}

			}
		});
		lblparenthesis1.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/parenthesis1_button.png")));
		lblparenthesis1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblparenthesis1.setBounds(341, 400, 102, 52);
		contentPane.add(lblparenthesis1);
		
		JLabel lblparenthesis2 = new JLabel("for");
		lblparenthesis2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(pos1 == false) {lbl1.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/parenthesis2_button.png")));pos1=true;}
				else if(pos2 == false) {lbl2.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/parenthesis2_button.png")));pos2=true;}
				else if(pos3 == false) {lbl3.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/parenthesis2_button.png")));pos3=true;}
				else if(pos4 == false) {lbl4.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/parenthesis2_button.png")));pos4=true;}
				else if(pos5 == false) {lbl5.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/parenthesis2_button.png")));pos5=true;}
				else if(pos6 == false) {lbl6.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/parenthesis2_button.png")));pos6=true;r6=true;}
				else if(pos7 == false) {lbl7.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/parenthesis2_button.png")));pos7=true;}
				else if(pos8 == false) {lbl8.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/parenthesis2_button.png")));pos8=true;}
				else if(pos9 == false) {lbl9.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/parenthesis2_button.png")));pos9=true;}
				else if(pos10 == false) {lbl10.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/parenthesis2_button.png")));lblparenthesis2.setVisible(false);pos10=true;r6=true;}
			}
		});
		lblparenthesis2.setIcon(new ImageIcon(Questão3_1.class.getResource("/buttons/parenthesis2_button.png")));
		lblparenthesis2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblparenthesis2.setBounds(398, 462, 102, 52);
		contentPane.add(lblparenthesis2);
		
		JTextPane txtpnUsandoOsBlocos = new JTextPane();
		txtpnUsandoOsBlocos.setForeground(new Color(255, 204, 0));
		txtpnUsandoOsBlocos.setBackground(new Color(0, 102, 204));
		txtpnUsandoOsBlocos.setFont(new Font("Consolas", Font.PLAIN, 30));
		txtpnUsandoOsBlocos.setText("Usando os blocos faça um programa que execute uma contagem regressiva indo de 10 até 0");
		txtpnUsandoOsBlocos.setEditable(false);
		txtpnUsandoOsBlocos.setBounds(681, 224, 276, 278);
		contentPane.add(txtpnUsandoOsBlocos);
		
		JButton btnProximo = new JButton("Próximo");
		btnProximo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(prox == true) {
					dispose();
					Questão3_2 q2 = new Questão3_2();
					q2.setVisible(true);
				}
			}
		});
		btnProximo.setFont(new Font("Consolas", Font.PLAIN, 26));
		btnProximo.setEnabled(false);
		btnProximo.setBounds(813, 535, 144, 49);
		contentPane.add(btnProximo);
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnReiniciar) {
					dispose();
					Questão3_1 q1 = new Questão3_1();
					q1.setVisible(true);
				
				}
			}
		});
		btnReiniciar.setFont(new Font("Consolas", Font.PLAIN, 20));
		btnReiniciar.setBounds(10, 536, 144, 49);
		contentPane.add(btnReiniciar);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setForeground(new Color(0, 0, 205));
		lblResposta.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblResposta.setBounds(209, 247, 462, 53);
		contentPane.add(lblResposta);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(r1 && r2 && r3 && r4 && r5 && r6 && r7 == true) {
					lblResposta.setText("Correto! :)");
					lblResposta.setForeground(new Color(0, 255, 0));
					btnVerificar.setEnabled(false);
					btnProximo.setEnabled(true);
					btnReiniciar.setEnabled(false);
				}
				else {lblResposta.setText("Resposta Incorreta!");
				lblResposta.setForeground(new Color(255,0,0));
				btnVerificar.setEnabled(false);
				btnProximo.setEnabled(true);
				btnReiniciar.setEnabled(false);

				}
				prox = true;
			}
		});
		btnVerificar.setForeground(new Color(102, 204, 51));
		btnVerificar.setFont(new Font("Consolas", Font.PLAIN, 21));
		btnVerificar.setBackground(Color.WHITE);
		btnVerificar.setBounds(312, 329, 150, 53);
		contentPane.add(btnVerificar);
		
	
	}
}