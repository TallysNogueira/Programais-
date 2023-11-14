package hud;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import questões.Questão1_1;
import questões.Questão2_1;
import questões.Questão3_1;

public class HUD extends JFrame {

	private JPanel contentPane;
	Questão1_1 q1 = new Questão1_1();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HUD frame = new HUD();
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
	public HUD() {
		setTitle("Programais+");
		setBounds(0, 0, 755, 438);
		setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		
		JTextPane JtextpaneTELA3 = new JTextPane();
		JtextpaneTELA3.setContentType("text/\r\nplain");
		JtextpaneTELA3.setBackground(new Color(240, 240, 240));
		JtextpaneTELA3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		JtextpaneTELA3.setEditable(false);
		JtextpaneTELA3.setText("Olá lhe dou boas vindas ao Programais+ nesta seção você irá acessar seu material didático e dará o início e fim de seu curso, para verficar os módulos vá para o menu acima e selecione o módulo que deseja.");
		JtextpaneTELA3.setBounds(18, 105, 705, 179);
		getContentPane().add(JtextpaneTELA3);
		
		
		JMenuBar menuBar_1TELA3 = new JMenuBar();
		menuBar_1TELA3.setForeground(new Color(192, 192, 192));
		menuBar_1TELA3.setBackground(new Color(192, 192, 192));
		menuBar_1TELA3.setBounds(0, 0, 741, 22);
		getContentPane().add(menuBar_1TELA3);
		
		
		JMenu Modulo1 = new JMenu("Modulo1");
		Modulo1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Modulo1.setBackground(new Color(255, 255, 255));
		Modulo1.setForeground(new Color(0, 0, 255));
		menuBar_1TELA3.add(Modulo1);
		
		JMenuItem modulo1cap1 = new JMenuItem("Capitulo 1 - 1");
		modulo1cap1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ScrollMod1 scr1 = new ScrollMod1();
				scr1.setVisible(true);
				
			}
		});
		Modulo1.add(modulo1cap1);
		
		JMenuItem questoes = new JMenuItem("Questões");
		questoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Questão1_1 q1 = new Questão1_1();
				q1.setVisible(true);
				
				
			}
		});
		Modulo1.add(questoes);
		
		JMenu mnNewMenu_1 = new JMenu("Modulo2");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		mnNewMenu_1.setForeground(new Color(255, 128, 64));
		menuBar_1TELA3.add(mnNewMenu_1);
		
		JMenuItem modulo2cap1 = new JMenuItem("Capitulo 2 - 1");
		modulo2cap1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ScrollMod2 scr2 = new ScrollMod2();
				scr2.setVisible(true);
			}
		});
		mnNewMenu_1.add(modulo2cap1);
		
		
		JMenuItem questoes2 = new JMenuItem("Questões");
		questoes2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Questão2_1 q2 = new Questão2_1();
				q2.setVisible(true);
			}
		});
		mnNewMenu_1.add(questoes2);

		
		JMenu modulo3 = new JMenu("Modulo3");
		modulo3.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		modulo3.setForeground(new Color(0, 0, 255));
		menuBar_1TELA3.add(modulo3);
		
		
		
		JMenuItem modulo3cap1 = new JMenuItem("Capitulo 3 - 1");
		modulo3cap1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ScrollMod3 scr3 = new ScrollMod3();
				scr3.setVisible(true);
			}
			
		});
		modulo3.add(modulo3cap1);
		
		JMenuItem questoes3 = new JMenuItem("Questões");
		questoes3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Questão3_1 q3 = new Questão3_1();
				q3.setVisible(true);
			}
		});
		modulo3.add(questoes3);
	
	}

}
