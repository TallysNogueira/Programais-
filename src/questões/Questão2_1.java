package questões;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Questão2_1 extends JFrame {
boolean prox,pos1,pos2,pos3,pos4,pos5,pos6,pos7,pos8,pos9,pos10,pos11,pos12=false;
boolean r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12=false;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questão2_1 frame = new Questão2_1();
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
	public Questão2_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1143, 759);
		setSize(new Dimension(1378, 817));
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Questão 1");
		lblNewLabel.setForeground(new Color(0, 102, 255));
		lblNewLabel.setFont(new Font("Consolas", Font.PLAIN, 50));
		lblNewLabel.setBounds(359, 10, 313, 64);
		contentPane.add(lblNewLabel);
		
		JTextPane txtcomentario = new JTextPane();
		txtcomentario.setBackground(new Color(255, 255, 0));
		txtcomentario.setEditable(false);
		txtcomentario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtcomentario.setText("# x recebe o valor 5");
		txtcomentario.setBounds(565, 92, 234, 37);
		contentPane.add(txtcomentario);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setForeground(Color.RED);
		lblResposta.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblResposta.setBorder(UIManager.getBorder("TextField.border"));
		lblResposta.setBounds(482, 471, 307, 61);
		contentPane.add(lblResposta);
		
		JButton btnProximo = new JButton("Próximo");
		btnProximo.setFont(new Font("Consolas", Font.PLAIN, 26));
		btnProximo.setEnabled(false);
		btnProximo.setBounds(1185, 710, 169, 49);
		contentPane.add(btnProximo);
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnReiniciar) {
					dispose();
					Questão2_1 q1 = new Questão2_1();
					q1.setVisible(true);
				
				}
			}
		});
		btnReiniciar.setFont(new Font("Consolas", Font.PLAIN, 20));
		btnReiniciar.setBounds(10, 698, 157, 50);
		contentPane.add(btnReiniciar);
		
		JLabel lbl1 = new JLabel("");
		lbl1.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/border.png")));
		lbl1.setBounds(98, 139, 104, 77);
		contentPane.add(lbl1);
		pos1 = false;
		
		JLabel lbl2 = new JLabel("");
		lbl2.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/border.png")));
		lbl2.setBounds(306, 139, 113, 77);
		contentPane.add(lbl2);
		pos2=false;
		
		JLabel lbl3 = new JLabel("");
		lbl3.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/border.png")));
		lbl3.setBounds(515, 139, 113, 77);
		contentPane.add(lbl3);
		pos3=false;
		
		JLabel lbl4 = new JLabel("");
		lbl4.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/border.png")));
		lbl4.setBounds(170, 218, 104, 77);
		contentPane.add(lbl4);
		pos4=false;

		
		JLabel lbl5 = new JLabel("");
		lbl5.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/border.png")));
		lbl5.setBounds(275, 218, 113, 77);
		contentPane.add(lbl5);
		pos5=false;

		
		JLabel lbl6 = new JLabel("");
		lbl6.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_bigborder.png")));
		lbl6.setBounds(379, 218, 322, 77);
		contentPane.add(lbl6);
		pos6=false;

		
		JLabel lbl7 = new JLabel("");
		lbl7.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/border.png")));
		lbl7.setBounds(683, 218, 113, 77);
		contentPane.add(lbl7);
		pos7=false;

		
		JLabel lbl8 = new JLabel("");
		lbl8.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/border.png")));
		lbl8.setBounds(98, 305, 113, 77);
		contentPane.add(lbl8);
		pos8=false;

		
		JLabel lbl9 = new JLabel("");
		lbl9.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/border.png")));
		lbl9.setBounds(165, 392, 113, 77);
		contentPane.add(lbl9);
		pos9=false;

		
		JLabel lbl10 = new JLabel("");
		lbl10.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/border.png")));
		lbl10.setBounds(275, 392, 104, 77);
		contentPane.add(lbl10);
		pos10=false;

		
		JLabel lbl11 = new JLabel("");
		lbl11.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_bigborder.png")));
		lbl11.setBounds(379, 392, 308, 77);
		contentPane.add(lbl11);
		pos11=false;
		
		JLabel lbl12 = new JLabel("");
		lbl12.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/border.png")));
		lbl12.setBounds(683, 392, 113, 77);
		contentPane.add(lbl12);
		pos2=false;
		
		JLabel lblIf = new JLabel("if");
		lblIf.addMouseListener(new MouseAdapter() {
			@Override
			public final void mouseClicked(MouseEvent e) {
				if(pos1 == false) 		{lbl1.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_if.png")));lblIf.setVisible(false);pos1=true;r1=true;}
				else if(pos2 == false) 	{lbl2.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_if.png")));lblIf.setVisible(false);pos2=true;}
				else if(pos3 == false) 	{lbl3.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_if.png")));lblIf.setVisible(false);pos3=true;}
				else if(pos4 == false) 	{lbl4.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_if.png")));lblIf.setVisible(false);pos4=true;}
				else if(pos5 == false) 	{lbl5.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_if.png")));lblIf.setVisible(false);pos5=true;}
				else if(pos7 == false) 	{lbl7.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_if.png")));lblIf.setVisible(false);pos7=true;}
				else if(pos8 == false) 	{lbl8.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_if.png")));lblIf.setVisible(false);pos8=true;}
				else if(pos9 == false) 	{lbl9.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_if.png")));lblIf.setVisible(false);pos9=true;}
				else if(pos10 == false) {lbl10.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_if.png")));lblIf.setVisible(false);pos10=true;}
				else if(pos12 == false) {lbl12.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_if.png")));lblIf.setVisible(false);pos12=true;}
			}
		});
		lblIf.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_if.png")));
		lblIf.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblIf.setBounds(247, 531, 104, 77);

		contentPane.add(lblIf);
		
		JLabel lblpercent = new JLabel("%");
		lblpercent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(pos1 == false) 		{lbl1.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_percent.png")));lblpercent.setVisible(false);pos1=true;}
				else if(pos2 == false) 	{lbl2.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_percent.png")));lblpercent.setVisible(false);pos2=true;r2=true;}
				else if(pos3 == false) 	{lbl3.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_percent.png")));lblpercent.setVisible(false);pos3=true;}
				else if(pos4 == false) 	{lbl4.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_percent.png")));lblpercent.setVisible(false);pos4=true;}
				else if(pos5 == false) 	{lbl5.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_percent.png")));lblpercent.setVisible(false);pos5=true;}
				else if(pos7 == false) 	{lbl7.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_percent.png")));lblpercent.setVisible(false);pos7=true;}
				else if(pos8 == false) 	{lbl8.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_percent.png")));lblpercent.setVisible(false);pos8=true;}
				else if(pos9 == false) 	{lbl9.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_percent.png")));lblpercent.setVisible(false);pos9=true;}
				else if(pos10 == false) {lbl10.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_percent.png")));lblpercent.setVisible(false);pos10=true;}
				else if(pos12 == false) {lbl12.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_percent.png")));lblpercent.setVisible(false);pos12=true;}
			}
		});
		lblpercent.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_percent.png")));
		lblpercent.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblpercent.setBounds(710, 531, 104, 77);
		contentPane.add(lblpercent);
		
		JLabel lbligual = new JLabel("==");
		lbligual.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(pos1 == false) 		{lbl1.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_atribuição2.png")));lbligual.setVisible(false);pos1=true;}
				else if(pos2 == false) 	{lbl2.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_atribuição2.png")));lbligual.setVisible(false);pos2=true;}
				else if(pos3 == false) 	{lbl3.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_atribuição2.png")));lbligual.setVisible(false);pos3=true;r3=true;}
				else if(pos4 == false) 	{lbl4.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_atribuição2.png")));lbligual.setVisible(false);pos4=true;}
				else if(pos5 == false) 	{lbl5.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_atribuição2.png")));lbligual.setVisible(false);pos5=true;}
				else if(pos7 == false) 	{lbl7.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_atribuição2.png")));lbligual.setVisible(false);pos7=true;}
				else if(pos8 == false) 	{lbl8.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_atribuição2.png")));lbligual.setVisible(false);pos8=true;}
				else if(pos9 == false) 	{lbl9.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_atribuição2.png")));lbligual.setVisible(false);pos9=true;}
				else if(pos10 == false) {lbl10.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_atribuição2.png")));lbligual.setVisible(false);pos10=true;}
				else if(pos12 == false) {lbl12.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_atribuição2.png")));lbligual.setVisible(false);pos12=true;}
			}
		});
		lbligual.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_atribuição2.png")));
		lbligual.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbligual.setBounds(361, 531, 104, 77);
		contentPane.add(lbligual);
		
		JLabel lblPrint = new JLabel("print");
		lblPrint.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(pos1 == false) 		{lbl1.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_print.png")));pos1=true;}
				else if(pos2 == false) 	{lbl2.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_print.png")));pos2=true;}
				else if(pos3 == false) 	{lbl3.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_print.png")));pos3=true;}
				else if(pos4 == false) 	{lbl4.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_print.png")));pos4=true;r4 = true;}
				else if(pos5 == false) 	{lbl5.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_print.png")));pos5=true;}
				else if(pos7 == false) 	{lbl7.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_print.png")));pos7=true;}
				else if(pos8 == false) 	{lbl8.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_print.png")));pos8=true;}
				else if(pos9 == false) 	{lbl9.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_print.png")));lblPrint.setVisible(false);pos9=true;r9 = true;}
				else if(pos10 == false) {lbl10.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_print.png")));pos10=true;}
				else if(pos12 == false) {lbl12.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_print.png")));pos12=true;}
			}
		});
		lblPrint.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_print.png")));
		lblPrint.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPrint.setBounds(141, 531, 104, 77);
		contentPane.add(lblPrint);
		
		JLabel lblparenthesis1 = new JLabel("(");
		lblparenthesis1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(pos1 == false) 		{lbl1.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/parenthesis1_button.png")));pos1=true;}
				else if(pos2 == false) 	{lbl2.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/parenthesis1_button.png")));pos2=true;}
				else if(pos3 == false) 	{lbl3.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/parenthesis1_button.png")));pos3=true;}
				else if(pos4 == false) 	{lbl4.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/parenthesis1_button.png")));pos4=true;}
				else if(pos5 == false) 	{lbl5.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/parenthesis1_button.png")));pos5=true;r5 = true;}
				else if(pos7 == false) 	{lbl7.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/parenthesis1_button.png")));pos7=true;}
				else if(pos8 == false) 	{lbl8.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/parenthesis1_button.png")));pos8=true;}
				else if(pos9 == false) 	{lbl9.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/parenthesis1_button.png")));pos9=true;}
				else if(pos10 == false) {lbl10.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/parenthesis1_button.png")));lblparenthesis1.setVisible(false);pos10=true;r10 = true;}
				else if(pos12 == false) {lbl12.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/parenthesis1_button.png")));pos12=true;}

			}
		});
		lblparenthesis1.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/parenthesis1_button.png")));
		lblparenthesis1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblparenthesis1.setBounds(720, 589, 104, 77);
		contentPane.add(lblparenthesis1);
		
		JLabel lblparenthesis2 = new JLabel(")");
		lblparenthesis2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(pos1 == false) 		{lbl1.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/parenthesis2_button.png")));pos1=true;}
				else if(pos2 == false) 	{lbl2.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/parenthesis2_button.png")));pos2=true;}
				else if(pos3 == false) 	{lbl3.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/parenthesis2_button.png")));pos3=true;}
				else if(pos4 == false) 	{lbl4.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/parenthesis2_button.png")));pos4=true;}
				else if(pos5 == false) 	{lbl5.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/parenthesis2_button.png")));pos5=true;}
				else if(pos7 == false) 	{lbl7.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/parenthesis2_button.png")));pos7=true;r7 = true;}
				else if(pos8 == false) 	{lbl8.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/parenthesis2_button.png")));pos8=true;}
				else if(pos9 == false) 	{lbl9.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/parenthesis2_button.png")));pos9=true;}
				else if(pos10 == false) {lbl10.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/parenthesis2_button.png")));pos10=true;}
				else if(pos12 == false) {lbl12.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/parenthesis2_button.png")));lblparenthesis2.setVisible(false);pos12=true;r12 = true;}
			}
		});
		lblparenthesis2.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/parenthesis2_button.png")));
		lblparenthesis2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblparenthesis2.setBounds(596, 531, 104, 77);
		contentPane.add(lblparenthesis2);
		
		JLabel lblElse = new JLabel("else");
		lblElse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(pos1 == false) 		{lbl1.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_else.png")));lblElse.setVisible(false);pos1=true;r1=true;}
				else if(pos2 == false) 	{lbl2.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_else.png")));lblElse.setVisible(false);pos2=true;}
				else if(pos3 == false) 	{lbl3.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_else.png")));lblElse.setVisible(false);pos3=true;}
				else if(pos4 == false) 	{lbl4.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_else.png")));lblElse.setVisible(false);pos4=true;}
				else if(pos5 == false) 	{lbl5.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_else.png")));lblElse.setVisible(false);pos5=true;}
				else if(pos7 == false) 	{lbl7.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_else.png")));lblElse.setVisible(false);pos7=true;}
				else if(pos8 == false) 	{lbl8.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_else.png")));lblElse.setVisible(false);pos8=true;r8=true;}
				else if(pos9 == false) 	{lbl9.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_else.png")));lblElse.setVisible(false);pos9=true;}
				else if(pos10 == false) {lbl10.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_else.png")));lblElse.setVisible(false);pos10=true;}
				else if(pos12 == false) {lbl12.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_else.png")));lblElse.setVisible(false);pos12=true;}
			}
		});
		lblElse.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_else.png")));
		lblElse.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblElse.setBounds(482, 531, 104, 77);
		contentPane.add(lblElse);
		
		JLabel lblnmeroimpar = new JLabel("\"número ímpar\"");
		lblnmeroimpar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(pos6 == false) {lbl6.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_numero-impar.png")));lblnmeroimpar.setVisible(false);pos6=true;}
				else if(pos11 == false) {lbl11.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_numero-impar.png")));lblnmeroimpar.setVisible(false);pos11=true;r11 = true;}
				
			}
		});
		lblnmeroimpar.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_numero-impar.png")));
		lblnmeroimpar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblnmeroimpar.setBounds(98, 589, 308, 77);
		contentPane.add(lblnmeroimpar);
		
		JLabel lblnmeroPar = new JLabel("\"número par\"");
		lblnmeroPar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(pos6 == false) {lbl6.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_numero-par.png")));lblnmeroPar.setVisible(false);pos6=true;r6 = true;}
				else if(pos11 == false) {lbl11.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_numero-par.png")));lblnmeroPar.setVisible(false);pos11=true;}
				
			}
		});
		lblnmeroPar.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_numero-par.png")));
		lblnmeroPar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblnmeroPar.setBounds(412, 589, 308, 77);
		contentPane.add(lblnmeroPar);
		
		
		
		JLabel lbln2 = new JLabel("  ");
		lbln2.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_2.png")));
		lbln2.setForeground(new Color(255, 0, 0));
		lbln2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbln2.setBounds(411, 139, 104, 77);
		contentPane.add(lbln2);
		
		
		
		JLabel lbln0 = new JLabel("");
		lbln0.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_0.png")));
		lbln0.setForeground(new Color(255, 0, 0));
		lbln0.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbln0.setBounds(620, 139, 104, 77);
		contentPane.add(lbln0);
		
		
		
		JLabel lblsinal1 = new JLabel(":");
		lblsinal1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblsinal1.setBounds(734, 139, 45, 77);
		contentPane.add(lblsinal1);
		
		JLabel lblsinal2 = new JLabel(":");
		lblsinal2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblsinal2.setBounds(201, 305, 45, 77);
		contentPane.add(lblsinal2);
		
		
		
		JTextPane txtpnConstruaUmPrograma = new JTextPane();
		txtpnConstruaUmPrograma.setForeground(new Color(0, 102, 255));
		txtpnConstruaUmPrograma.setBackground(new Color(255, 204, 0));
		txtpnConstruaUmPrograma.setText("Construa um programa usando os blocos abaixo de acordo com o que você aprendeu com as estruturas de decisão.\r\n\r\nO Programa deverá dizer se o valor de X que foi atribuído como 5 será par ou ímpar.");
		txtpnConstruaUmPrograma.setFont(new Font("Consolas", Font.PLAIN, 30));
		txtpnConstruaUmPrograma.setEditable(false);
		txtpnConstruaUmPrograma.setBounds(818, 65, 560, 404);
		contentPane.add(txtpnConstruaUmPrograma);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(r1 && r2 && r3 && r4 && r5 == true) 
				{
					lblResposta.setText("Número Ímpar");
					lblResposta.setForeground(new Color(0, 255, 0));
					lblResposta.setBorder(BorderFactory.createLineBorder(null));
					btnProximo.setEnabled(true);
					btnReiniciar.setEnabled(false);
					btnVerificar.setVisible(false);


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
		btnVerificar.setBackground(new Color(0, 255, 0));
		btnVerificar.setForeground(new Color(255, 255, 255));
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnVerificar.setBounds(248, 471, 224, 61);
		contentPane.add(btnVerificar);
		
		JLabel lblX = new JLabel("");
		lblX.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_x1.png")));
		lblX.setForeground(new Color(255, 0, 0));
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblX.setBounds(226, 79, 104, 61);
		contentPane.add(lblX);
		
		JLabel lblatribuicao = new JLabel("=");
		lblatribuicao.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_atribuição.png")));
		lblatribuicao.setForeground(new Color(128, 128, 128));
		lblatribuicao.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblatribuicao.setBounds(340, 79, 105, 61);
		contentPane.add(lblatribuicao);
		
		JLabel lbln5 = new JLabel("");
		lbln5.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_5.png")));
		lbln5.setForeground(new Color(255, 0, 0));
		lbln5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbln5.setBounds(451, 79, 104, 61);
		contentPane.add(lbln5);
		
	
		
		JLabel lblX2 = new JLabel("");
		lblX2.setIcon(new ImageIcon(Questão2_1.class.getResource("/buttons/button_x1.png")));
		lblX2.setForeground(Color.RED);
		lblX2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblX2.setBounds(203, 147, 104, 61);
		contentPane.add(lblX2);
		
		btnProximo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(prox == true) {
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();
				Questão2_2 q2 = new Questão2_2();
				q2.setVisible(true);
				}
			}
		});
		
	
		
		
		
	
	}
}