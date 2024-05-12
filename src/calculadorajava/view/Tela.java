package calculadorajava.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

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
		lblVisor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVisor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblVisor.setEnabled(false);
		lblVisor.setBounds(0, 0, 164, 33);
		contentPane.add(lblVisor);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 44, 35, 40);
		contentPane.add(panel);
	}
}
