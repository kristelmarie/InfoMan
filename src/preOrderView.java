import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class preOrderView {

	JFrame viewOrderFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					preOrderView window = new preOrderView();
					window.viewOrderFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public preOrderView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		viewOrderFrame = new JFrame();
		viewOrderFrame.getContentPane().setBackground(new Color(53, 64, 143));
		viewOrderFrame.setBounds(100, 100, 1170, 670);
		viewOrderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewOrderFrame.getContentPane().setLayout(null);
		
		JLabel lblViewOrderBanner = new JLabel("");
		lblViewOrderBanner.setBounds(0, 0, 1170, 120);
		ImageIcon viewOrderBanner = new ImageIcon(this.getClass().getResource("Main Banner.png"));
		lblViewOrderBanner.setIcon(viewOrderBanner);
		viewOrderFrame.getContentPane().add(lblViewOrderBanner);
		
		JLabel lblSubmitted = new JLabel("Your order has been submitted!");
		lblSubmitted.setForeground(new Color(255, 212, 28));
		lblSubmitted.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblSubmitted.setBounds(345, 300, 480, 100);
		viewOrderFrame.getContentPane().add(lblSubmitted);
		
		// view order button
		JButton btnViewOrder = new JButton("View Order");
		btnViewOrder.setBackground(new Color(255, 255, 255));
		btnViewOrder.setForeground(new Color(53, 64, 143));
		btnViewOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				preOrderStudentView window = new preOrderStudentView();
				window.studentViewFrame.setVisible(true);
			}
		});
		btnViewOrder.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnViewOrder.setBounds(510, 400, 150, 40);
		viewOrderFrame.getContentPane().add(btnViewOrder);
		
	
	}

}
