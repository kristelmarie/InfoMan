import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class preOrderCart {

	JFrame cartFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					preOrderCart window = new preOrderCart();
					window.cartFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public preOrderCart() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		cartFrame = new JFrame();
		cartFrame.getContentPane().setBackground(new Color(53, 64, 143));
		cartFrame.getContentPane().setLayout(null);
		cartFrame.setBounds(100, 100, 1170, 670);
		cartFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblCartBanner = new JLabel("");
		lblCartBanner.setBounds(0, 0, 1170, 120);
		ImageIcon cartBanner = new ImageIcon(this.getClass().getResource("Main Banner.png"));
		lblCartBanner.setIcon(cartBanner);
		cartFrame.getContentPane().add(lblCartBanner);
		
		
	}

}
