import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class preOrderSelection {

	JFrame selectionFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					preOrderSelection window = new preOrderSelection();
					window.selectionFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public preOrderSelection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		selectionFrame = new JFrame();
		selectionFrame.getContentPane().setBackground(new Color(53, 64, 143));
		selectionFrame.getContentPane().setLayout(null);
		selectionFrame.setBounds(100, 100, 1170, 670);
		selectionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblSelectionBanner = new JLabel("");
		lblSelectionBanner.setBounds(0, 0, 1170, 120);
		ImageIcon selectionBanner = new ImageIcon(this.getClass().getResource("Main Banner.png"));
		lblSelectionBanner.setIcon(selectionBanner);
		selectionFrame.getContentPane().add(lblSelectionBanner);
		
		// trad blouse
		JCheckBox cboxUnif001 = new JCheckBox("");
		cboxUnif001.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cboxUnif001.setBounds(20, 140, 20, 20);
		selectionFrame.getContentPane().add(cboxUnif001);
		
		JLabel lblUnif001 = new JLabel("Traditional Uniform Blouse");
		lblUnif001.setForeground(new Color(255, 255, 255));
		lblUnif001.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUnif001.setBounds(50, 142, 170, 15);
		selectionFrame.getContentPane().add(lblUnif001);
		
		JLabel lblProductId001 = new JLabel("NUBEUNIF001");
		lblProductId001.setForeground(new Color(255, 255, 255));
		lblProductId001.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblProductId001.setBounds(90, 155, 80, 14);
		selectionFrame.getContentPane().add(lblProductId001);
		
		JLabel lblPrice001 = new JLabel("₱560");
		lblPrice001.setForeground(new Color(255, 255, 255));
		lblPrice001.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrice001.setBounds(230, 142, 35, 14);
		selectionFrame.getContentPane().add(lblPrice001);
		
		JComboBox cBoxSize001 = new JComboBox();
		cBoxSize001.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
		cBoxSize001.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cBoxSize001.setBounds(280, 142, 40, 20);
		selectionFrame.getContentPane().add(cBoxSize001);
		
		JComboBox cBoxQuantity001 = new JComboBox();
		cBoxQuantity001.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		cBoxQuantity001.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cBoxQuantity001.setBounds(330, 142, 40, 20);
		selectionFrame.getContentPane().add(cBoxQuantity001);
		
		// trad polo
		
		
		
		
		
	}
}
