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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 180, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVisor = new JLabel("0");
		lblVisor.setBackground(Color.GREEN);
		lblVisor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVisor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblVisor.setEnabled(false);
		lblVisor.setBounds(0, 0, 164, 33);
		contentPane.add(lblVisor);
		
		JPanel panelNumeros = new JPanel();
		panelNumeros.setBounds(0, 91, 116, 159);
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
		
		JButton btncinco = new JButton("5");
		panelNumeros.add(btncinco);
		
		JButton btnSeis = new JButton("6");
		panelNumeros.add(btnSeis);
		
		JButton btnUm = new JButton("1");
		panelNumeros.add(btnUm);
		
		JButton btnDois = new JButton("2");
		panelNumeros.add(btnDois);
		
		JButton btnTres = new JButton("3");
		panelNumeros.add(btnTres);
		
		JButton btnVirgula = new JButton(",");
		panelNumeros.add(btnVirgula);
		
		JButton btnZero = new JButton("0");
		panelNumeros.add(btnZero);
		
		JButton btnIgual = new JButton("=");
		btnIgual.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		panelNumeros.add(btnIgual);
		
		JPanel panelOperações = new JPanel();
		panelOperações.setBounds(126, 91, 38, 159);
		contentPane.add(panelOperações);
		panelOperações.setLayout(new GridLayout(4, 0, 0, 0));
		
		JButton btnMultiplicar = new JButton("x");
		panelOperações.add(btnMultiplicar);
		
		JButton btnDividir = new JButton("/");
		panelOperações.add(btnDividir);
		
		JButton btnSubtrair = new JButton("-");
		panelOperações.add(btnSubtrair);
		
		JButton btnSomar = new JButton("+");
		btnSomar.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		panelOperações.add(btnSomar);
	}
}
