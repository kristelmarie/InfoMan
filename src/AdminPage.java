import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AdminPage {

	JFrame adminFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage window = new AdminPage();
					window.adminFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		adminFrame = new JFrame();
		adminFrame.getContentPane().setBackground(new Color(53, 64, 143));
		adminFrame.getContentPane().setLayout(null);
		adminFrame.setBounds(100, 100, 1170, 670);
		adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblAdminBanner = new JLabel("");
		lblAdminBanner.setBounds(0, 0, 1170, 120);
		ImageIcon adminBanner = new ImageIcon(this.getClass().getResource("Main Banner.png"));
		lblAdminBanner.setIcon(adminBanner);
		adminFrame.getContentPane().add(lblAdminBanner);

		
		
		
		
	}

}
