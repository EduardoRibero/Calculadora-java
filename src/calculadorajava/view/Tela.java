package calculadorajava.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import calculadorajava.controller.Controller;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;

public class Tela extends JFrame implements ActionListener {

	private String operacao;
	private String value1;
	private String value2;
	private String res;
	private JPanel contentPane;
	private JButton btnUm = new JButton("1");
	private JButton btnDois = new JButton("2");
	private JButton btnTres = new JButton("3");
	private JButton btnQuatro = new JButton("4");
	private JButton btnCinco = new JButton("5");
	private JButton btnSeis = new JButton("6");
	private JButton btnSete = new JButton("7");
	private JButton btnOito = new JButton("8");
	private JButton btnNove = new JButton("9");
	private JButton btnZero = new JButton("0");
	private JLabel lblVisor = new JLabel("0");
	private JButton btnVirgula = new JButton(",");
	private JButton btnDelete = new JButton("delete");
	private JButton btnIgual = new JButton("=");
	private JButton btnMultiplicar = new JButton("Ⅹ");
	private JButton btnClean = new JButton("clean");
	private JButton btnExit = new JButton("Exit");
	private JButton btnHistoric = new JButton("historic");
	private JButton btnSomar = new JButton("+\r\n");
	private JButton btnSubtrair = new JButton("-");
	private JButton btnDividir = new JButton("/");
	private Controller controller = new Controller();


	public Tela() {
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		panelNumeros.add(btnSete);
		
		panelNumeros.add(btnOito);
		
		panelNumeros.add(btnNove);
		
		panelNumeros.add(btnQuatro);
		
		panelNumeros.add(btnCinco);
		
		panelNumeros.add(btnSeis);
		
		panelNumeros.add(btnUm);
		
		panelNumeros.add(btnDois);
		
		panelNumeros.add(btnTres);
		
		btnVirgula.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNumeros.add(btnVirgula);
		
		panelNumeros.add(btnZero);
		
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNumeros.add(btnIgual);
		
		JPanel panelOperacoes = new JPanel();
		panelOperacoes.setBounds(267, 184, 86, 213);
		contentPane.add(panelOperacoes);
		panelOperacoes.setLayout(new GridLayout(4, 0, 0, 0));
		
		btnMultiplicar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelOperacoes.add(btnMultiplicar);
		
		btnDividir.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelOperacoes.add(btnDividir);
		
		btnSubtrair.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelOperacoes.add(btnSubtrair);
		
		btnSomar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelOperacoes.add(btnSomar);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBounds(0, 127, 353, 56);
		contentPane.add(panelMenu);
		panelMenu.setLayout(new GridLayout(1, 0, 0, 0));
		
		panelMenu.add(btnHistoric);
		
		panelMenu.add(btnExit);
		
		panelMenu.add(btnClean);
		
		panelMenu.add(btnDelete);
		
		 btnUm.addActionListener(this);
	     btnDois.addActionListener(this);
	     btnTres.addActionListener(this);
	     btnQuatro.addActionListener(this);
	     btnCinco.addActionListener(this);
	     btnSeis.addActionListener(this);
	     btnSete.addActionListener(this);
	     btnOito.addActionListener(this);
	     btnNove.addActionListener(this);
	     btnZero.addActionListener(this);
	     
	     btnSomar.addActionListener(this);
	     btnDividir.addActionListener(this);
	     btnSubtrair.addActionListener(this);
	     btnMultiplicar.addActionListener(this);
	     
	     btnHistoric.addActionListener(this);
	     btnExit.addActionListener(this);
	     btnClean.addActionListener(this);
	     btnDelete.addActionListener(this);
	     btnVirgula.addActionListener(this);
	     btnIgual.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnUm) {
			if(lblVisor.getText().equals("0") || lblVisor.getText() == null) {
				lblVisor.setText("1");
			}else {
				lblVisor.setText(lblVisor.getText() + "1");
			}
		}
		if(e.getSource() == btnDois) {
			if(lblVisor.getText().equals("0") || lblVisor.getText() == null) {
				lblVisor.setText("2");
			}else {
				lblVisor.setText(lblVisor.getText() + "2");
			}
		}
		if(e.getSource() == btnTres) {
			if(lblVisor.getText().equals("0") || lblVisor.getText() == null) {
				lblVisor.setText("3");
			}else {
				lblVisor.setText(lblVisor.getText() + "3");
			}
		}
		if(e.getSource() == btnQuatro) {
			if(lblVisor.getText().equals("0") || lblVisor.getText() == null) {
				lblVisor.setText("4");
			}else {
				lblVisor.setText(lblVisor.getText() + "4");
			}
		}
		if(e.getSource() == btnCinco) {
			if(lblVisor.getText().equals("0") || lblVisor.getText() == null) {
				lblVisor.setText("5");
			}else {
				lblVisor.setText(lblVisor.getText() + "5");
			}
		}
		if(e.getSource() == btnSeis) {
			if(lblVisor.getText().equals("0") || lblVisor.getText() == null) {
				lblVisor.setText("6");
			}else {
				lblVisor.setText(lblVisor.getText() + "6");
			}
		}
		if(e.getSource() == btnSete) {
			if(lblVisor.getText().equals("0") || lblVisor.getText() == null) {
				lblVisor.setText("7");
			}else {
				lblVisor.setText(lblVisor.getText() + "7");
			}
		}
		if(e.getSource() == btnOito) {
			if(lblVisor.getText().equals("0") || lblVisor.getText() == null) {
				lblVisor.setText("8");
			}else {
				lblVisor.setText(lblVisor.getText() + "8");
			}
		}
		if(e.getSource() == btnNove) {
			if(lblVisor.getText().equals("0") || lblVisor.getText() == null) {
				lblVisor.setText("9");
			}else {
				lblVisor.setText(lblVisor.getText() + "9");
			}
		}
		if(e.getSource() == btnZero) {
			if(lblVisor.getText().equals("0") || lblVisor.getText() == null) {
				lblVisor.setText("0");
			}else {
				lblVisor.setText(lblVisor.getText() + "0");
			}
		}
		if(e.getSource() == btnVirgula) {
			if(lblVisor.getText().equals("0") || lblVisor.getText() == null || lblVisor.getText().contains(",") == true) {
				
			}else {
				lblVisor.setText(lblVisor.getText() + ",");
			}
		}
		if(e.getSource() == btnClean) {
			lblVisor.setText("0");
		}
		if(e.getSource() == btnExit) {
			System.exit(0);
		}
		if(e.getSource() == btnDelete) {
			if(lblVisor.getText() != null && !(lblVisor.getText().length() <= 0) && lblVisor.getText() != "0") {
				String str = lblVisor.getText();
				str = str.substring(0,str.length() - 1);
				lblVisor.setText(str);
			}
		}
		if(e.getSource() == btnSomar) {
			if(lblVisor.getText() != null) {				
				value1 = lblVisor.getText();
				operacao = "soma";
				lblVisor.setText("0");
			}
		}
		if(e.getSource() == btnSubtrair) {
			if(lblVisor.getText() != null) {				
				value1 = lblVisor.getText();
				operacao = "subtrair";
				lblVisor.setText("0");
			}
		}
		if(e.getSource() == btnMultiplicar) {
			if(lblVisor.getText() != null) {				
				value1 = lblVisor.getText();
				operacao = "multiplicar";
				lblVisor.setText("0");
			}
		}
		if(e.getSource() == btnDividir) {
			if(lblVisor.getText() != null) {				
				value1 = lblVisor.getText();
				operacao = "dividir";
				lblVisor.setText("0");
			}
		}
		if(e.getSource() == btnIgual) {
			if(lblVisor.getText() != null) {				
				value2 = lblVisor.getText();
				res = controller.operacao(value1, operacao, value2);
				lblVisor.setText(res);
			}
		}
	}

}
