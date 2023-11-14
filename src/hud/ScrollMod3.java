package hud;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScrollMod3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScrollMod3 frame = new ScrollMod3();
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
	public ScrollMod3() {
		setTitle("Estruturas de repetição");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1365, 839);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		getMaximumSize();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setExtendedState(MAXIMIZED_BOTH);
		
		
		JPanel tela6Modulo3 = new JPanel();
		tela6Modulo3.setBackground(new Color(255, 255, 255));
		tela6Modulo3.setBounds(0, 0, 1635, 792);
		getContentPane().add(tela6Modulo3);
		tela6Modulo3.setLayout(null);
		
		JScrollPane scrollPaneTELA6 = new JScrollPane();
		scrollPaneTELA6.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneTELA6.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPaneTELA6.setBounds(0, 0, 1555, 763);
		tela6Modulo3.add(scrollPaneTELA6);
		
		JTextArea textAreaTELA6 = new JTextArea();
		textAreaTELA6.setFont(new Font("Monospaced", Font.PLAIN, 20));
		textAreaTELA6.setEditable(false);
		textAreaTELA6.setText("3_ ESTRUTURAÇÃO DE REPETIÇÃO                                                                                                                                                                         !\r\n Em estruturas de repetição como os blocos \"for\" e \"while\" são casos do tipo se tal \r\ncondição permaneçer verdadeira o processo sera\r\nrepitido definido ou indefinidamente.  O bloco for que na tradução fica para \"para\" ira ter a função de por exemplo dizer que \r\nessa condição ira se considerada legitima sua estrutura sera repetida.\r\n\r\nex:\r\nfor x in range(1, 10):\r\nprint(x)\r\n\r\n Ja o bloco while que na tradução fica para \"enquanto\" tem a funçao de dizer que quando tal condição receber o valor especifico\r\nela inicia seu ciclo se não receber não inicia o ciclo");
		scrollPaneTELA6.setViewportView(textAreaTELA6);
		
		JButton btnNewButton = new JButton("Voltar para o início");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				HUD skr = new HUD();
				skr.setVisible(true);
				}
		});
		scrollPaneTELA6.setColumnHeaderView(btnNewButton);
	}

}
