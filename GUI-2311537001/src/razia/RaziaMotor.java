package razia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class RaziaMotor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNama;
	private JTextField textUmur;
	JComboBox CBSIM;
	JLabel lblinfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RaziaMotor frame = new RaziaMotor();
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
	public RaziaMotor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 218, 247));
		contentPane.setForeground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nama:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel.setBounds(21, 42, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Umur:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(21, 69, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textNama = new JTextField();
		textNama.setBounds(58, 39, 213, 20);
		contentPane.add(textNama);
		textNama.setColumns(10);
		
		textUmur = new JTextField();
		textUmur.setBounds(57, 66, 46, 20);
		contentPane.add(textUmur);
		textUmur.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Aplikasi Razia Motor Online");
		lblNewLabel_2.setForeground(new Color(70, 49, 142));
		lblNewLabel_2.setFont(new Font("Al Bayan", Font.BOLD, 14));
		lblNewLabel_2.setBounds(130, 6, 202, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("SIM C");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(21, 100, 30, 14);
		contentPane.add(lblNewLabel_3);
		
		JComboBox CBSIM = new JComboBox();
		CBSIM.setForeground(new Color(70, 49, 142));
		CBSIM.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		CBSIM.setModel(new DefaultComboBoxModel(new String[] {"Ya", "Tidak"}));
		CBSIM.setBounds(58, 94, 89, 22);
		contentPane.add(CBSIM);
		
		JLabel lblinfo = new JLabel("");
		lblinfo.setBounds(58, 134, 319, 30);
		contentPane.add(lblinfo);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.setForeground(new Color(70, 49, 142));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = textNama.getText();
				int a = Integer.parseInt(textUmur.getText());
				String b = CBSIM.getSelectedItem().toString();
				if ((a >= 17) && (b.equals("Ya"))) {
					lblinfo.setText("<html>" +n+", Anda sudah dewasa dan boleh mengemudi </html>");

				} 
				else if ((a >= 17) && (!b.equals("Ya"))){
					lblinfo.setText("<html>" +n+", Anda sudah dewasa tetapi belum boleh mengemudi</html>");
				}
				else if ((a <= 17) && (b.equals("Ya"))) {
					lblinfo.setText("<html>" +n+", Anda belum cukup umur untuk bawa motor</html>");
				}
				else  {
					lblinfo.setText("<html>" +n+", Anda belum cukup umur untuk punya SIM</html>");
			}
			}});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(81, 175, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNama.setText("");
				textUmur.setText("");
				CBSIM.setSelectedIndex(0);
				lblinfo.setText("");
			}
		});
		btnReset.setForeground(new Color(70, 49, 142));
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnReset.setBounds(275, 175, 89, 23);
		contentPane.add(btnReset);
		
		
	}
}