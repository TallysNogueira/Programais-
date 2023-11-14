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

public class ScrollMod2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScrollMod2 frame = new ScrollMod2();
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
	public ScrollMod2() {
		setTitle("Estruturas de decisão");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1365, 839);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		getMaximumSize();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setExtendedState(MAXIMIZED_BOTH);
		
		
		
		JPanel tela5Modulo2 = new JPanel();
		tela5Modulo2.setBackground(new Color(255, 255, 255));
		tela5Modulo2.setBounds(0, 0, 1570, 802);
		getContentPane().add(tela5Modulo2);
		tela5Modulo2.setLayout(null);
		
		JScrollPane scrollPaneTELA5 = new JScrollPane();
		scrollPaneTELA5.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneTELA5.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPaneTELA5.setBounds(0, 0, 1543, 792);
		tela5Modulo2.add(scrollPaneTELA5);
		
		JTextArea txtrFFFTELA5 = new JTextArea();
		txtrFFFTELA5.setFont(new Font("Monospaced", Font.PLAIN, 18));
		txtrFFFTELA5.setText("2_ ESTRUTURAÇÃO PYTHON                                                                                                                                                                            !\r\n As estruturas de controle permitem selecionar quais partes do código (chamadas de estruturas de decisão) serão executadas e\r\nrepetir blocos de instruções com base em algum critério, como uma variável de controle ou a validade de alguma condição\r\n(denominadas estruturas de repetição) neste módulo, vamos conhecer as estruturas de decisão e de repetição em Python.\r\n As estruturas  de decisão e de repetição possuem sintaxes bastante semelhantes em C e em Python mesmo com essa grande se\r\n-melhança existe uma diferença crítica no tratamento das condições, diferentemente da linguagem c python oferece o tipo bool\r\npor isso cabe ressaltar a diferença de comportamento das duas linguagens nesse tratamento\r\n\r\n2.2_ESTRUTURAS DE DECISÃO\r\n Em python uma das estruturas de decisão que e possivel utilizar são\" if \", \"if-else\" e \"else\" (curiosidade e possivel \r\nutilizar essas estruduras da mesma na forma linguagem c), if nada mais e nada menos que o nosso \"se\" podemos entendê-lo da \r\nseguinte forma caso a condi -ção seja verdadeira faça a ação.\r\nex: a = 33\r\nb = 200\r\nif b>a:\r\n  print(\"b e maior que a\")\r\n\r\n Quando temos um cenário onde uma condição é simplesmente a negação da primeira, podemos usar uma forma de para sim\r\n-plificar os programas essa forma é a comando else, que significa \"caso contrário\".\r\nex: pc = \"linux\"\r\nif pc == \"linux\":\r\nprint(\"Eh Linux!\" )\r\nelse: print(\"não eh linux...\")\r\r\n\r\n O bloco else if ou elif e a combinação dos dois blocos fazendo duas condições por exemplo se determinada condição não for ver\r\n-dadeira faça imprimir a  dizendo mensagem que falsa.\r\nex:\r\ncategoria = int(input(\"Digite a categoria do produto\"))\r\nif categoria == 1:\r\npreco = 10\r\nelif categoria == 2:\r\npreco = 20\r\nelif categoria == 3:\r\npreco = 30\r\nelif categoria == 4:\r\npreco = 40\r\nelse:\r\npreco = 50\r\nprint(\"Preco = %d\" % preco)\r\n\r\n \r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
		scrollPaneTELA5.setViewportView(txtrFFFTELA5);
		
		
		JButton btnNewButton = new JButton("Voltar para o início");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				HUD skr = new HUD();
				skr.setVisible(true);

				}
		});
		scrollPaneTELA5.setColumnHeaderView(btnNewButton);
	}

}
