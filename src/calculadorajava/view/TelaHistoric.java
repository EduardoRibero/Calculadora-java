package calculadorajava.view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import calculadorajava.repository.Repository;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingConstants;

public class TelaHistoric extends JFrame {
	private JPanel contentPane;
	private Repository jpa = new Repository();
	private ArrayList<String> sqlData = new ArrayList();
	private JLabel lbl = new JLabel();
	
	public TelaHistoric() {
		sqlData = jpa.get();
		setVisible(true);
		setBounds(100, 100, 304, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		JList lista = new JList(sqlData.toArray());
		JScrollPane scrollPane = new JScrollPane(lista);
		contentPane.add(scrollPane);
	}

}
