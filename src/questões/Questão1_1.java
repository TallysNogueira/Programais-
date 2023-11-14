package questões;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class Questão1_1 extends JFrame {
	
	boolean p1,p2,p3,p4,p5;
	boolean r1,r2,r3,r4,r5,prox = false;//Variavéis para verificar se a posição do bloco está correta
	private boolean pos1,pos2,pos3,pos4,pos5;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questão1_1 frame = new Questão1_1();
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
	public Questão1_1() {
		getContentPane().setBackground(new Color(0, 128, 192));
		setBounds(100, 100, 846, 483);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		//Label Título
		JLabel lbltitulo = new JLabel("Questão 1");
		lbltitulo.setForeground(new Color(255, 204, 0));
		lbltitulo.setBounds(308, 10, 216, 53);
		lbltitulo.setFont(new Font("Consolas", Font.PLAIN, 40));
		getContentPane().add(lbltitulo);
		//Botão para passar para a próxima questão
		JButton btnProximo = new JButton("Próximo");
		btnProximo.setForeground(new Color(217, 217, 0));
		btnProximo.setEnabled(false);
		btnProximo.setFont(new Font("Consolas", Font.PLAIN, 26));
		btnProximo.setBounds(660, 380, 144, 49);
		getContentPane().add(btnProximo);
		
		//Label Resposta
		JLabel lblResposta = new JLabel("");
		lblResposta.setForeground(new Color(0, 255, 0));
		lblResposta.setFont(new Font("Consolas", Font.PLAIN, 30));
		lblResposta.setBounds(257, 229, 308, 53);
		getContentPane().add(lblResposta);
		
		//Criação dos encaixes das peças
		JLabel lbl1 = new JLabel("");
		lbl1.setBounds(138, 95, 102, 75);
		lbl1.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/border.png")));
		getContentPane().add(lbl1);
		pos1=false;

		
		JLabel lbl2 = new JLabel("");
		lbl2.setBounds(241, 95, 126, 75);
		lbl2.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/border.png")));
		getContentPane().add(lbl2);
		pos2=false;

		
		JLabel lbl3 = new JLabel("");
		lbl3.setBounds(343, 95, 126, 75);
		lbl3.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/border.png")));
		getContentPane().add(lbl3);
		pos3=false;

		
		JLabel lbl4 = new JLabel("");
		lbl4.setBounds(445, 95, 126, 75);
		lbl4.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/border.png")));
		getContentPane().add(lbl4);
		pos4=false;

		
		JLabel lbl5 = new JLabel("");
		lbl5.setBounds(547, 95, 126, 75);
		lbl5.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/border.png")));
		getContentPane().add(lbl5);
		pos5=false;
		
		
	
	
		
		//Label Print
		JLabel lblprint = new JLabel("");
		lblprint.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
if(pos1 == false) {lbl1.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/button_print.png")));;lblprint.setVisible(false);pos1=true;r1 = true;}
else if(pos2 == false) {lbl2.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/button_print.png")));;lblprint.setVisible(false);pos2=true;}
else if(pos3 == false) {lbl3.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/button_print.png")));;lblprint.setVisible(false);pos3=true;}
else if(pos4 == false) {lbl4.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/button_print.png")));;lblprint.setVisible(false);pos4=true;}
else if(pos5 == false) {lbl5.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/button_print.png")));;lblprint.setVisible(false);pos5=true;}
			}
			});
		lblprint.setBounds(450, 281, 105, 85);
		lblprint.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/button_print.png")));
		getContentPane().add(lblprint);
		
		JLabel lblparenthesis1 = new JLabel("");
		lblparenthesis1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
{
if(pos1 == false) {lbl1.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/parenthesis1_button.png")));;lblparenthesis1.setVisible(false);pos1=true;}
else if(pos2 == false) {lbl2.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/parenthesis1_button.png")));;lblparenthesis1.setVisible(false);pos2=true;r2 = true;}
else if(pos3 == false) {lbl3.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/parenthesis1_button.png")));;lblparenthesis1.setVisible(false);pos3=true;}
else if(pos4 == false) {lbl4.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/parenthesis1_button.png")));;lblparenthesis1.setVisible(false);pos4=true;}
else if(pos5 == false) {lbl5.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/parenthesis1_button.png")));;lblparenthesis1.setVisible(false);pos5=true;}
			}
			});
		lblparenthesis1.setBounds(339, 281, 105, 85);
		
		lblparenthesis1.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/parenthesis1_button.png")));
		getContentPane().add(lblparenthesis1);
		
		JLabel lblola = new JLabel("");
		lblola.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
if(pos1 == false) {lbl1.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/button_ola.png")));;lblola.setVisible(false);pos1=true;}
else if(pos2 == false) {lbl2.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/button_ola.png")));;lblola.setVisible(false);pos2=true;}
else if(pos3 == false) {lbl3.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/button_ola.png")));;lblola.setVisible(false);pos3=true;r3 = true;}
else if(pos4 == false) {lbl4.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/button_ola.png")));;lblola.setVisible(false);pos4=true;}
else if(pos5 == false) {lbl5.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/button_ola.png")));;lblola.setVisible(false);pos5=true;}
}
			});
		lblola.setBounds(220, 281, 105, 85);
		
		lblola.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/button_ola.png")));
		getContentPane().add(lblola);
		
		JLabel lblmundo = new JLabel("");
		lblmundo.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if(pos1 == false) {lbl1.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/button_mundo.png")));;lblmundo.setVisible(false);pos1=true;}
				else if(pos2 == false) {lbl2.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/button_mundo.png")));;lblmundo.setVisible(false);pos2=true;}
				else if(pos3 == false) {lbl3.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/button_mundo.png")));;lblmundo.setVisible(false);pos3=true;}
				else if(pos4 == false) {lbl4.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/button_mundo.png")));;lblmundo.setVisible(false);pos4=true;r4 = true;}
				else if(pos5 == false) {lbl5.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/button_mundo.png")));;lblmundo.setVisible(false);pos5=true;}

			}
		});
		lblmundo.setBounds(105, 281, 105, 85);
	
		lblmundo.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/button_mundo.png")));
		getContentPane().add(lblmundo);
		
		JLabel lblparenthesis2 = new JLabel("");
		lblparenthesis2.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) {
				if(pos1 == false) {lbl1.setIcon(new ImageIcon("C:\\Users\\tally\\Desktop\\buttons\\parenthesis1_button.png"));lblparenthesis2.setVisible(false);pos1=true;}
				else if(pos2 == false) {lbl2.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/parenthesis2_button.png")));;lblparenthesis2.setVisible(false);pos2=true;}
				else if(pos3 == false) {lbl3.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/parenthesis2_button.png")));;lblparenthesis2.setVisible(false);pos3=true;}
				else if(pos4 == false) {lbl4.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/parenthesis2_button.png")));;lblparenthesis2.setVisible(false);pos4=true;}
				else if(pos5 == false) {lbl5.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/parenthesis2_button.png")));;lblparenthesis2.setVisible(false);pos5=true;r5 = true;}

				}
			});
		lblparenthesis2.setBounds(568, 281, 105, 85);
		
		lblparenthesis2.setIcon(new ImageIcon(Questão1_1.class.getResource("/buttons/parenthesis2_button.png")));
		getContentPane().add(lblparenthesis2);
		
		
		
	
		
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.setForeground(new Color(217, 217, 0));
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnReiniciar) {
					dispose();
					Questão1_1 q1 = new Questão1_1();
					q1.setVisible(true);
					
				}
			}
		});
		btnReiniciar.setFont(new Font("Consolas", Font.PLAIN, 20));
		btnReiniciar.setBounds(10, 381, 144, 49);
		getContentPane().add(btnReiniciar);
		

		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setIcon(null);
		btnVerificar.setBackground(new Color(255, 255, 255));
		btnVerificar.setForeground(new Color(102, 204, 51));
		btnVerificar.setFont(new Font("Consolas", Font.PLAIN, 21));
		btnVerificar.setBounds(327, 166, 150, 53);
		getContentPane().add(btnVerificar);
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			
				if(r1 && r2 && r3 && r4 && r5 == true) 
				{
					lblResposta.setText("Olá mundo");
					lblResposta.setForeground(new Color(0, 255, 0));
					lblResposta.setBorder(BorderFactory.createLineBorder(null));
					btnProximo.setEnabled(true);
					btnReiniciar.setEnabled(false);
					btnVerificar.setEnabled(false);


}
				else {
					lblResposta.setText("Resposta inválida");
					lblResposta.setForeground(new Color(255,0,0));
					btnProximo.setEnabled(true);
					btnReiniciar.setEnabled(false);
					btnVerificar.setEnabled(false);

				}
			
				
				prox = true;
}
		});
		
		
		
		

		
		JTextPane txtpnOrganizeOsBlocos = new JTextPane();
		txtpnOrganizeOsBlocos.setForeground(new Color(255, 204, 0));
		txtpnOrganizeOsBlocos.setBackground(new Color(0, 128, 192));
		txtpnOrganizeOsBlocos.setFont(new Font("Consolas", Font.BOLD, 25));
		txtpnOrganizeOsBlocos.setText("Organize os blocos para que na tela apareça \"olá mundo\"");
		txtpnOrganizeOsBlocos.setBounds(44, 50, 778, 53);
		txtpnOrganizeOsBlocos.setEditable(false);
		getContentPane().add(txtpnOrganizeOsBlocos);
		
		btnProximo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(prox == true) {
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();
				Questão1_2 q2 = new Questão1_2();
				q2.setVisible(true);
				}
			}
		});
	
	

		
		
		
		
		
}

}
