package hud;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScrollMod1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScrollMod1 frame = new ScrollMod1();
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
	public ScrollMod1() {
		setTitle("Introdução a Python");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1365, 839);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		getMaximumSize();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setExtendedState(MAXIMIZED_BOTH);

		
		JScrollPane scrollPaneTELA4 = new JScrollPane();
		scrollPaneTELA4.setBounds(0, 0, 1553, 753);
		scrollPaneTELA4.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneTELA4.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		getContentPane().add(scrollPaneTELA4);
		
		JTextArea txtrintroduoALinguagem = new JTextArea();
		txtrintroduoALinguagem.setRows(4);
		txtrintroduoALinguagem.setFont(new Font("Monospaced", Font.PLAIN, 16));
		txtrintroduoALinguagem.setEditable(false);
		txtrintroduoALinguagem.setWrapStyleWord(true);
		txtrintroduoALinguagem.setText("1_INTRODUÇÃO                                                                                                                                                                                                        \r\n \r\n\r\nA linguagem python foi criada e desevolvida no final dos ãnos 80 pelo alemão Guido Van Rossum como um passatempo de programação Guido era \r\nfã da serie de comedia The Monty Python's Flaying Circus o que o inspirou no nome da linguagem de programação,\r\nem seu conceito original foi pensado como um interpretador, mas nos dias atuais se tornou uma linguagem universal sendo de sen\r\nso comum em adoção nas mais diferentes areas de aplicação.\r\n\r\n1.2_CARACTERISTICAS\r\n Python e uma linguagem de alto nivel ou seja uma linguagem que se aproxima mais perto possivel da linguagem humana tendo\r\na colocação de linguagens mais faceis de se aprender, outras caracteristicas que ela possui são multiparadigma, suporta banco de\r\ndados e poder suporta interface com usuario e muito mais.\r\n\r\n\r\n1.3_TIPOSE DE DADOS, VARIAVEIS, EXPRESSOES\r\n -Print()\r\nSaida/Exibição de Dados:\r\n A função print(), que, em inglês, significa imprimir, imprime na tela o que estiver entre parênteses utilizaremos sempre que quiser\r\nmos mostrar algo, como uma mensagem ou o resultado de uma operação numérica, etc assim como na matematica em que f(x)\r\nopera em x que esta entre parenteses\r\n-Variaveis:\r\n Qualquer dado que seja manipulado pelo programa deve ficar armazenado na memória principal do computador para que o \r\narmazenamento de dados seja possível, é preciso reservar espaços para isso na memória principal as variáveis e constantes são unidades      \r\nbásicas de armazenamento dos dados em programação Elas são um espaço de memória reservado para armazenar um certo tipo\r\nde dado e possuem um identificador (nome) para referenciar o seu conteúdo.\r\n Podemos dizer que a nomeação de regiões da memoria facilita o nosso trabalho conseguindo fazer a = 5 estar armazenado, em algum\r\nlocal da RAM, enqunto o valor 5 podemos dizer que \"a recebe 5\" nos referindo pela variavel a que foi definida no começo o uso de\r\nvariaveis depende principalmente de sua inteligibilidade e no reuso do código.\r\n\r\nEx.: a = 5\r\nb = 3\r\nprint(a + b)\r\n\r\n-Tipos:\r\n As variáveis têm, além de valores e nomes, tipos onde python possui tipagem dinâmica não precisandoespecificar\r\nos tipos das variáveis, como em outras linguagens\r\nOs tipos são:\r\nTexto: str\r\nNuméricos: int, float, complex\r\nSequência: list, tuple, range\r\nMapeamento: dict\r\nConjuntos: set, frozenset\r\nBooleano: bool\r\nBinários: bytes, bytearray, memoryview\r\n\r\n \r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
		scrollPaneTELA4.setViewportView(txtrintroduoALinguagem);
		
		JButton btnNewButton = new JButton("Voltar para o início");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				HUD skr = new HUD();
				skr.setVisible(true);

				}
		});
		scrollPaneTELA4.setColumnHeaderView(btnNewButton);
		
		
		JScrollPane scrollPaneTELA41 = new JScrollPane();
		scrollPaneTELA41.setBounds(-390, 0, 1114, 725);
		scrollPaneTELA41.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneTELA41.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		getContentPane().add(scrollPaneTELA41);
		scrollPaneTELA41.getMaximumSize();
	
		JPanel tela5Modulo2 = new JPanel();
		tela5Modulo2.setBounds(0, 0, 1202, 725);
		tela5Modulo2.setBackground(new Color(255, 255, 255));
		getContentPane().add(tela5Modulo2);
		tela5Modulo2.setLayout(null);
	}

}
