import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class LogInPage {

	private JFrame frame;
	JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInPage window = new LogInPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogInPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(53, 64, 143));
		frame.getContentPane().setLayout(null);
		
		// yellow panel
		JPanel yellowPanel = new JPanel();
		yellowPanel.setBackground(new Color(255, 212, 28));
		yellowPanel.setBounds(55, 55, 520, 520);
		frame.getContentPane().add(yellowPanel);
		yellowPanel.setLayout(null);
		
		// banner and logo
		JLabel lblBanner = new JLabel("");
		lblBanner.setBounds(0, 40, 520, 195);
		ImageIcon banner = new ImageIcon(this.getClass().getResource("BANNER.png"));
		lblBanner.setIcon(banner);
		yellowPanel.add(lblBanner);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(200, 358, 120, 120);
		ImageIcon logo = new ImageIcon(this.getClass().getResource("NULogo.png"));
		lblLogo.setIcon(logo);
		yellowPanel.add(lblLogo);
		
		// white panel
		JPanel whitePanel = new JPanel();
		whitePanel.setBounds(570, 55, 520, 520);
		frame.getContentPane().add(whitePanel);
		frame.setBounds(100, 100, 1170, 670);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		whitePanel.setLayout(null);
		
		JLabel lblCredentials = new JLabel("Bulldogs Exchange Credentials:");
		lblCredentials.setForeground(new Color(73, 88, 188));
		lblCredentials.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCredentials.setBounds(50, 120, 250, 25);
		whitePanel.add(lblCredentials);
		
		// email textfield
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(new Color(73, 88, 188));
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setLabelFor(txtEmail);
		lblEmail.setBounds(50, 155, 50, 20);
		whitePanel.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setToolTipText("");
		txtEmail.setForeground(new Color(53, 64, 143));
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtEmail.setBounds(130, 150, 300, 30);
		whitePanel.add(txtEmail);
		txtEmail.setColumns(10);
		
		// password field
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(73, 88, 188));
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(50, 205, 80, 19);
		whitePanel.add(lblPassword);
		
		JPasswordField password = new JPasswordField();
		password.setBounds(130, 200, 300, 30);
		whitePanel.add(password);
		
		// log in functionality
		JButton btnLogIn = new JButton("Login with Bulldogs Exchange");
		btnLogIn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String enteredEmail = txtEmail.getText().trim();
		        String enteredPassword = new String(password.getPassword());

		        if (enteredEmail.equals("NUBEadmin@national-u.edu.ph") && enteredPassword.equals("Admin123")) {
		            AdminPage window = new AdminPage();
		            window.adminFrame.setVisible(true);
		        } else {
		            JOptionPane.showMessageDialog(frame, "Invalid email or password. Please try again.", "Login Error", JOptionPane.ERROR_MESSAGE);
		        }
		    }
		});
		btnLogIn.setForeground(Color.WHITE);
		btnLogIn.setBackground(new Color(0, 204, 0));
		btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogIn.setBounds(90, 300, 350, 33);
		whitePanel.add(btnLogIn);
		
		JButton btnPreOrder = new JButton("Pre-Order Uniform");
		btnPreOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				preOrderSelection window = new preOrderSelection();
				window.selectionFrame.setVisible(true);
			}
		});
		btnPreOrder.setForeground(Color.WHITE);
		btnPreOrder.setBackground(new Color(0, 204, 0));
		btnPreOrder.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPreOrder.setBounds(90, 350, 350, 33);
		whitePanel.add(btnPreOrder);
		
		
	}
}
