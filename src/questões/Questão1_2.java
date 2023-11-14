package questões;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Questão1_2 extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JFrame frame;

boolean r1,r2,r3,r4,r5,r6,prox=false;
boolean pos1,pos2,pos3,pos4,pos5,pos6=false;


public void setPos1(boolean pos1) {
	pos1 = true;
	this.pos1 = pos1;


}

public void setPos2(boolean pos2) {
	pos2 = true;
	this.pos2 = pos2;

	
}

public void setPos3(boolean pos3) {
	pos3 = true;
	this.pos3 = pos3;

}

public void setPos4(boolean pos4) {
	pos4 = true;
	this.pos4 = pos4;

}
public void setPos5(boolean pos5) {
	pos5 = true;
	this.pos5 = pos5;
}

public void setPos6(boolean pos6) {
	pos6 = true;
	this.pos6 = pos6;
	}

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questão1_2 frame = new Questão1_2();
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
	public Questão1_2() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1207, 555);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 192));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
			
		
		
		JLabel lbltitulo = new JLabel("Questão 2");
		lbltitulo.setForeground(new Color(255, 204, 0));
		lbltitulo.setFont(new Font("Consolas", Font.PLAIN, 36));
		lbltitulo.setBounds(494, 10, 204, 59);
		contentPane.add(lbltitulo);;
		
		JLabel lbl1 = new JLabel("");
		lbl1.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/border.png")));
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl1.setBounds(80, 85, 111, 52);
		contentPane.add(lbl1);
		
		
		JLabel lbl2 = new JLabel("");
		lbl2.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/border.png")));
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl2.setBounds(192, 85, 111, 52);
		contentPane.add(lbl2);
		pos2 = false;
		
		JLabel lbl3 = new JLabel("");
		lbl3.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/border.png")));
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl3.setBounds(305, 85, 111, 52);
		contentPane.add(lbl3);
		pos3 = false;
		
		JLabel lbl4 = new JLabel("");
		lbl4.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/border.png")));
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl4.setBounds(418, 85, 111, 52);
		contentPane.add(lbl4);
		pos4 = false;
		
		JLabel lbl5 = new JLabel("");
		lbl5.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_bigborder.png")));
		lbl5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl5.setBounds(532, 85, 305, 52);
		contentPane.add(lbl5);
		pos5 = false;
		
		JLabel lbl6 = new JLabel("");
		lbl6.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/border.png")));
		lbl6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl6.setBounds(839, 85, 111, 52);
		contentPane.add(lbl6);
		pos6 = false;
		
		
		
		JLabel lblnome = new JLabel("");
		lblnome.addMouseListener(new MouseAdapter() {
			@Override
			public final void mouseClicked(MouseEvent e) {
if(pos1 == false) {lbl1.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_nome.png")));;lblnome.setVisible(false);setPos1(pos1);r1 = true;}
else if(pos2 == false) {lbl2.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_nome.png")));;lblnome.setVisible(false);setPos2(pos2);}
else if(pos3 == false) {lbl3.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_nome.png")));;lblnome.setVisible(false);setPos2(pos3);}
else if(pos4 == false) {lbl4.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_nome.png")));;lblnome.setVisible(false);setPos2(pos4);}
else if(pos6 == false) {lbl6.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_nome.png")));;lblnome.setVisible(false);setPos2(pos6);}

			
			}
		});
		lblnome.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_nome.png")));
		lblnome.setForeground(new Color(255, 0, 0));
		lblnome.setBackground(new Color(255, 255, 255));
		lblnome.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblnome.setBounds(741, 234, 111, 52);
		contentPane.add(lblnome);
		
		JLabel lblatribuicao = new JLabel("");
		lblatribuicao.addMouseListener(new MouseAdapter() {
			@Override
			public final void mouseClicked(MouseEvent e) {
if(pos1 == false) {lbl1.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_atribuição.png")));;lblatribuicao.setVisible(false);setPos1(pos1);}
else if(pos2 == false) {lbl2.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_atribuição.png")));;lblatribuicao.setVisible(false);setPos2(pos2);r2 = true;}		
else if(pos3 == false) {lbl3.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_atribuição.png")));;lblatribuicao.setVisible(false);setPos3(pos3);}		
else if(pos4 == false) {lbl4.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_atribuição.png")));;lblatribuicao.setVisible(false);setPos4(pos4);}		
else if(pos6 == false) {lbl6.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_atribuição.png")));;lblatribuicao.setVisible(false);setPos2(pos6);}		

	
			}
		});
		lblatribuicao.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_atribuição.png")));
		lblatribuicao.setForeground(new Color(128, 128, 128));
		lblatribuicao.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblatribuicao.setBounds(80, 234, 111, 52);
		contentPane.add(lblatribuicao);
		
		JLabel lblInput = new JLabel("");
		lblInput.addMouseListener(new MouseAdapter() {
			@Override
			public final void mouseClicked(MouseEvent e) {
if(pos1 == false) {lbl1.setIcon(new ImageIcon("C:\\Users\\tally\\Desktop\\buttons\\button_input.png"));lblInput.setVisible(false);setPos1(pos1);}
else if(pos2 == false) {lbl2.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_input.png")));;lblInput.setVisible(false);setPos2(pos2);}
else if(pos3 == false) {lbl3.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_input.png")));;lblInput.setVisible(false);setPos3(pos3);r3 = true;}
else if(pos4 == false) {lbl4.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_input.png")));;lblInput.setVisible(false);setPos4(pos4);}
else if(pos6 == false) {lbl6.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_input.png")));;lblInput.setVisible(false);setPos6(pos6);}




			}
		});
		lblInput.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_input.png")));
		lblInput.setForeground(new Color(255, 0, 255));
		lblInput.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblInput.setBounds(305, 234, 111, 52);
		contentPane.add(lblInput);
		
		JLabel lblparenthesis = new JLabel("");
		lblparenthesis.addMouseListener(new MouseAdapter() {
			@Override
			public final void mouseClicked(MouseEvent e) {
if(pos1 == false) {lbl1.setIcon(new ImageIcon("C:\\Users\\tally\\Desktop\\buttons\\parenthesis1_button.png"));lblparenthesis.setVisible(false);setPos1(pos1);}
else if(pos2 == false) {lbl2.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/parenthesis1_button.png")));;lblparenthesis.setVisible(false);setPos2(pos2);}
else if(pos3 == false) {lbl3.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/parenthesis1_button.png")));;lblparenthesis.setVisible(false);setPos3(pos3);}
else if(pos4 == false) {lbl4.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/parenthesis1_button.png")));;lblparenthesis.setVisible(false);setPos4(pos4);r4 = true;}
else if(pos6 == false) {lbl6.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/parenthesis1_button.png")));;lblparenthesis.setVisible(false);setPos6(pos6);}



			}
		});
		lblparenthesis.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/parenthesis1_button.png")));
		lblparenthesis.setForeground(new Color(0, 255, 64));
		lblparenthesis.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblparenthesis.setBounds(741, 296, 111, 52);
		contentPane.add(lblparenthesis);
		
		JLabel lblparenthesis2 = new JLabel("");
		lblparenthesis2.addMouseListener(new MouseAdapter() {
			@Override
			public final void mouseClicked(MouseEvent e) {
if(pos1 == false) {lbl1.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/parenthesis2_button.png")));lblparenthesis2.setVisible(false);setPos1(pos1);}
else if(pos2 == false) {lbl2.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/parenthesis2_button.png")));lblparenthesis2.setVisible(false);setPos2(pos2);}
else if(pos3 == false) {lbl3.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/parenthesis2_button.png")));lblparenthesis2.setVisible(false);setPos3(pos3);}
else if(pos4 == false) {lbl4.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/parenthesis2_button.png")));lblparenthesis2.setVisible(false);setPos4(pos4);}
else if(pos6 == false) {lbl6.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/parenthesis2_button.png")));lblparenthesis2.setVisible(false);setPos6(pos6);r6 = true;}

			}
		});
		lblparenthesis2.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/parenthesis2_button.png")));
		lblparenthesis2.setForeground(new Color(0, 255, 64));
		lblparenthesis2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblparenthesis2.setBounds(192, 234, 111, 52);
		contentPane.add(lblparenthesis2);
		
		JLabel lblstring1 = new JLabel("");
		lblstring1.addMouseListener(new MouseAdapter() {
			@Override
			public final void mouseClicked(MouseEvent e) {
if(pos5 == false) {lbl5.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_string1.png")));;lblstring1.setVisible(false);setPos5(pos5);r5 = true;}
		
				
				
				
			}
		});
		lblstring1.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_string1.png")));
		lblstring1.setForeground(new Color(255, 128, 0));
		lblstring1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblstring1.setBounds(426, 234, 305, 52);
		contentPane.add(lblstring1);
		
		JLabel lblstring2 = new JLabel("");
		lblstring2.addMouseListener(new MouseAdapter() {
			@Override
			public final void mouseClicked(MouseEvent e) {
if(pos5 == false) {lbl5.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_name.png")));;lblstring2.setVisible(false);setPos5(pos5);}

				
			}
		});
		lblstring2.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_name.png")));
		lblstring2.setForeground(new Color(255, 128, 0));
		lblstring2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblstring2.setBounds(305, 296, 305, 52);
		contentPane.add(lblstring2);
		
		JLabel lblInput2 = new JLabel("");
		lblInput2.addMouseListener(new MouseAdapter() {
			@Override
			public final void mouseClicked(MouseEvent e) {

if(pos1 == false) {lbl1.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_input2.png")));lblInput2.setVisible(false);setPos1(pos1);}
else if(pos2 == false) {lbl2.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_input2.png")));lblInput2.setVisible(false);setPos2(pos2);}
else if(pos3 == false) {lbl3.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_input2.png")));lblInput2.setVisible(false);setPos3(pos3);}
else if(pos4 == false) {lbl4.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_input2.png")));lblInput2.setVisible(false);setPos4(pos4);}
else if(pos6 == false) {lbl6.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_input2.png")));lblInput2.setVisible(false);setPos6(pos6);}

			}
		});
		lblInput2.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_input2.png")));
		lblInput2.setForeground(Color.MAGENTA);
		lblInput2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblInput2.setBounds(80, 296, 111, 52);
		contentPane.add(lblInput2);
		
		JLabel lbligual = new JLabel("   ");
		lbligual.addMouseListener(new MouseAdapter() {
			@Override
			public final void mouseClicked(MouseEvent e) {
if(pos1 == false) {lbl1.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_atribuição2.png")));lbligual.setVisible(false);setPos1(pos1);}
else if(pos2 == false) {lbl2.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_atribuição2.png")));lbligual.setVisible(false);setPos2(pos2);}
else if(pos3 == false) {lbl3.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_atribuição2.png")));lbligual.setVisible(false);setPos3(pos3);}
else if(pos4 == false) {lbl4.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_atribuição2.png")));lbligual.setVisible(false);setPos4(pos4);}
else if(pos6 == false) {lbl6.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_atribuição2.png")));lbligual.setVisible(false);setPos6(pos6);}

			}
		});
		lbligual.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_atribuição2.png")));
		lbligual.setForeground(Color.GRAY);
		lbligual.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbligual.setBounds(620, 296, 111, 52);
		contentPane.add(lbligual);
		
		JLabel lblPrint = new JLabel("");
		lblPrint.addMouseListener(new MouseAdapter() {
			@Override
			public final void mouseClicked(MouseEvent e) {
if(pos1 == false) {lbl1.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_print.png")));lblPrint.setVisible(false);setPos1(pos1);}
else if(pos2 == false) {lbl2.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_print.png")));lblPrint.setVisible(false);setPos2(pos2);}
else if(pos3 == false) {lbl3.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_print.png")));lblPrint.setVisible(false);setPos3(pos3);}
else if(pos4 == false) {lbl4.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_print.png")));lblPrint.setVisible(false);setPos4(pos4);}
else if(pos6 == false) {lbl6.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_print.png")));lblPrint.setVisible(false);setPos6(pos6);}


			}
		});
		lblPrint.setIcon(new ImageIcon(Questão1_2.class.getResource("/buttons/button_print.png")));
		lblPrint.setForeground(new Color(0, 0, 160));
		lblPrint.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPrint.setBounds(192, 296, 111, 52);
		contentPane.add(lblPrint);
		
		
		
		
		
		
		
		JTextPane txtpnOrganizeOsBlocos = new JTextPane();
		txtpnOrganizeOsBlocos.setForeground(new Color(255, 204, 0));
		txtpnOrganizeOsBlocos.setBackground(new Color(0, 128, 192));
		txtpnOrganizeOsBlocos.setFont(new Font("Consolas", Font.PLAIN, 25));
		txtpnOrganizeOsBlocos.setEditable(false);
		txtpnOrganizeOsBlocos.setText("Organize os blocos de uma forma que no console apareça uma mensagem perguntando seu nome e com uma caixa de digitação para entrada de dados(nome).");
		txtpnOrganizeOsBlocos.setBounds(872, 147, 295, 276);
		txtpnOrganizeOsBlocos.setBorder(BorderFactory.createLineBorder(getForeground()));
		contentPane.add(txtpnOrganizeOsBlocos);
		
	
		
		JButton btnProximo = new JButton("Próximo");
		btnProximo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnProximo.setEnabled(false);
		btnProximo.setBounds(1016, 456, 151, 52);
		contentPane.add(btnProximo);

		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnReiniciar) {
					dispose();
					Questão1_2 q2 = new Questão1_2();
				
				}
			}
		});
		btnReiniciar.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnReiniciar.setEnabled(true);
		btnReiniciar.setBounds(20, 456, 151, 52);
		contentPane.add(btnReiniciar);
		
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(r1 && r2 && r3 && r4 && r5 && r6==true) {
					
					JLabel lblResposta = new JLabel("");
					lblResposta.setFont(new Font("Tahoma", Font.PLAIN, 30));
					lblResposta.setBounds(239, 227, 543, 45);
					lblResposta.setBorder(null);
					contentPane.add(lblResposta);
					lblResposta.setText("Resposta Correta! Continue Assim :)");
					btnProximo.setEnabled(true);
					btnReiniciar.setEnabled(false);
					
					}
				else {
					JLabel lblResposta = new JLabel("");
					lblResposta.setFont(new Font("Tahoma", Font.PLAIN, 30));
					lblResposta.setBorder(null);
					contentPane.add(lblResposta);
					lblResposta.setText("Resposta Correta! Continue Assim :)");
					lblResposta.setBounds(127, 258, 795, 45);
					lblResposta.setText("Resposta Incorreta! Tente melhor da próxima vez");
					btnProximo.setEnabled(true);
					btnReiniciar.setEnabled(false);

				}
			
			lblnome.setVisible(false);
			lblatribuicao.setVisible(false);
			lblInput.setVisible(false);
			lblparenthesis.setVisible(false);
			lblparenthesis2.setVisible(false);
			lblstring1.setVisible(false);
			lblstring2.setVisible(false);
			lblInput2.setVisible(false);
			lbligual.setVisible(false);
			lblPrint.setVisible(false);
			prox = true;
			
			}
		});
		btnVerificar.setForeground(new Color(128, 255, 0));
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnVerificar.setBounds(406, 158, 164, 59);
		contentPane.add(btnVerificar);
		
		btnProximo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
			if(prox == true) {
					setDefaultCloseOperation(EXIT_ON_CLOSE);
					dispose();
					Questão1_3 q3 = new Questão1_3();
					q3.setVisible(true);
					
					
					

				}
			}
		});
	

	}
		
	}
		
	
