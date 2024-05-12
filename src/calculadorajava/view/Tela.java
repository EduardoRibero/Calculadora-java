package calculadorajava.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVisor = new JLabel("45324525452");
		lblVisor.setBackground(Color.WHITE);
		lblVisor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVisor.setFont(new Font("Arial", Font.PLAIN, 35));
		lblVisor.setEnabled(false);
		lblVisor.setBounds(0, 11, 353, 105);
		contentPane.add(lblVisor);
		
		JPanel panelNumeros = new JPanel();
		panelNumeros.setBounds(0, 184, 265, 213);
		contentPane.add(panelNumeros);
		panelNumeros.setLayout(new GridLayout(4, 0, 0, 0));
		
		JButton btnSete = new JButton("7");
		panelNumeros.add(btnSete);
		
		JButton btnOito = new JButton("8");
		panelNumeros.add(btnOito);
		
		JButton btnNove = new JButton("9");
		panelNumeros.add(btnNove);
		
		JButton btnQuatro = new JButton("4");
		panelNumeros.add(btnQuatro);
		
		JButton btnCinco = new JButton("5");
		panelNumeros.add(btnCinco);
		
		JButton btnSeis = new JButton("6");
		panelNumeros.add(btnSeis);
		
		JButton btnUm = new JButton("1");
		panelNumeros.add(btnUm);
		
		JButton btnDois = new JButton("2");
		panelNumeros.add(btnDois);
		
		JButton btnTres = new JButton("3");
		panelNumeros.add(btnTres);
		
		JButton btnVirgula = new JButton(",");
		btnVirgula.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNumeros.add(btnVirgula);
		
		JButton btnZero = new JButton("0");
		panelNumeros.add(btnZero);
		
		JButton btnIgual = new JButton("=");
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNumeros.add(btnIgual);
		
		JPanel panelOperacoes = new JPanel();
		panelOperacoes.setBounds(267, 184, 86, 213);
		contentPane.add(panelOperacoes);
		panelOperacoes.setLayout(new GridLayout(4, 0, 0, 0));
		
		JButton btnMultiplicar = new JButton("Ⅹ");
		btnMultiplicar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelOperacoes.add(btnMultiplicar);
		
		JButton btnDividir = new JButton("/");
		btnDividir.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelOperacoes.add(btnDividir);
		
		JButton btnSubtrair = new JButton("-");
		btnSubtrair.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelOperacoes.add(btnSubtrair);
		
		JButton btnSomar = new JButton("+\r\n");
		btnSomar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelOperacoes.add(btnSomar);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBounds(0, 127, 353, 56);
		contentPane.add(panelMenu);
		panelMenu.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnHistorico = new JButton("historic");
		panelMenu.add(btnHistorico);
		
		JButton btnSair = new JButton("Exit");
		panelMenu.add(btnSair);
		
		JButton btnClean = new JButton("clean");
		panelMenu.add(btnClean);
		
		JButton btnDelete = new JButton("delete");
		panelMenu.add(btnDelete);
	}
}
